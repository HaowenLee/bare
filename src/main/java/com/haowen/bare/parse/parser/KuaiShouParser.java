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
 * 快手解析器
 */
@Component
public class KuaiShouParser implements BareParser {

    /**
     * 方法描述:短视频解析
     *
     * @param url 链接地址
     */
    @Override
    public BareResResult parse(String url) throws IOException {
        Document document = Jsoup
                .connect(url)
                .header("User-Agent", UserAgentUtil.getOne())
                .get();

        Element video = document.getElementsByTag("video").get(0);

        List<String> urlList = new ArrayList<>();
        urlList.add(video.attr("src"));

        return new BareResResult(urlList);
    }
}
