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

    private static final String API = "https://edith.xiaohongshu.com/api/sns/v1/note/feed";

    @Override
    public BareResult parse(String url) throws IOException {
        // 构建结果
        BareResult result = new BareResult(MediaType.VIDEO);

        String realUrl = UrlUtil.getRealUrl(UserAgentUtil.getOne(), url);
        String redirectPath = StringUtil.getQueryParams(realUrl).get("redirectPath").get(0);

        String itemId = "6110bd46000000002103ee4c";//getItemId(redirectPath);

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("node_id", itemId);
        paramMap.put("page", 1);
        paramMap.put("has_ads_tag", false);
        paramMap.put("num", 5);
        paramMap.put("fetch_mode", 1);
        paramMap.put("source", "explore");
        paramMap.put("ads_track_id", "dssm_dssm_online_bias_7day%4028wqioik1j9uophjxbg82");

        Map<String, Object> commonParamMap = new HashMap<>();
        commonParamMap.put("fid", "1628587580107f1cca65552d8d0f91432f6126ad003e");
        commonParamMap.put("device_fingerprint", "20200802235814f00c36fe5b8ca187a43698b8dcdea374018ceb224f35950c");
        commonParamMap.put("device_fingerprint1", "20200802235814f00c36fe5b8ca187a43698b8dcdea374018ceb224f35950c");
        commonParamMap.put("launch_id", "1628645280");
        commonParamMap.put("tz", "Asia%2FShanghai");
        commonParamMap.put("channel", "HuaweiPreloadV2");
        commonParamMap.put("versionName", "7.3.0");
        commonParamMap.put("deviceId", "234628e8-90a4-3162-859f-3cf3c7933cf0");
        commonParamMap.put("platform", "android");
        commonParamMap.put("sid", "session.1628587591234123503960");
        commonParamMap.put("identifier_flag", "4");
        commonParamMap.put("t", "1628645888");
        commonParamMap.put("project_id", "ECFAAF");
        commonParamMap.put("build", "7030185");
        commonParamMap.put("x_trace_page_current", "explore_feed");
        commonParamMap.put("lang", "zh-Hans");
        commonParamMap.put("app_id", "ECFAAF01");
        commonParamMap.put("uis", "light");

        Map<String, Object> platformInfoMap = new HashMap<>();
        platformInfoMap.put("platform", "android");
        platformInfoMap.put("build", "7030185");
        platformInfoMap.put("deviceId", "234628e8-90a4-3162-859f-3cf3c7933cf0");

        String jsonStr = Jsoup.connect(API + "?" + URLUtil.buildQuery(paramMap, StandardCharsets.UTF_8))
                .header("xy-common-params", URLUtil.buildQuery(commonParamMap, StandardCharsets.UTF_8))
                .header("shield", "XYAAAAAQAAAAEAAABTAAAAUzUWEe0xG1IbD9/c+qCLOlKGmTtFa+lG43EOf+FXTKhAxoC2nL4yRJ3x/7Fbz8Mr2s9+2ac7RgxNQjOLN7z93ygz0OQ0SHPgNhO5ePc5P5VY0HSx")
                .header("xy-platform-info", URLUtil.buildQuery(platformInfoMap, StandardCharsets.UTF_8))
                .userAgent(UserAgentUtil.getOne())
                .ignoreContentType(true)
                .execute()
                .body();

        return result;
    }

    /**
     * 方法描述:短视频解析
     */
    public BareResult parse1(String url) throws IOException {

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
