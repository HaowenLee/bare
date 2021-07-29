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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 最右解析器
 */
@Component
public class ZuiYouParser implements BareParser {

    /**
     * 方法描述:短视频解析
     *
     * @param url 链接地址
     */
    @Override
    public BareResResult parse(String url) throws IOException {
        String htmlStr = Jsoup
                .connect(url)
                .header("User-Agent", UserAgentUtil.getOne())
                .get()
                .body()
                .html();

        String filter = filter(htmlStr);

        List<String> urlList = new ArrayList<>();
        urlList.add("");

        return new BareResResult(urlList);
    }

    /**
     * 方法描述: 过滤分享链接的中文汉字
     *
     * @param url 分享链接
     */
    public static String filter(String url) {
        // 匹配网址
        String regex = "loadTimeData.data = \\{\"([\\s\\S]*?)\"\\}";
        Pattern p = Pattern.compile("loadTimeData");
        Matcher m = p.matcher(url);
        if (m.find()) {
            return url.substring(m.start(), m.end());
        }
        return "";
    }
}
