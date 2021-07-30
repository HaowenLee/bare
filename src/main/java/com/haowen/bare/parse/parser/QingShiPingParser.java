package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 轻视频解析
 */
@Component
public class QingShiPingParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://bbq.bilibili.com/bbq/app-bbq/sv/detail?svid=";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        Map<String, List<String>> queryParams = StringUtil.getQueryParams(url);

        String userAgent = UserAgentUtil.getOne();
        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + queryParams.get("id").get(0))
                .header("User-Agent", userAgent)
                .ignoreContentType(true)
                .execute()
                .body();

        // 解析无水印资源
        String videoUrl = (String) JSONUtil
                .parseObj(jsonStr)
                .getJSONObject("data")
                .getJSONObject("play")
                .getObj("url");

        List<String> list = new ArrayList<>();
        list.add(videoUrl);

        return new BareResResult(list);
    }
}
