package com.haowen.bare.controller;

import com.haowen.bare.result.BareResResult;
import com.haowen.bare.service.BareService;
import com.haowen.bare.utils.ResponseUtil;
import com.haowen.bare.utils.ReturnObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * 外部接口
 */
@RestController
public class ApiController {

    @Resource
    private BareService bareService;

    /**
     * 获取无水印资源地址列表
     *
     * @param link 复制的链接
     */
    @RequestMapping("/bare")
    private ReturnObject<BareResResult> bare(@RequestParam("link") String link) throws IOException {
        return ResponseUtil.ok(bareService.parse(link));
    }
}