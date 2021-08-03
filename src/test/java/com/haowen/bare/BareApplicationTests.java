package com.haowen.bare;

import com.haowen.bare.parse.Platform;
import com.haowen.bare.result.BareResult;
import com.haowen.bare.service.BareService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@Slf4j
@SpringBootTest
class BareApplicationTests {

    @Resource
    private BareService bareService;

    @Test
    void contextLoads() {

    }

    /**
     * 解析校验
     *
     * @param platform 平台
     * @param link     复制链接
     */
    private void parse(Platform platform, String link) throws IOException {
        BareResult result = bareService.parse(link);
        log.info("===========================================================================================");
        log.info("{}：{}", platform.getName(), result.toString());
        log.info("===========================================================================================");
        assert result.getVideos().get(0) != null;
        assert result.getCover().getUrl() != null;
    }

    /**
     * AcFun
     */
    @Test
    void acFunTest() throws IOException {
        parse(Platform.AC_FUN, "https://m.acfun.cn/v/?ac=17351705&sid=3d4bfa049a81667f");
    }

    /**
     * before避风
     */
    @Test
    void beforeTest() throws IOException {
        parse(Platform.BEFORE, "https://m.hanyuhl.com/detail/64678085?shareId=763440260");
    }

    /**
     * 逗拍
     */
    @Test
    void douPaiTest() throws IOException {
        parse(Platform.DOU_PAI, "我想到没人认识的地方，在那里酩酊大醉一场！\n" +
                "可以添加一张照片。 星河影视的逗拍视频模板，你也去做一个这个视频吧！https://p.doupai.cc/modules/topic/?id=60fa63223ed358003e2ec270&utm_source=topic-H5&utm_medium=doupaiapp-H5-fenxiang&utm_term=shareH5&utm_content=shareH5&utm_campaign=20210602-topic-H5-share&_channel_track_key=Q6x6xfxk");
    }

    /**
     * 抖音
     */
    @Test
    void douYinTest() throws IOException {
        parse(Platform.DOU_YIN, "6.97 xsE:/ “浪漫至死不渝，我比你想象中更加深情”%你的名字   https://v.douyin.com/e3md8Sv/ 復制此鏈接，打开Dou音搜索，直接观看視频！");
    }

    /**
     * 度小视
     */
    @Test
    void duXiaoShiTest() throws IOException {
        parse(Platform.DU_XIAO_SHI, "https://xspshare.baidu.com/88fc0154b588926c3abcbdd74a62f738?source=share-h5&pd=qm_share_mvideo&vid=4360835078718407166&shareTime=1627867933&shareid=1932363553&shared_cuid=_uBW8_8av8gx8v8Bja2sag8CSt0pu2uPgPvq8lulvfKkLl-uB&shared_uid=Al-uB");
    }

    /**
     * 火山
     */
    @Test
    void huoShanTest() throws IOException {
        parse(Platform.HUO_SHAN, "双胞胎车模（星星）在火山分享了视频，快来围观！传送门戳我>>https://share.huoshan.com/hotsoon/s/bWA4mrCMtk8/ 复制此链接，打开【抖音火山版】，直接观看视频~");
    }

    /**
     * 开眼
     */
    @Test
    void kaiYanTest() throws IOException {
        parse(Platform.KAI_YAN, "https://m.eyepetizer.net/u1/video-detail?video_id=267766&resource_type=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0&udid=e03fdb127ded489a842d5e0b4f6ea6a431c9285b&vc=7020001&vn=7.2.0&size=1080X2265&deviceModel=VOG-AL00&first_channel=testflight&last_channel=testflight&system_version_code=29");
    }

    /**
     * 快手
     */
    @Test
    void kuaiShouTest() throws IOException {
        parse(Platform.KUAI_SHOU, "我说我不做 非要让我做 做完还埋汰我\uD83D\uDE44 https://v.kuaishou.com/bQ30Bb 复制此消息，打开【快手】直接观看！");
    }

    /**
     * 梨视频
     */
    @Test
    void liShiPinTest() throws IOException {
        parse(Platform.LI_SHI_PIN, "https://www.pearvideo.com/detail_1111663?st=7");
    }

    /**
     * 绿洲
     */
    @Test
    void lvZhouTest() throws IOException {
        parse(Platform.LV_ZHOU, "女神写真｜张天爱 @Crystal张天爱 #张天爱蝴蝶结镂空裙 纯白蝴蝶结镂空长裙搭配金色高跟... @爱豆女神在绿洲APP发了一条超棒的动态，戳我看看>>https://m.oasis.weibo.cn/v1/h5/share?sid=4641658404078184");
    }

    /**
     * 美拍
     */
    @Test
    void meiPaiTest() throws IOException {
        parse(Platform.MEI_PAI, "向姐姐们的大长腿看齐 http://www.meipai.com/video/863/6826061694944437551?client_id=1089857302&utm_media_id=6826061694944437551&utm_source=meipai_share&utm_term=meipai_android&gid=2185880175&utm_content=9458&utm_share_type=3");
    }

    /**
     * 皮皮搞笑
     */
    @Test
    void piPiGaoXiaoTest() throws IOException {
        parse(Platform.PI_PI_GAO_XIAO, "https://h5.pipigx.com/pp/post/475450717068?zy_to=copy_link&share_count=1&m=23fbbe82ccbe4731e10b923ebdd2c2db&app=&type=post&did=a81e6fd901939c1a&mid=7328875321474&pid=475450717068");
    }

    /**
     * 皮皮虾
     */
    @Test
    void piPiXiaTest() throws IOException {
        parse(Platform.PI_PI_XIA, "https://h5.pipix.com/s/e3moCwR/");
    }

    /**
     * 轻视频
     */
    @Test
    void qingShiPingTest() throws IOException {
        parse(Platform.QING_SHI_PING, "#轻视频# https://bbq.bilibili.com/video/?id=1623658971064418152");
    }

    /**
     * 全民K歌
     */
    @Test
    void quanMingKGeTest() throws IOException {
        parse(Platform.QUAN_MING_K_GE, "https://kg3.qq.com/node/9BW3TTWBRj/play_v2?s=bUYQ1WbCzlQ9Kb4E&shareuid=619c9981242a3189344d&topsource=a0_pn201001006_z11_u3144176203_l1_t1627868283__&pageId=feed");
    }

    /**
     * VUE Vlog
     */
    @Test
    void vueVlogTest() throws IOException {
        parse(Platform.VUE_VLOG, "https://v.vuevideo.net/share/post/-3151640006220828088");
    }

    /**
     * 微博
     */
    @Test
    void weiBoTest() throws IOException {
        parse(Platform.WEI_BO, "https://video.weibo.com/show?fid=1034:4656279344578592");
    }

    /**
     * 微视
     */
    @Test
    void weiShiTest() throws IOException {
        parse(Platform.WEI_SHI, "一条被水“断开”的公路，船在上面走车在底下开，设计感十足！>>https://isee.weishi.qq.com/ws/app-pages/share/index.html?wxplay=1&id=77nTk9kdd1M5JhOeS&collectionid=ai-60fecd4cddad6b010a08900a&spid=2124850950999772140&qua=v1_and_weishi_8.31.0_588_312026001_d&chid=100081003&pkg=&attach=cp_reserves3_1000370721");
    }

    /**
     * 西瓜视频
     */
    @Test
    void xiGuaTest() throws IOException {
        parse(Platform.WEI_SHI, "https://v.ixigua.com/e3mKfcU/");
    }

    /**
     * 新片场
     */
    @Test
    void xinPianChangTest() throws IOException {
        parse(Platform.XIN_PIAN_CHANGE, "https://www.xinpianchang.com/a10450763?from=share&channel=Link&type=URL&xpcApp=xpc");
    }

    /**
     * 最右
     */
    @Test
    void zuiYouTest() throws IOException {
        parse(Platform.ZUI_YOU, "#最右#分享一条有趣的内容给你，不好看算我输。请戳链接>> https://share.izuiyou.com/hybrid/share/post?pid=208977136&zy_to=applink&share_count=1&m=8df56b3a3afc94fd6ded32b716559572&d=35dfa91e566ca98c1bb301450a76fba02e84e82c1465c3d1c1ab7d683e48be36&app=zuiyou&recommend=r0&name=n0&title_type=t0");
    }
}
