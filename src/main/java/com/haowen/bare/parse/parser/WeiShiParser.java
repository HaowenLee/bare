package com.haowen.bare.parse.parser;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微视解析器
 */
@Component
public class WeiShiParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://h5.weishi.qq.com/webapp/json/weishi/WSH5GetPlayPage?t=0.1053529481813007&g_tk=";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) {

        String feedId = StringUtil.getQueryParams(url).get("id").get(0);

        Map<String, Object> map = new HashMap<>();
        map.put("feedid", feedId);
        map.put("recommendtype", 0);
        map.put("datalvl", "all");
        map.put("_weishi_mapExt", new Object());

        // 获取分享资源信息
        String jsonStr = HttpUtil.createPost(API)
                .header("User-Agent", UserAgentUtil.getOne())
                .body(JSONUtil.toJsonStr(map))
                .execute()
                .body();

        // 解析无水印资源
        String videoUrl = (String) JSONUtil.parseObj(jsonStr)
                .getJSONObject("data")
                .getJSONArray("feeds")
                .getJSONObject(0)
                .getObj("video_url");

        List<String> urlList = new ArrayList<>();
        urlList.add(videoUrl);

        return new BareResResult(urlList);
    }
}
