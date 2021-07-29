package com.haowen.bare.parse.parser;

import cn.hutool.core.lang.Assert;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.vo.PiPiXiaResult;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PiPiXiaParser implements BareParser {

    private static final String API = "https://h5.pipix.com/bds/webapi/item/detail/?item_id=";

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {
        Assert.isTrue(url.contains("h5.pipix.com"));
        return parseVideo(url);
    }

    /**
     * 方法描述: 抖音解析下载视频
     *
     * @param url 分享链接地址
     */
    private BareResResult parseVideo(String url) throws IOException {
        // 短链接获取重定向真实地址
        Connection con = Jsoup.connect(url);
        con.header("User-Agent", "PostmanRuntime/7.28.2");
        Connection.Response resp = con.method(Connection.Method.GET).execute();

        // 获取分享资源信息
        String videoUrl = API + getItemId(resp.url().toString());
        String jsonStr = Jsoup.connect(videoUrl).ignoreContentType(true).execute().body();

        PiPiXiaResult result = JSONUtil.toBean(jsonStr, PiPiXiaResult.class);
        List<String> list = new ArrayList<>();
        list.add(result.getData().getItem().getComments().get(0).getItem().getVideo().getVideo_high().getUrl_list().get(0).getUrl());

        return new BareResResult(list);
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public String getItemId(String url) {
        int start = url.indexOf("/item/") + 6;
        int end = url.lastIndexOf("?");
        return url.substring(start, end);
    }
}
