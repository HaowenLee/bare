package com.haowen.bare.parse.parser;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 美拍解析器
 */
@Component
public class MeiPaiParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://www.ixigua.com/";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResult parse(String url) throws IOException {

        // 获取分享资源信息
        Document document = Jsoup
                .connect(url)
                .userAgent(UserAgentUtil.getPC())
                .ignoreContentType(true)
                .get();

        String jsonStr = document.getElementById("SSR_HYDRATED_DATA").html()
                .replace("window._SSR_HYDRATED_DATA=", "")
                .replace("undefined", "null");

        JSONObject result = JSONUtil.parseObj(jsonStr)
                .getJSONObject("anyVideo")
                .getJSONObject("gidInformation")
                .getJSONObject("packerData")
                .getJSONObject("video");

        String video = (String) result.getJSONObject("videoResource")
                .getJSONObject("dash")
                .getJSONObject("dynamic_video")
                .getJSONArray("dynamic_video_list")
                .getJSONObject(2)
                .getObj("main_url");

        video = Base64.decodeStr(video);


        List<String> list = new ArrayList<>();
        list.add(video);

//        return new BareResult(list);
        return null;
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public String getItemId(String url) {
        int start = url.indexOf("ixigua.com/") + "ixigua.com/".length();
        int end = url.lastIndexOf("?");
        return url.substring(start, end);
    }
}
