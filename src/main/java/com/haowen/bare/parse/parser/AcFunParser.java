package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * AcFun解析器
 */
@Component
public class AcFunParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://www.acfun.cn/";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        // 获取分享资源信息
        String html = Jsoup
                .connect(url)
                .header("User-Agent", UserAgentUtil.getPC())
                .ignoreContentType(true)
                .execute()
                .body();

        String jsonStr = filter(html)
                .replace("window.videoInfo = ", "")
                .replace(";", "");


        String playJson = (String) JSONUtil.parseObj(jsonStr)
                .getJSONObject("currentVideoInfo")
                .getObj("ksPlayJson");

        String video = (String) JSONUtil.parseObj(playJson)
                .getJSONArray("adaptationSet")
                .getJSONObject(0)
                .getJSONArray("representation")
                .getJSONObject(0)
                .getObj("url");

        List<String> list = new ArrayList<>();
        list.add(video);

        return new BareResResult(list);
    }

    /**
     * 方法描述: 过滤网页内容的视频信息
     *
     * @param html 网页内容
     */
    public static String filter(String html) {
        // 匹配网址
        String regex = "window.videoInfo\\s=\\s(.*?);";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(html);
        if (m.find()) {
            return html.substring(m.start(), m.end());
        }
        return "";
    }
}
