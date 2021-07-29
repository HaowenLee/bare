package com.haowen.bare.utils;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class UrlUtil {

    /**
     * 获取重定向地址
     *
     * @param url 地址
     * @return 重定向地址
     */
    public static String getRealUrl(String userAgent, String url) throws IOException {
        // 短链接获取重定向真实地址
        Connection con = Jsoup.connect(url);
        con.header("User-Agent", userAgent);
        Connection.Response resp = con.method(Connection.Method.GET).execute();
        return resp.url().toString();
    }
}
