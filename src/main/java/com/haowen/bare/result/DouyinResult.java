package com.haowen.bare.result;

import lombok.Data;

import java.util.List;

@Data
public class DouyinResult {

    private int status_code;
    private List<Item_listEntity> item_list;
    private ExtraEntity extra;

    @Data
    public static class Item_listEntity {

        private String video_labels;
        private int is_preview;
        private VideoEntity video;
        private int duration;
        private MusicEntity music;
        private String comment_list;
        private String video_text;
        private List<ImagesEntity> images;
        private String forward_id;
        private int create_time;
        private Share_infoEntity share_info;
        private AuthorEntity author;
        private List<Image_infosEntity> image_infos;
        private Risk_infosEntity risk_infos;
        private List<Cha_listEntity> cha_list;
        private String long_video;
        private String promotions;
        private String aweme_id;
        private List<Text_extraEntity> text_extra;
        private long author_user_id;
        private long group_id;
        private String share_url;
        private boolean is_live_replay;
        private String label_top_text;
        private String geofencing;
        private int aweme_type;
        private String desc;
        private StatisticsEntity statistics;

        @Data
        public static class VideoEntity {

            private CoverEntity cover;
            private int duration;
            private String vid;
            private String bit_rate;
            private boolean has_watermark;
            private Play_addrEntity play_addr;
            private int width;
            private Origin_coverEntity origin_cover;
            private int height;
            private String ratio;

            @Data
            public static class CoverEntity {

                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Play_addrEntity {

                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Origin_coverEntity {

                private List<String> url_list;
                private String uri;
            }
        }

        @Data
        public static class MusicEntity {

            private int duration;
            private Play_urlEntity play_url;
            private String author;
            private Cover_mediumEntity cover_medium;
            private String mid;
            private String position;
            private long id;
            private String title;
            private Cover_hdEntity cover_hd;
            private Cover_largeEntity cover_large;
            private int status;
            private Cover_thumbEntity cover_thumb;

            @Data
            public static class Play_urlEntity {

                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Cover_mediumEntity {

                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Cover_hdEntity {
                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Cover_largeEntity {
                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Cover_thumbEntity {
                private List<String> url_list;
                private String uri;
            }
        }

        @Data
        public static class ImagesEntity {
            private List<String> url_list;
            private int width;
            private String uri;
            private List<String> download_url_list;
            private int height;
        }

        @Data
        public static class Share_infoEntity {
            private String share_title;
            private String share_desc;
            private String share_weibo_desc;
        }

        @Data
        public static class AuthorEntity {

            private Avatar_mediumEntity avatar_medium;
            private String unique_id;
            private String signature;
            private String platform_sync_info;
            private Avatar_thumbEntity avatar_thumb;
            private String short_id;
            private Avatar_largerEntity avatar_larger;
            private String policy_version;
            private String uid;
            private String nickname;
            private String followers_detail;
            private String type_label;
            private String geofencing;

            @Data
            public static class Avatar_mediumEntity {
                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Avatar_thumbEntity {
                private List<String> url_list;
                private String uri;
            }

            @Data
            public static class Avatar_largerEntity {
                private List<String> url_list;
                private String uri;
            }
        }

        @Data
        public static class Image_infosEntity {
        }

        @Data
        public static class Risk_infosEntity {
            private boolean warn;
            private int type;
            private String content;
        }

        @Data
        public static class Cha_listEntity {
            private int user_count;
            private boolean is_commerce;
            private String hash_tag_profile;
            private int type;
            private String cha_name;
            private int view_count;
            private String desc;
            private String connect_music;
            private String cid;
        }

        @Data
        public static class Text_extraEntity {
            private long hashtag_id;
            private int start;
            private int end;
            private int type;
            private String hashtag_name;
        }

        @Data
        public static class StatisticsEntity {
            private int comment_count;
            private int share_count;
            private String aweme_id;
            private int digg_count;
            private int play_count;
        }
    }

    @Data
    public static class ExtraEntity {

        private long now;
        private String logid;
    }
}
