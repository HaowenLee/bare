package com.haowen.bare.parse.parser;

import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.vo.DouyinResult;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DouYinParser implements BareParser {

    private static final String API = "https://www.iesdouyin.com/web/api/v2/aweme/iteminfo/?item_ids=";

    /**
     * 获取无水印资源信息
     *
     * @param link 复制的链接
     * @return 无水印资源信息
     */
    @Override
    public BareResResult parse(String link) {
        return null;
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
        Connection.Response resp = con.method(Connection.Method.GET).execute();

        // 获取分享资源信息
        String videoUrl = API + getItemId(resp.url().toString());
        String jsonStr = Jsoup.connect(videoUrl).ignoreContentType(true).execute().body();

        DouyinResult douyinResult = JSONUtil.toBean(jsonStr, DouyinResult.class);

        List<DouyinResult.Item_listEntity.ImagesEntity> images = douyinResult.getItem_list().get(0).getImages();
        List<String> urlList = new ArrayList<>();
        // 判断是图片还是视频
        if (images == null) {
            urlList.add(douyinResult.getItem_list().get(0).getVideo().getPlay_addr().getUrl_list().get(0).replace("playwm", "play"));
        } else {
            for (DouyinResult.Item_listEntity.ImagesEntity item : images) {
                urlList.add(item.getUrl_list().get(0));
            }
        }

        return new BareResResult(urlList);
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public String getItemId(String url) {
        int start = url.indexOf("/video/") + 7;
        int end = url.lastIndexOf("/");
        return url.substring(start, end);
    }
}
