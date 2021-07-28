package com.haowen.bare;

import com.haowen.bare.service.PiPiGaoXiaoService;
import com.haowen.bare.service.PiPiXiaService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootTest
class BareApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private PiPiXiaService piPiXiaService;

    @Test
    void testParse() {
        try {
            System.out.println(piPiXiaService.parseUrl("https://h5.pipix.com/s/evXqSpq/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Resource
    private PiPiGaoXiaoService piPiGaoXiaoService;

    @Test
    void testPiPiGaoXiaoParse() {
        try {
            System.out.println(piPiGaoXiaoService.parseUrl("https://h5.pipigx.com/pp/post/430689107609?zy_to=copy_link&share_count=1&m=23fbbe82ccbe4731e10b923ebdd2c2db&app=&type=post&did=a81e6fd901939c1a&mid=7328875321474&pid=430689107609"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
