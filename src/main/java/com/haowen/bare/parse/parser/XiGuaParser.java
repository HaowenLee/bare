package com.haowen.bare.parse.parser;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 西瓜解析器
 */
@Component
public class XiGuaParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://www.ixigua.com/";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getPC();

        String realUrl = UrlUtil.getRealUrl(userAgent, url);
        String itemId = getItemId(realUrl);

        // 获取分享资源信息
        Document document = Jsoup
                .connect(API + itemId)
                .header("User-Agent", userAgent)
                .header("cookie", "MONITOR_WEB_ID=7892c49b-296e-4499-8704-e47c1b150c18; ixigua-a-s=1; ttcid=" +
                        "af99669b6304453480454f150701d5c226; BD_REF=1; __ac_nonce=060d88ff000a75e8d17eb; " +
                        "__ac_signature=_02B4Z6wo00f01kX9ZpgAAIDAKIBBQUIPYT5F2WIAAPG2ad; " +
                        "ttwid=1%7CcIsVF_3vqSIk4XErhPB0H2VaTxT0tdsTMRbMjrJOPN8%7C1624806049%7C08ce7dd6f7d20506a41ba0a" +
                        "331ef96a6505d96731e6ad9f6c8c709f53f227ab1")
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
