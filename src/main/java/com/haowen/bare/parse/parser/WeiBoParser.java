package com.haowen.bare.parse.parser;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.json.JSONUtil;
import com.google.common.collect.Maps;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微博解析
 */
@Component
public class WeiBoParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://video.h5.weibo.cn/s/video/object";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getOne();

        String realUrl = UrlUtil.getRealUrl(userAgent, url);

        String[] split = realUrl.split("/");

        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("object_id", split[split.length - 2]);
        paramMap.put("mid", split[split.length - 1]);
        String paramStr = URLUtil.buildQuery(paramMap, StandardCharsets.UTF_8);


        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + "?" + paramStr)
                .header("User-Agent", userAgent)
                .ignoreContentType(true)
                .execute()
                .body();

        // 解析无水印资源
        String videoUrl = (String) JSONUtil
                .parseObj(jsonStr)
                .getJSONObject("data")
                .getJSONObject("object")
                .getJSONObject("stream")
                .getObj("url");

        List<String> list = new ArrayList<>();
        list.add(videoUrl);

        return new BareResResult(list);
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public String getItemId(String url) {
        return StringUtil.getQueryParams(url).get("id").get(0);
    }
}
