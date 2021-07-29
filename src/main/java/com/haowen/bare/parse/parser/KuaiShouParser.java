package com.haowen.bare.parse.parser;

import cn.hutool.core.lang.Assert;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class KuaiShouParser implements BareParser {

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {
        Assert.isTrue(url.contains("v.kuaishou.com"));
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
        con.header("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 12_1_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/16D57 Version/12.0 Safari/604.1");
        Document document = con.get();
        Element video = document.getElementsByTag("video").get(0);

        List<String> urlList = new ArrayList<>();
        urlList.add(video.attr("src"));

        return new BareResResult(urlList);
    }
}
