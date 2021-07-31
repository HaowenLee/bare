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

/**
 * Before避风解析器
 */
@Component
public class BeforeParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://hlg.xiatou.com/h5/feed/detail?id=";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + getItemId(url))
                .userAgent(UserAgentUtil.getPC())
                .ignoreContentType(true)
                .execute()
                .body();

        String videoUrl = (String) JSONUtil.parseObj(jsonStr)
                .getJSONArray("data")
                .getJSONObject(0)
                .getJSONArray("mediaInfoList")
                .getJSONObject(0)
                .getJSONObject("videoInfo")
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
        int start = url.indexOf("/detail/") + "/detail/".length();
        int end = url.lastIndexOf("?");
        return url.substring(start, end);
    }
}
