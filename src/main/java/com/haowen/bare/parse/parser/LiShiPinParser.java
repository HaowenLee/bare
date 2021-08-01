package com.haowen.bare.parse.parser;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 梨视频解析器
 */
@Component
public class LiShiPinParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://www.pearvideo.com/videoStatus.jsp";

    /**
     * 方法描述: 获取无水印资源信息
     *
     * @param url 复制的链接
     * @return 无水印资源信息
     */
    @Override
    public BareResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getOne();
        String realUrl = UrlUtil.getRealUrl(userAgent, url);
        String[] split = realUrl.split("\\?")[0].split("/");

        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("contId", split[split.length - 1].split("_")[1]);
        paramMap.put("mrd", String.valueOf(RandomUtil.randomDouble()));
        String paramStr = URLUtil.buildQuery(paramMap, StandardCharsets.UTF_8);

        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + "?" + paramStr)
                .header("User-Agent", userAgent)
                .header("Referer", realUrl)
                .ignoreContentType(true)
                .execute()
                .body();

        // 解析无水印资源
        String videoUrl = (String) JSONUtil.parseObj(jsonStr)
                .getJSONObject("videoInfo")
                .getJSONObject("videos")
                .getObj("srcUrl");

        List<String> urlList = new ArrayList<>();
        urlList.add(videoUrl);

//        return new BareResult(urlList);
        return null;
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public String getItemId(String url) {
        int start = url.indexOf("/video/") + "/video/".length();
        int end = url.lastIndexOf("/");
        return url.substring(start, end);
    }
}
