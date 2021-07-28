package com.haowen.bare.service;

import cn.hutool.core.lang.Assert;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.vo.WeShiResult;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class PiPiGaoXiaoService {

    private static final String API = "https://h5.pipigx.com/ppapi/share/fetch_content";

    /**
     * 方法描述:短视频解析
     */
    public BareResResult parseUrl(String url) throws IOException {
        Assert.isTrue(url.contains("h5.pipigx.com"));
        return parseVideo(url);
    }


    /**
     * 方法描述: 抖音解析下载视频
     *
     * @param url 分享链接地址
     */
    private BareResResult parseVideo(String url) throws IOException {
        Map<String, List<String>> queryParams = StringUtil.getQueryParams(url);

        Map<String, Object> map = new HashMap<>();
        map.put("mid", Long.parseLong(queryParams.get("mid").get(0)));
        map.put("pid", Long.parseLong(queryParams.get("pid").get(0)));
        map.put("type", "post");
        String post = HttpUtil.post(API, JSONUtil.toJsonStr(map));
        JSONObject jsonObject = JSONUtil.parseObj(post).getJSONObject("data").getJSONObject("post").getJSONObject("videos");
        Set<String> set = jsonObject.keySet();
        String thumb = null;
        for (String item : set) {
            thumb = item;
        }
        String videoUrl = (String) jsonObject.getJSONObject(thumb).get("url");

        List<String> urlList = new ArrayList<>();
        urlList.add(videoUrl);

        return new BareResResult(urlList);
    }
}
