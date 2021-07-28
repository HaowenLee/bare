package com.haowen.bare.vo;

import lombok.Data;

import java.util.List;

@Data
public class PiPiXiaResult {

    private DataBean data;

    @Data
    public static class DataBean {

        private ItemBean item;

        @Data
        public static class ItemBean {

            private List<CommentsBean> comments;

            @Data
            public static class CommentsBean {

                private ItemBeanInner item;

                @Data
                public static class ItemBeanInner {
                    private VideoBean video;

                    @Data
                    public static class VideoBean {

                        private VideoHighBean video_high;

                        @Data
                        public static class VideoHighBean {

                            private List<UrlListBean> url_list;

                            @Data
                            public static class UrlListBean {

                                private String url;
                            }
                        }
                    }
                }
            }
        }
    }
}
