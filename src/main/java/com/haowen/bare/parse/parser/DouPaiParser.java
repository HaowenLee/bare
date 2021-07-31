package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 逗拍解析器
 */
@Component
public class DouPaiParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://v2.doupai.cc/v3/template/topic/";

    /**
     * 方法描述:短视频解析
     *
     * @param url 链接地址
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        Map<String, List<String>> queryParams = StringUtil.getQueryParams(url);

        String jsonStr = Jsoup
                .connect(API + queryParams.get("id").get(0))
                .referrer("https://p.doupai.cc/")
                .userAgent(UserAgentUtil.getOne())
                .method(Connection.Method.GET)
                .ignoreContentType(true)
                .execute()
                .body();

        String videoUrl = (String) JSONUtil.parseObj(jsonStr)
                .getJSONObject("data")
                .getObj("videoUrl");

        List<String> urlList = new ArrayList<>();
        urlList.add(videoUrl);

        return new BareResResult(urlList);
    }
}
