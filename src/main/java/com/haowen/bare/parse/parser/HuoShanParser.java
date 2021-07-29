package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 火山解析器
 */
@Component
public class HuoShanParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://share.huoshan.com/api/item/info?item_id=";

    /**
     * 无水印视频地址
     */
    private static final String BASE_VIDEO_URL = "https://api-hl.huoshan.com/hotsoon/item/video/_playback/?video_id=";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        String userAgent = UserAgentUtil.getOne();
        // 获取重定向地址
        String realUrl = UrlUtil.getRealUrl(userAgent, url);

        // 获取URL参数
        Map<String, List<String>> queryParams = StringUtil.getQueryParams(realUrl);

        // 获取分享资源信息
        String jsonStr = Jsoup
                .connect(API + queryParams.get("item_id").get(0))
                .header("User-Agent", userAgent)
                .ignoreContentType(true)
                .execute()
                .body();

        // 解析出有水印的视频
        String videoWmUrl = (String) JSONUtil.parseObj(jsonStr)
                .getJSONObject("data")
                .getJSONObject("item_info")
                .getObj("url");

        List<String> list = new ArrayList<>();
        list.add(BASE_VIDEO_URL + StringUtil.getQueryParams(videoWmUrl).get("video_id").get(0));

        return new BareResResult(list);
    }
}
