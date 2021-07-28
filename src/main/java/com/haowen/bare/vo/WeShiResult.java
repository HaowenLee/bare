package com.haowen.bare.vo;

import lombok.Data;

import java.util.List;

@Data
public class WeShiResult {

    private int ret;
    private String msg;
    private DataBean data;

    @Data
    public static class DataBean {

        private List<FeedItem> feeds;

        @Data
        public static class FeedItem {

            private String videoUrl;
        }
    }
}
