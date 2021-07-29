package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONNull;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 抖音解析器
 */
@Component
public class DouYinParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://www.iesdouyin.com/web/api/v2/aweme/iteminfo/?item_ids=";

    /**
     * 方法描述: 获取无水印资源信息
     *
     * @param url 复制的链接
     * @return 无水印资源信息
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getOne();
        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + getItemId(UrlUtil.getRealUrl(userAgent, url)))
                .header("User-Agent", userAgent)
                .ignoreContentType(true)
                .execute()
                .body();

        // 解析无水印资源
        JSONObject itemFirst = JSONUtil.parseObj(jsonStr).getJSONArray("item_list").getJSONObject(0);
        List<String> urlList = new ArrayList<>();
        if (!JSONNull.NULL.equals(itemFirst.get("images"))) {
            JSONArray imageJSONArray = itemFirst.getJSONArray("images");
            for (int i = 0; i < imageJSONArray.size(); i++) {
                urlList.add((String) imageJSONArray.getJSONObject(i).getJSONArray("url_list").get(0));
            }
        } else {
            urlList.add(((String) itemFirst.getJSONObject("video").getJSONObject("play_addr").getJSONArray("url_list").get(0)).replace("playwm", "play"));
        }

        return new BareResResult(urlList);
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
