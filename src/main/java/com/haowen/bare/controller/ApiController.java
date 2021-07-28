package com.haowen.bare.controller;

import com.haowen.bare.result.BareResResult;
import com.haowen.bare.service.BareService;
import com.haowen.bare.utils.ResponseUtil;
import com.haowen.bare.utils.ReturnObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class ApiController {

    @Resource
    BareService bareService;

    @PostMapping("/bare")
    private ReturnObject<BareResResult> bare(@RequestParam("text") String text) throws IOException {
        return ResponseUtil.ok(bareService.parse(text));
    }
}
