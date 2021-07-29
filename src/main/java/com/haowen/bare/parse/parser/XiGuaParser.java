package com.haowen.bare.parse.parser;

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
    public BareResResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getPC();

        String realUrl = UrlUtil.getRealUrl(userAgent, url);
        String itemId = getItemId(realUrl);

        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + itemId)
                .header("User-Agent", userAgent)
                .ignoreContentType(true)
                .execute()
                .body();


        List<String> list = new ArrayList<>();
        list.add("");

        return new BareResResult(list);
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
