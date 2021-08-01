package com.haowen.bare.parse.parser;

import com.haowen.bare.parse.BareParser;
import com.haowen.bare.parse.enums.MediaType;
import com.haowen.bare.result.BareResult;
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
 * ==============================================================
 * User-Agent Mobile
 * 1. 获取html内容
 * 4. 解析获取想要的结果
 * --------------------------------------------------------------
 * 标题 -> null
 * 封面 -> data -> item_info -> cover
 * 视频 -> data -> item_info -> url
 * ==============================================================
 */
@Component
public class KuaiShouParser implements BareParser {

    /**
     * 方法描述:短视频解析
     *
     * @param url 链接地址
     */
    @Override
    public BareResult parse(String url) throws IOException {
        Document document = Jsoup
                .connect(url)
                .userAgent(UserAgentUtil.getOne())
                .get();

        // 构建结果
        BareResult result = new BareResult(MediaType.VIDEO);
        List<BareResult.Video> videos = new ArrayList<>();
        result.setVideos(videos);

        String videoUrl = document.getElementsByTag("video").get(0).attr("src");
        videos.add(new BareResult.Video(videoUrl, null, null, null));

        return result;
    }
}
