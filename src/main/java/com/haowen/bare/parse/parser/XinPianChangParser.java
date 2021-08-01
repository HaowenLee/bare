package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.parse.enums.MediaType;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 新片场解析
 */
@Component
public class XinPianChangParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://app.xinpianchang.com/article/";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getOne();
        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + getItemId(UrlUtil.getRealUrl(userAgent, url)))
                .header("User-Agent", userAgent)
                .ignoreContentType(true)
                .execute()
                .body();

        // 解析无水印资源
        String videoUrl = (String) JSONUtil
                .parseObj(jsonStr)
                .getJSONObject("data")
                .getJSONObject("video")
                .getJSONObject("content")
                .getJSONArray("progressive")
                .getJSONObject(2)
                .getObj("url");

        // 构建结果
        BareResult result = new BareResult();
        result.setType(MediaType.VIDEO);
        List<BareResult.Video> videos = new ArrayList<>();
        result.setVideos(videos);
        BareResult.Video videoResult = new BareResult.Video(videoUrl, null);
        videos.add(videoResult);

        return result;
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
