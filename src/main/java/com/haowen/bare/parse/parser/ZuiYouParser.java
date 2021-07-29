package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 最右解析器
 */
@Component
public class ZuiYouParser implements BareParser {

    /**
     * 方法描述:短视频解析
     *
     * @param url 链接地址
     */
    @Override
    public BareResResult parse(String url) throws IOException {
        Document document = Jsoup
                .connect(url)
                .header("User-Agent", UserAgentUtil.getOne())
                .get();

        Element element = document.getElementById("appState");

        String filter = element.html()
                .replace("window.APP_INITIAL_STATE=", "")
                .replace("new Date(", "")
                .replace(")", "");

        JSONObject jsonObject = JSONUtil.parseObj(filter)
                .getJSONObject("sharePost")
                .getJSONObject("postDetail")
                .getJSONObject("post")
                .getJSONObject("videos");

        String thumb = "";
        for (String key : jsonObject.keySet()) {
            thumb = key;
        }
        String videoUrl = (String) jsonObject.getJSONObject(thumb)
                .getObj("url");

        List<String> urlList = new ArrayList<>();
        urlList.add(videoUrl);

        return new BareResResult(urlList);
    }
}
