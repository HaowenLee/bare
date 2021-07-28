package com.haowen.bare.service;

import cn.hutool.core.lang.Assert;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.vo.WeShiResult;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WeShiService {

    private static final String API = "https://h5.weishi.qq.com/webapp/json/weishi/WSH5GetPlayPage?t=0.1053529481813007&g_tk=";

    /**
     * 方法描述:短视频解析
     */
    public BareResResult parseUrl(String url) throws IOException {
        Assert.isTrue(url.contains("isee.weishi.qq.com"));
        return parseVideo(url);
    }

    /**
     * 方法描述: 抖音解析下载视频
     *
     * @param url 分享链接地址
     */
    private BareResResult parseVideo(String url) throws IOException {

        String feedId = StringUtil.getQueryParams(url).get("id").get(0);

        Map<String, Object> map = new HashMap<>();
        map.put("feedid", feedId);
        map.put("recommendtype", 0);
        map.put("datalvl", "all");
        map.put("_weishi_mapExt", new Object());
        String post = HttpUtil.post(API, JSONUtil.toJsonStr(map));

        WeShiResult weShiResult = JSONUtil.toBean(post, WeShiResult.class);

        List<String> urlList = new ArrayList<>();
        urlList.add(weShiResult.getData().getFeeds().get(0).getVideoUrl());

        return new BareResResult(urlList);
    }
}
