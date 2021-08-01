package com.haowen.bare.parse.parser;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.parse.BareParser;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.utils.StringUtil;
import com.haowen.bare.utils.UserAgentUtil;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 皮皮搞笑解析器
 */
@Component
public class PiPiGaoXiaoParser implements BareParser {

    /**
     * 获取视频接口地址
     */
    private static final String API = "https://h5.pipigx.com/ppapi/share/fetch_content";

    /**
     * 方法描述:短视频解析
     *
     * @param url 链接地址
     */
    @Override
    public BareResult parse(String url) {

        // 获取URL参数
        Map<String, List<String>> queryParams = StringUtil.getQueryParams(url);

        Map<String, Object> map = new HashMap<>();
        map.put("mid", Long.parseLong(queryParams.get("mid").get(0)));
        map.put("pid", Long.parseLong(queryParams.get("pid").get(0)));
        map.put("type", "post");

        // 获取分享资源信息
        String jsonStr = HttpUtil.createPost(API)
                .header("User-Agent", UserAgentUtil.getOne())
                .body(JSONUtil.toJsonStr(map))
                .execute()
                .body();
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr).getJSONObject("data").getJSONObject("post").getJSONObject("videos");
        Set<String> set = jsonObject.keySet();
        String thumb = null;
        for (String item : set) {
            thumb = item;
        }
        String videoUrl = (String) jsonObject.getJSONObject(thumb).get("url");

        List<String> urlList = new ArrayList<>();
        urlList.add(videoUrl);

//        return new BareResult(urlList);
        return null;
    }
}
