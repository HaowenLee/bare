package com.haowen.bare.parse.parser;

import cn.hutool.core.util.URLUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.parse.enums.MediaType;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UrlUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 小红书解析器
 */
@Component
public class XiaoHongShuParser implements BareParser {

    /**
     * 方法描述:短视频解析
     */
    @Override
    public BareResult parse(String url) throws IOException {

        // 构建结果
        BareResult result = new BareResult(MediaType.VIDEO);

        String realUrl = UrlUtil.getRealUrl(UserAgentUtil.getOne(), url);
        String redirectPath = StringUtil.getQueryParams(realUrl).get("redirectPath").get(0);

        String itemId = getItemId(redirectPath);

        String singleApiUrl = "https://www.xiaohongshu.com/fe_api/burdock/weixin/v2/note/" + itemId + "/single_feed";
        String singleJsonStr = Jsoup.connect(singleApiUrl)
                .header("Authorization", "wxmp.926c1d27-7636-4a54-896a-993b5e934a87")
                .header("X-Sign", "X" + SecureUtil.md5("/fe_api/burdock/weixin/v2/note/" + itemId + "/single_feed" + "WSUDD"))
                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat")
                .referrer("https://servicewechat.com/wxb296433268a1c654/46/page-frame.html")
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute()
                .body();

        JSONObject singleDataObject = JSONUtil.parseObj(singleJsonStr)
                .getJSONObject("data");

        // 标题封面
        result.setTitle(singleDataObject.getStr("title"));
        JSONObject coverObject = singleDataObject.getJSONObject("cover");
        result.setCover(new BareResult.Image(
                "http://ci.xiaohongshu.com/" + coverObject.getStr("traceId"),
                coverObject.getInt("width"),
                coverObject.getInt("height")
        ));

        // 视频
        if ("video".equals(singleDataObject.getStr("type"))) {

            result.setType(MediaType.VIDEO);
            List<BareResult.Video> videos = new ArrayList<>();
            result.setVideos(videos);

            String apiUrl = "https://www.xiaohongshu.com/fe_api/burdock/weixin/v2/note/" + itemId + "/feed?";
            Map<String, Object> apiParam = new HashMap<>();
            apiParam.put("openId", "oPPUS5Q3AWkM_nR5me2b4OIGeGPk");
            apiParam.put("page", 1);
            apiParam.put("pageSize", 2);
            apiParam.put("noteType", 2);
            apiParam.put("needVideo", true);
            apiParam.put("needCount", true);
            String apiParamBuild = URLUtil.buildQuery(apiParam, StandardCharsets.UTF_8);

            String apiJsonStr = Jsoup.connect(apiUrl + apiParamBuild)
                    .header("Authorization", "wxmp.926c1d27-7636-4a54-896a-993b5e934a87")
                    .header("X-Sign", "X" + SecureUtil.md5("/fe_api/burdock/weixin/v2/note/" + itemId + "/feed?" + apiParamBuild + "WSUDD"))
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat")
                    .referrer("https://servicewechat.com/wxb296433268a1c654/46/page-frame.html")
                    .ignoreContentType(true)
                    .method(Connection.Method.GET)
                    .execute()
                    .body();

            JSONObject dataObject = JSONUtil.parseObj(apiJsonStr)
                    .getJSONArray("data")
                    .getJSONObject(0);

            JSONObject videoObject = dataObject.getJSONObject("video");
            videos.add(new BareResult.Video(
                    videoObject.getStr("url"),
                    null,
                    videoObject.getInt("width"),
                    videoObject.getInt("height")
            ));
        } else {

            result.setType(MediaType.IMAGE);
            List<BareResult.Image> images = new ArrayList<>();
            result.setImages(images);

            JSONArray imageArray = singleDataObject.getJSONArray("imageList");
            // 图片信息
            for (int i = 0; i < imageArray.size(); i++) {
                JSONObject item = imageArray.getJSONObject(i);
                images.add(new BareResult.Image(
                        "http://ci.xiaohongshu.com/" + item.getStr("traceId"),
                        item.getInt("width"),
                        item.getInt("height")
                ));
            }
        }

        return result;
    }

    /**
     * 方法描述: 正则获取数据json
     *
     * @param html 网页内容
     */
    public static String regexJson(String html) {
        // 匹配网址
        String regex = "<script>window.__INITIAL_SSR_STATE__=\\{(.*?)}</script>";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(html);
        if (m.find()) {
            return html.substring(m.start(), m.end())
                    .replace("<script>window.__INITIAL_SSR_STATE__=", "")
                    .replace("</script>", "")
                    .replace("undefined", "null");
        }
        return "";
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public String getItemId(String url) {
        int start = url.indexOf("/item/") + "/item/".length();
        int end = url.lastIndexOf("?");
        return url.substring(start, end);
    }
}
