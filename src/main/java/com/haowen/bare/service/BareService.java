package com.haowen.bare.service;

import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class BareService {

    @Resource
    private DouyinService douyinService;
    @Resource
    private KuaiShouService kuaiShouService;
    @Resource
    private WeShiService weShiService;
    @Resource
    private PiPiXiaService piPiXiaService;

    public BareResResult parse(String text) throws IOException {
        if (text.contains("v.douyin.com")) {
            return douyinService.parseUrl(StringUtil.filterUrl(text));
        } else if (text.contains("v.kuaishou.com")) {
            return kuaiShouService.parseUrl(StringUtil.filterUrl(text));
        } else if (text.contains("isee.weishi.qq.com")) {
            return weShiService.parseUrl(text);
        } else if (text.contains("h5.pipix.com")) {
            return piPiXiaService.parseUrl(text);
        } else {
            throw new IllegalArgumentException("暂不支持的平台");
        }
    }
}
