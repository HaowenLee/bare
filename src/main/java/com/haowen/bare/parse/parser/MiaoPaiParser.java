package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 秒拍解析器
 */
@Component
public class MiaoPaiParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://v5-api.miaopai.com/media/media/info";

    /**
     * 方法描述: 获取无水印资源信息
     *
     * @param url 复制的链接
     * @return 无水印资源信息
     */
    @Override
    public BareResult parse(String url) throws IOException {

        // 获取分享资源信息
        Document document = Jsoup
                .connect(url)
                .userAgent(UserAgentUtil.getOne())
                .get();

        Elements video = document.getElementsByTag("video");

        // 解析无水印资源
        String videoUrl = (String) JSONUtil.parseObj("jsonStr")
                .getJSONObject("data")
                .getJSONObject("video")
                .getJSONArray("playUrl")
                .getJSONObject(0)
                .getObj("playUrl");

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
        int start = url.indexOf("/media/") + "/media/".length();
        return url.substring(start);
    }
}
