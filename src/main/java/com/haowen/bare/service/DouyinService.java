package com.haowen.bare.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.haowen.bare.result.DouyinResult;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 短视频解析
 */
@Service
public class DouyinService {

    /**
     * 视频保存目录
     */
    private static final String videoSavePath = "d:/douyin/";

    private static final String[] targetPathArray = new String[]{
            "9xn特别可爱的一组情侣头像%情侣头像  https://v.douyin.com/eW5cBYD/ 復zhi此鏈接，打開Dou搜索，矗接观看视频！",
            "1--B%官方男友认证，又是一个细节情侣头像%  https://v.douyin.com/eWaRhar/ 复制佌链接，打开Dou姻搜索，直接观看视頻！",
            "1-一个特别有意思的情侣头像%情侣头像  https://v.douyin.com/eWaeVus/ 腹淛此链接，打开Dou音搜索，直接观看视頻！",
            "7UY赚钱的脑海里都是你呀%可爱情侣头像 %情头  https://v.douyin.com/eW53XAT/ 复制佌链接，打鐦Dou音搜索，直接觀看视频！",
            "3宠物猫的一对情侣头像%可爱情侣头像 %头像  https://v.douyin.com/eW53rqp/ 複淛此链接，咑开Dou音搜索，矗接观看视频！",
            "3I.真的太可爱了%可爱情侣头像 %头像  https://v.douyin.com/eW5c8fa/ 复制佌lian接，打開Dou荫搜索，直接观看视频！",
            "9Sd见什么世面，见见你就好了%头像 %情头  https://v.douyin.com/eW5ELgy/ 复淛Ci链接，打開Dou䜾搜索，直接观看视pin！",
            "1c%情侣头像 一组超惊艳的闺蜜情头%高级感头像  https://v.douyin.com/eWaNp9R/ 复zhiCi链接，打开Dou音搜索，値接观看视频！",
            "63一组超干净的，不明显情侣头像%头像 %情侣头像  https://v.douyin.com/eW5vY5v/ 复制佌链接，打开Dou音搜索，直接观看视頻！",
            "4一组超可爱的漫画情头%动漫情头 %头像 %可爱情侣头像  https://v.douyin.com/eWaFho9/ 鳆製此链接，打开Dou䜾搜索，直接观看视频！",
            "3R-.%情侣头像 现在住在心里的人，以后也要住进家里，这组爱了  https://v.douyin.com/eWaFyks/ 复制佌链接，打开Douyin搜索，値接觀kan视頻！",
            "1jP%头像 %情侣头像 你是我的星辰大海  https://v.douyin.com/eW5cmVB/ 覆制此链接，打幵Dou音搜索，値接观kan视频！",
            "9i千山万水，总有人，为你而来%高级感头像 %情侣头像 一组超酷情头  https://v.douyin.com/eWaduBv/ 复制此链接，打幵Dou愔搜索，直接观看視频！",
            "5.-总有人嫌你不够好，总有人觉得你哪都好%可爱情侣头像 %头像 %情头分享  https://v.douyin.com/eW5tXBS/ 鳆制此链接，打kaiDou音搜索，直接觀看视頻！",
            "4:/ 我真的太喜欢这一组了%头像 %可爱情侣头像  https://v.douyin.com/eW5wLxK/ 复制Ci链接，打kaiDou音搜索，直接观kan視频！",
            "6v我负责貌美如花，你负责勤俭持家%头像 %情侣头像  https://v.douyin.com/eWaJmQ8/ 复制此lian接，打幵Dou音搜索，直接观看视频！",
            "65心情再不好，也不要对身边的人冷冰冰的%情侣头像 %头像  https://v.douyin.com/eWa8EXJ/ 複制此lian接，打开Dou姻搜索，矗接觀看视pin！",
            "2.7h智者不入爱河，遇你难做智者%头像 %情侣头像  一组高级感头像  https://v.douyin.com/eW5K6KK/ 复淛此链接，打幵Dou音搜索，直接觀kan视频！",
            "1%情侣头像 %头像 西瓜一样的夏天，小心机情侣头像，你get到了吗  https://v.douyin.com/eW53jAB/ 复製此链接，打开Dou音搜索，直接观看视pin！",
            "0.Y我是你的养乐多%头像 %情侣头像  https://v.douyin.com/eW5tUyn/ 複制佌链接，打汧Dou音搜索，矗接觀看视频！",
            "7u%抖音看见音乐 宇航员情侣头像，我真的太喜欢这组了%头像 %可爱情侣头像  https://v.douyin.com/eWadAcT/ 椱zhi此链接，答开Dou音搜索，直接觀看視频！",
            "8h%情侣头像  https://v.douyin.com/eWaLuP6/ 复zhi此链接，打开Dou姻搜索，値接观kan視频！",
            "1O这是一对超级细节的一组%情侣头像  https://v.douyin.com/eWadVtR/ 复制此链接，打开Dou音搜索，矗接觀kan视频！",
            "1:/ %头像 %可爱情侣头像  https://v.douyin.com/eWa2EeC/ 複制此链接，打开Dou音搜索，直接观看视频！",
            "76%情侣头像  https://v.douyin.com/eWaL52C/ 覆zhi此链接，打开Dou搜索，直接观看視頻！",
            "89.-x%情侣头像  https://v.douyin.com/eW5WsBc/ 复制此链接，打开Douyin搜索，矗接观kan视频！",
            "1--%情侣头像 宝贝，谈恋爱太难了，咱们拜把子吧  https://v.douyin.com/eW5T4D7/ fu制此鏈接，打开Dou音搜索，直接觀看視pin！",
            "1.-%优质情头 宇航员情侣头像  https://v.douyin.com/eW5WqWc/ 覆制佌链接，打幵Dou音搜索，直接观看视频！",
            "1-t.做个可爱的女孩，简单点 糊涂点 开心快乐点  https://v.douyin.com/eWa2h6B/ 复製此链接，打开Dou䜾搜索，値接觀看視频！",
            "8-q.要相信，最好的人注定会来到我身边  https://v.douyin.com/eWadKkB/ 复制此链接，打kaiDou音搜索，矗接觀看視频！",
            "9--.我就是天%情侣头像  https://v.douyin.com/eWaLvEy/ 複制此lian接，打鐦Dou音搜索，直接观看視频！",
            "8Iq祝我们能在乱七八糟的生活里，找到想要的快乐%情侣头像  https://v.douyin.com/eWaR38S/ 鳆制此链接，咑开Dou音搜索，直接观kan视频！",
            "0u爱情八字箴言：不做慈善，不捡垃圾%情侣头像  https://v.douyin.com/eWaNbdL/ 復淛此链接，打开Dou音搜索，直接观看视频！",
            "3.顺利的话，我们结婚，不顺利的话我们晚点结婚%情侣头像  https://v.douyin.com/eW5omCg/ 复制Ci链接，达汧Dou音搜索，矗接观看视频！",
            "6Td.y我太喜欢熬夜了，我怀疑上辈子我就是个路灯  https://v.douyin.com/eWaFkaR/ 复zhi佌鏈接，答开Dou音搜索，直接观看視頻！",
            "8rm5%情侣头像  https://v.douyin.com/eWaYj1F/ 复制此链接，达開Dou荫搜索，直接观kan视pin！",
            "4u太喜欢这个女生头像了  https://v.douyin.com/eWa8XSv/ 复制此鏈接，打开Dou䜾搜索，直接观看视频！",
            "9.今天还好吗？被人左右情绪了吗%情侣头像  https://v.douyin.com/eWaYnNL/ 复製此链接，打汧Dou荫搜索，直接觀kan视pin！",
            "8--a所有道歉里我最喜欢 ：明天见%情侣头像  https://v.douyin.com/eWaF2pP/ 腹制此链接，打鐦Dou姻搜索，直接观看视频！",
            "0.人生建议：远离任何消耗你快乐的人  https://v.douyin.com/eWaeNL4/ 复制Ci链接，答开Dou音搜索，直接觀kan视频！",
            "0.-都是出来混日子，但是和你一起混就开心些%情侣头像  https://v.douyin.com/eWaNV9j/ 复淛此链接，打开Douyin搜索，矗接觀看视频！",
            "42保持快乐的秘诀：偶尔动心 惯性拒绝 保持清醒 长期快乐 %情侣头像  https://v.douyin.com/eW5W5hX/ 复制此链接，打幵Dou音搜索，直接观看視频！",
            "7q.R清醒温柔知进退 努力上进且优秀%情侣头像  https://v.douyin.com/eW5vCxu/ 复制此链接，打开Dou愔搜索，直接观看视频！",
            "5...“没有明确表达的爱意都是错觉”%情侣头像  https://v.douyin.com/eW53mBy/ 腹制此链接，打开Dou茵搜索，値接觀看视频！",
            "4:/ 爱意东升西落，浪漫至死不渝”%情侣头像  https://v.douyin.com/eWa12gA/ 椱制此链接，打开Dou音搜索，直接观看視频！",
            "0-你是夏夜晚风吹来的宝藏%情侣头像  https://v.douyin.com/eWaLgRJ/ 复製佌链接，打kaiDou荫搜索，矗接观kan视频！",
            "5.q-希望你开心 无论和谁，无论在哪%情侣头像  https://v.douyin.com/eWaLBsK/ 复制此链接，打开Dou茵搜索，直接观看視频！",
            "4-x大大方方为自己的心动买单%情侣头像  https://v.douyin.com/eWa2QJ3/ 复zhi此链接，打开Dou音搜索，直接观看视频！",
            "8:/ 风很温柔 海很浪漫 你很特别 我很喜欢%情侣头像  https://v.douyin.com/eWa8JvJ/ 復制此链接，打开Dou愔搜索，直接觀看视频！",
            "4-A-E我可以撒娇吗，可以无理取闹吗，可以永远保护我的少女心呐%情侣头像  https://v.douyin.com/eWaY7P5/ 椱製此链接，达汧Dou音搜索，直接观看视频！",
            "5.V你是我人间的宝藏%情侣头像  https://v.douyin.com/eW5TuB7/ 复制此链接，打鐦Dou音搜索，値接观看视頻！",
            "2s对的人，把你宠成孩子%情侣头像  https://v.douyin.com/eW5nBke/ 复淛佌链接，打开Dou音搜索，直接观kan視频！",
            "5.C..爱情八字箴言:不做慈善，不捡垃圾%情侣头像  https://v.douyin.com/eWaFdqF/ 复制Ci鏈接，打开Dou音搜索，直接观看視频！"
    };

    /**
     * 分享链接（手动修改）
     */
    private static final String targetPath = "6%情侣头像 %头像 不明显情头  https://v.douyin.com/eWAG4b3/ 复制佌链接，打汧Dou音搜索，矗接观kan视频！";

    public static void main(String[] args) {
        for (String item : targetPathArray) {
            parseUrl(item);
        }
    }

    /**
     * 方法描述:短视频解析
     */
    public static void parseUrl(String url) {
        if (url.contains("v.douyin.com")) {
            parseDouyinAvatarImage(filterUrl(url));
        }
    }

    /**
     * 方法描述: 抖音解析下载视频
     *
     * @param url 分享链接地址
     */
    public static void parseDouyinAvatarImage(String url) {
        try {
            final String videoPath = "https://www.iesdouyin.com/web/api/v2/aweme/iteminfo/?item_ids=";
            Connection con = Jsoup.connect(filterUrl(url));
            con.header("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 12_1_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/16D57 Version/12.0 Safari/604.1");
            Connection.Response resp = con.method(Connection.Method.GET).execute();
            String videoUrl = videoPath + getItemId(resp.url().toString());
            String jsonStr = Jsoup.connect(videoUrl).ignoreContentType(true).execute().body();
            DouyinResult douyinResult = JSONUtil.toBean(jsonStr, DouyinResult.class);
            List<DouyinResult.Item_listEntity.ImagesEntity> imageList = douyinResult.getItem_list().get(0).getImages();

            File file = FileUtil.file(videoSavePath);
            File[] files = file.listFiles();
            assert files != null;
            int count = files.length / 2;

            count = count + 1;
            int index = 0;
            for (int i = 0; i < imageList.size(); i++) {
                if (i == 0 && imageList.size() == 3) {
                    continue;
                }
                DouyinResult.Item_listEntity.ImagesEntity imageItem = imageList.get(i);
                float radio;
                if (imageItem.getWidth() > imageItem.getHeight()) {
                    radio = imageItem.getWidth() * 1f / imageItem.getHeight();
                } else {
                    radio = imageItem.getHeight() * 1f / imageItem.getWidth();
                }
                if (radio < 1.2) {
                    HttpUtil.downloadFile(imageItem.getUrl_list().get(0), new File(videoSavePath + count + "_" + index + ".jpg"));
                    index++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 方法描述: 过滤分享链接的中文汉字
     *
     * @param url 分享链接
     */
    public static String filterUrl(String url) {
        // 匹配网址
        String regex = "https?://(\\w|-)+(\\.(\\w|-)+)+(/(\\w+(\\?(\\w+=(\\w|%|-)*(\\&\\w+=(\\w|%|-)*)*)?)?)?)+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(url);
        if (m.find()) {
            return url.substring(m.start(), m.end());
        }
        return "";
    }

    /**
     * 方法描述: 获取分享视频id
     *
     * @param url 分享链接
     */
    public static String getItemId(String url) {
        int start = url.indexOf("/video/") + 7;
        int end = url.lastIndexOf("/");
        return url.substring(start, end);
    }
}

