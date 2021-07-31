package com.haowen.bare.parse.parser;

import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 度小视解析器
 */
@Component
public class DuXiaoShiParser implements BareParser {

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResResult parse(String url) throws IOException {

        // 获取分享资源信息
        Document document = Jsoup
                .connect(url)
                .userAgent(UserAgentUtil.getOne())
                .ignoreContentType(true)
                .get();

        Element videoUrlElement = document.getElementsByAttributeValue("property", "og:videosrc").get(0);
        String videoUrl = videoUrlElement.attr("content");

        List<String> list = new ArrayList<>();
        list.add(videoUrl);

        return new BareResResult(list);
    }
}
