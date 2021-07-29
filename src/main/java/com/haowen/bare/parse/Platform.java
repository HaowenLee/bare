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
    PI_PI_GAO_XIAO("皮皮搞笑", "h5.pipigx.com", PiPiGaoXiaoParser.class);

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
