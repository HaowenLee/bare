package com.haowen.bare.parse;

import com.haowen.bare.parse.parser.*;

/**
 * 支持的平台
 */
public enum Platform {

    DOU_YIN("抖音", "v.douyin.com", DouYinParser.class),
    KUAI_SHOU("快手", "v.kuaishou.com", KuaiShouParser.class),
    WEI_SHI("微视", "isee.weishi.qq.com", WeiShiParser.class),
    PI_PI_XIA("皮皮虾", "h5.pipix.com", PiPiXiaParser.class),
    PI_PI_GAO_XIAO("皮皮搞笑", "h5.pipigx.com", PiPiGaoXiaoParser.class),
    HUO_SHAN("抖音火山版", "share.huoshan.com", HuoShanParser.class),
    ZUI_YOU("最右", "video.izuiyou.com", ZuiYouParser.class),
    XI_GUA("西瓜", "v.ixigua.com", XiGuaParser.class),
    QING_SHI_PING("轻视频", "bbq.bilibili.com", QingShiPingParser.class),
    XIN_PIAN_CHANGE("新片场", "www.xinpianchang.com", XinPianChangParser.class),
    WEI_BO("微博", "video.weibo.com", WeiBoParser.class);

    private final String name;
    private final String domain;
    private final Class<?> parserClass;

    Platform(String name, String domain, Class<?> parserClass) {
        this.name = name;
        this.domain = domain;
        this.parserClass = parserClass;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain == null ? "" : domain;
    }

    public Class<?> getParserClass() {
        return parserClass;
    }
}
