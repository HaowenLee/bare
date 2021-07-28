package com.haowen.bare.vo;

import lombok.Data;

import java.util.List;

@Data
public class PiPiXiaResult {

    private int status_code;
    private DataEntity data;
    private long time;
    private String message;
    private String prompt;

    @Data
    public static class DataEntity {

        private ItemEntity item;

        @Data
        public static class ItemEntity {

            private String new_app_visible;
            private String item_id_str;
            private int item_type;
            private int rating;
            private String ancestor_comment_id;
            private String source;
            private String related_comment_id_str;
            private CoverEntity cover;
            private String game_card_info;
            private StatsEntity stats;
            private String mapping_gids;
            private Interact_eggEntity interact_egg;
            private String quality_level;
            private String dup_item_schema;
            private String micro_app_id;
            private String log_item_extra;
            private int create_time;
            private String level;
            private AuthorEntity author;
            private String origin_video_id;
            private boolean show_feature_digg;
            private String origin_video_download;
            private String expire_time;
            private Ward_infoEntity ward_info;
            private String episode_info;
            private String recommend_tags;
            private String related_id;
            private String ancestor_id;
            private String human_tags;
            private int post_source;
            private String promotion_info;
            private String jump_link;
            private String position;
            private String interaction_status;
            private int related_comment_id;
            private String last_comment_time;
            private Item_relationEntity item_relation;
            private int status;
            private String note;
            private String club_info;
            private String album_intro;
            private String frozen_toast;
            private String activity;
            private String link;
            private List<?> recreate_meta_info_list;
            private VideoEntity video;
            private PrivilegeEntity privilege;
            private String hot_info;
            private List<Aha_imageEntity> aha_image;
            private String content;
            private String audit_info;
            private double duration;
            private String debug_info;
            private String is_origin;
            private String default_schema;
            private String drainage_info;
            private int neihan_style;
            private String animations;
            private ShareEntity share;
            private String review_status;
            private String vital_comments;
            private String user_status;
            private List<CommentsEntity> comments;
            private boolean comment_post_item;
            private long item_id;
            private String author_display_tags;
            private int video_type;
            private String admin_debug;
            private int item_cell_type;
            private boolean show_feature_bury;
            private String stage;
            private String ancestor_schema;
            private String ai_tag;
            private List<?> text_schema;
            private String club_relation;
            private boolean can_download;

            @Data
            public static class CoverEntity {

                private boolean is_gif;
                private List<Url_listEntity> url_list;
                private List<Download_listEntity> download_list;
                private int width;
                private String uri;
                private int height;

                @Data
                public static class Url_listEntity {

                    private String url;
                }

                @Data
                public static class Download_listEntity {

                    private String url;

                }
            }

            @Data
            public static class StatsEntity {
                private int comment_count;
                private int share_count;
                private int dubbing_count;
                private int like_count;
                private int bury_count;
                private List<Digg_countsEntity> digg_counts;
                private int play_count;
                private int bullet_count;
                private int go_detail_count;
                private List<Bury_countsEntity> bury_counts;
                private int view_count;
                private int impression_count;

                @Data
                public static class Digg_countsEntity {
                    private int digg_count;
                    private int digg_type;
                }

                @Data
                public static class Bury_countsEntity {
                    private int bury_type;
                    private int bury_count;
                }
            }

            @Data
            public static class Interact_eggEntity {
                private String like_style;
            }

            @Data
            public static class AuthorEntity {
                private boolean live_auth;
                private List<?> achievements;
                private String description;
                private String language;
                private String recommend_reason;
                private String certify_info;
                private String punishments;
                private String id_str;
                private String profile_schema;
                private long id;
                private int vote_count;
                private String broadcast_info;
                private Author_infoEntity author_info;
                private int like_count;
                private String recommend_tag;
                private int level;
                private int god_comment_count;
                private String commerce_permission_list;
                private String is_followed;
                private String decoration_list;
                private AvatarEntity avatar;
                private int followings_count;
                private String creative_level_info;
                private int followers_count;
                private String name;
                private String interaction_limitation;
                private String region;
                private String is_following;
                private int status;

                @Data
                public static class Author_infoEntity {
                    private String owner;
                    private String recommend_tag;
                    private int author_item_type;
                    private long user_id;
                    private int level;
                    private int author_type;
                    private int origin_status;
                    private String username;
                    private List<?> tags;
                }

                @Data
                public static class AvatarEntity {

                    private boolean is_gif;
                    private List<Url_listEntity> url_list;
                    private List<Download_listEntity> download_list;
                    private int width;
                    private String uri;
                    private int height;

                    @Data
                    public static class Url_listEntity {

                        private String url;

                    }

                    @Data
                    public static class Download_listEntity {
                        private String url;
                    }
                }
            }

            @Data
            public static class Ward_infoEntity {
                private List<?> trend_messages;
                private boolean is_visible;
                private boolean has_new;
                private int ward_comment_id;
                private int ward_count;
                private int ward_reply_id;
                private boolean is_ward;
                private List<Ward_usersEntity> ward_users;

                @Data
                public static class Ward_usersEntity {
                    private boolean live_auth;
                    private String achievements;
                    private String description;
                    private String language;
                    private String recommend_reason;
                    private String certify_info;
                    private String punishments;
                    private String id_str;
                    private String profile_schema;
                    private long id;
                    private int vote_count;
                    private String broadcast_info;
                    private String author_info;
                    private String like_count;
                    private String recommend_tag;
                    private int level;
                    private String god_comment_count;
                    private String commerce_permission_list;
                    private String is_followed;
                    private String decoration_list;
                    private AvatarEntity avatar;
                    private String followings_count;
                    private String creative_level_info;
                    private String followers_count;
                    private String name;
                    private String interaction_limitation;
                    private String region;
                    private String is_following;
                    private String status;

                    @Data
                    public static class AvatarEntity {

                        private boolean is_gif;
                        private List<Url_listEntity> url_list;
                        private List<Download_listEntity> download_list;
                        private int width;
                        private String uri;
                        private int height;

                        @Data
                        public static class Url_listEntity {
                            /**
                             * url : https://p1-ppx.byteimg.com/img/tos-cn-i-0000/f71b2e9c0dc844d09dc0d4e3cb75abe0~c5_200x200_q80.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }

                        public class Download_listEntity {
                            /**
                             * url : https://p1-ppx.byteimg.com/img/tos-cn-i-0000/f71b2e9c0dc844d09dc0d4e3cb75abe0~tplv-ppx-logo.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }
                    }
                }
            }

            public class Item_relationEntity {
                /**
                 * bury_type : 10
                 * is_favorite : false
                 * is_like : false
                 * digg_type : 10
                 * is_bury : false
                 */
                private int bury_type;
                private boolean is_favorite;
                private boolean is_like;
                private int digg_type;
                private boolean is_bury;

                public void setBury_type(int bury_type) {
                    this.bury_type = bury_type;
                }

                public void setIs_favorite(boolean is_favorite) {
                    this.is_favorite = is_favorite;
                }

                public void setIs_like(boolean is_like) {
                    this.is_like = is_like;
                }

                public void setDigg_type(int digg_type) {
                    this.digg_type = digg_type;
                }

                public void setIs_bury(boolean is_bury) {
                    this.is_bury = is_bury;
                }

                public int getBury_type() {
                    return bury_type;
                }

                public boolean isIs_favorite() {
                    return is_favorite;
                }

                public boolean isIs_like() {
                    return is_like;
                }

                public int getDigg_type() {
                    return digg_type;
                }

                public boolean isIs_bury() {
                    return is_bury;
                }
            }

            public class VideoEntity {
                /**
                 * hashtag_schema : []
                 * video_height : 754
                 * video_download : {"p2p_type":null,"url_list":[{"expires":604800,"url":"http://v3-ppx.ixigua.com/03ec66362295119e51274b67da25d4b4/61012ef1/video/tos/cn/tos-cn-ve-0076/4fb8eadead9c42b68ff7848b83a756ab/?a=1319&br=887&bt=887&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=3&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApO2k7NDNmOWU0NztmOmg1N2deMG5hc2xsZWhgLS1kMWFzczA1MmAyXzYzY2EtMzU1XmA6Yw%3D%3D&vl=&vr="},{"expires":604800,"url":"http://v6-ppx.ixigua.com/398a3aeaa60a968dfaeb340ff3bc5d05/61012ef1/video/tos/cn/tos-cn-ve-0076/4fb8eadead9c42b68ff7848b83a756ab/?a=1319&br=887&bt=887&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=3&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApO2k7NDNmOWU0NztmOmg1N2deMG5hc2xsZWhgLS1kMWFzczA1MmAyXzYzY2EtMzU1XmA6Yw%3D%3D&vl=&vr="}],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":32.041,"animated_cover_image":null,"file_hash":null,"width":720,"definition":4,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":1,"height":754}
                 * transport_text :
                 * video_width : 720
                 * video_low : null
                 * video_high : null
                 * tail_ad_passthrough :
                 * transport : false
                 * title : null
                 * animate : null
                 * support_live_photo : false
                 * duration : 28.031
                 * video_fallback : null
                 * video_god_comment_urls : ["http://v3-ppx.ixigua.com/862572cdef884cfd891734485f5254de/61012ef1/video/tos/cn/tos-cn-ve-0076/99fea825b7a2497687e56caf37af7757/?a=1319&br=870&bt=870&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=6&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb_shenping&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApNDM6ZjM5aDtlNzw3aDVkOmdeMG5hc2xsZWhgLS1kMWFzczIyMS1hNV4yLTIuMTQtNF46Yw%3D%3D&vl=&vr=","http://v6-ppx.ixigua.com/83210a1d0537183a444f8458f2a9d985/61012ef1/video/tos/cn/tos-cn-ve-0076/99fea825b7a2497687e56caf37af7757/?a=1319&br=870&bt=870&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=6&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb_shenping&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApNDM6ZjM5aDtlNzw3aDVkOmdeMG5hc2xsZWhgLS1kMWFzczIyMS1hNV4yLTIuMTQtNF46Yw%3D%3D&vl=&vr="]
                 * text : 我就直说了 看到最后 你也看不到啥
                 * cover_image : {"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564}
                 * video_mid : null
                 * video_id : v0d04cg10000c2k4heoeoev1doqf30a0
                 */
                private List<?> hashtag_schema;
                private int video_height;
                private Video_downloadEntity video_download;
                private String transport_text;
                private int video_width;
                private String video_low;
                private String video_high;
                private String tail_ad_passthrough;
                private boolean transport;
                private String title;
                private String animate;
                private boolean support_live_photo;
                private double duration;
                private String video_fallback;
                private List<String> video_god_comment_urls;
                private String text;
                private Cover_imageEntity cover_image;
                private String video_mid;
                private String video_id;

                public void setHashtag_schema(List<?> hashtag_schema) {
                    this.hashtag_schema = hashtag_schema;
                }

                public void setVideo_height(int video_height) {
                    this.video_height = video_height;
                }

                public void setVideo_download(Video_downloadEntity video_download) {
                    this.video_download = video_download;
                }

                public void setTransport_text(String transport_text) {
                    this.transport_text = transport_text;
                }

                public void setVideo_width(int video_width) {
                    this.video_width = video_width;
                }

                public void setVideo_low(String video_low) {
                    this.video_low = video_low;
                }

                public void setVideo_high(String video_high) {
                    this.video_high = video_high;
                }

                public void setTail_ad_passthrough(String tail_ad_passthrough) {
                    this.tail_ad_passthrough = tail_ad_passthrough;
                }

                public void setTransport(boolean transport) {
                    this.transport = transport;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setAnimate(String animate) {
                    this.animate = animate;
                }

                public void setSupport_live_photo(boolean support_live_photo) {
                    this.support_live_photo = support_live_photo;
                }

                public void setDuration(double duration) {
                    this.duration = duration;
                }

                public void setVideo_fallback(String video_fallback) {
                    this.video_fallback = video_fallback;
                }

                public void setVideo_god_comment_urls(List<String> video_god_comment_urls) {
                    this.video_god_comment_urls = video_god_comment_urls;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public void setCover_image(Cover_imageEntity cover_image) {
                    this.cover_image = cover_image;
                }

                public void setVideo_mid(String video_mid) {
                    this.video_mid = video_mid;
                }

                public void setVideo_id(String video_id) {
                    this.video_id = video_id;
                }

                public List<?> getHashtag_schema() {
                    return hashtag_schema;
                }

                public int getVideo_height() {
                    return video_height;
                }

                public Video_downloadEntity getVideo_download() {
                    return video_download;
                }

                public String getTransport_text() {
                    return transport_text;
                }

                public int getVideo_width() {
                    return video_width;
                }

                public String getVideo_low() {
                    return video_low;
                }

                public String getVideo_high() {
                    return video_high;
                }

                public String getTail_ad_passthrough() {
                    return tail_ad_passthrough;
                }

                public boolean isTransport() {
                    return transport;
                }

                public String getTitle() {
                    return title;
                }

                public String getAnimate() {
                    return animate;
                }

                public boolean isSupport_live_photo() {
                    return support_live_photo;
                }

                public double getDuration() {
                    return duration;
                }

                public String getVideo_fallback() {
                    return video_fallback;
                }

                public List<String> getVideo_god_comment_urls() {
                    return video_god_comment_urls;
                }

                public String getText() {
                    return text;
                }

                public Cover_imageEntity getCover_image() {
                    return cover_image;
                }

                public String getVideo_mid() {
                    return video_mid;
                }

                public String getVideo_id() {
                    return video_id;
                }

                public class Video_downloadEntity {
                    /**
                     * p2p_type : null
                     * url_list : [{"expires":604800,"url":"http://v3-ppx.ixigua.com/03ec66362295119e51274b67da25d4b4/61012ef1/video/tos/cn/tos-cn-ve-0076/4fb8eadead9c42b68ff7848b83a756ab/?a=1319&br=887&bt=887&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=3&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApO2k7NDNmOWU0NztmOmg1N2deMG5hc2xsZWhgLS1kMWFzczA1MmAyXzYzY2EtMzU1XmA6Yw%3D%3D&vl=&vr="},{"expires":604800,"url":"http://v6-ppx.ixigua.com/398a3aeaa60a968dfaeb340ff3bc5d05/61012ef1/video/tos/cn/tos-cn-ve-0076/4fb8eadead9c42b68ff7848b83a756ab/?a=1319&br=887&bt=887&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=3&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApO2k7NDNmOWU0NztmOmg1N2deMG5hc2xsZWhgLS1kMWFzczA1MmAyXzYzY2EtMzU1XmA6Yw%3D%3D&vl=&vr="}]
                     * alarm_text : 操作有风险，请勿模仿
                     * uri : v0d04cg10000c2k4heoeoev1doqf30a0
                     * duration : 32.041
                     * animated_cover_image : null
                     * file_hash : null
                     * width : 720
                     * definition : 4
                     * video_model :
                     * cover_image : {"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754}
                     * codec_type : 1
                     * height : 754
                     */
                    private String p2p_type;
                    private List<Url_listEntity> url_list;
                    private String alarm_text;
                    private String uri;
                    private double duration;
                    private String animated_cover_image;
                    private String file_hash;
                    private int width;
                    private int definition;
                    private String video_model;
                    private Cover_imageEntity cover_image;
                    private int codec_type;
                    private int height;

                    public void setP2p_type(String p2p_type) {
                        this.p2p_type = p2p_type;
                    }

                    public void setUrl_list(List<Url_listEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public void setAlarm_text(String alarm_text) {
                        this.alarm_text = alarm_text;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public void setDuration(double duration) {
                        this.duration = duration;
                    }

                    public void setAnimated_cover_image(String animated_cover_image) {
                        this.animated_cover_image = animated_cover_image;
                    }

                    public void setFile_hash(String file_hash) {
                        this.file_hash = file_hash;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public void setDefinition(int definition) {
                        this.definition = definition;
                    }

                    public void setVideo_model(String video_model) {
                        this.video_model = video_model;
                    }

                    public void setCover_image(Cover_imageEntity cover_image) {
                        this.cover_image = cover_image;
                    }

                    public void setCodec_type(int codec_type) {
                        this.codec_type = codec_type;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getP2p_type() {
                        return p2p_type;
                    }

                    public List<Url_listEntity> getUrl_list() {
                        return url_list;
                    }

                    public String getAlarm_text() {
                        return alarm_text;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public double getDuration() {
                        return duration;
                    }

                    public String getAnimated_cover_image() {
                        return animated_cover_image;
                    }

                    public String getFile_hash() {
                        return file_hash;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public int getDefinition() {
                        return definition;
                    }

                    public String getVideo_model() {
                        return video_model;
                    }

                    public Cover_imageEntity getCover_image() {
                        return cover_image;
                    }

                    public int getCodec_type() {
                        return codec_type;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public class Url_listEntity {
                        /**
                         * expires : 604800
                         * url : http://v3-ppx.ixigua.com/03ec66362295119e51274b67da25d4b4/61012ef1/video/tos/cn/tos-cn-ve-0076/4fb8eadead9c42b68ff7848b83a756ab/?a=1319&br=887&bt=887&cd=0%7C0%7C1&ch=0&cr=0&cs=0&cv=1&dr=3&ds=3&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=superb&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApO2k7NDNmOWU0NztmOmg1N2deMG5hc2xsZWhgLS1kMWFzczA1MmAyXzYzY2EtMzU1XmA6Yw%3D%3D&vl=&vr=
                         */
                        private int expires;
                        private String url;

                        public void setExpires(int expires) {
                            this.expires = expires;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getExpires() {
                            return expires;
                        }

                        public String getUrl() {
                            return url;
                        }
                    }

                    public class Cover_imageEntity {
                        /**
                         * is_gif : false
                         * url_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg"}]
                         * download_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}]
                         * width : 720
                         * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                         * height : 754
                         */
                        private boolean is_gif;
                        private List<Url_listEntity> url_list;
                        private List<Download_listEntity> download_list;
                        private int width;
                        private String uri;
                        private int height;

                        public void setIs_gif(boolean is_gif) {
                            this.is_gif = is_gif;
                        }

                        public void setUrl_list(List<Url_listEntity> url_list) {
                            this.url_list = url_list;
                        }

                        public void setDownload_list(List<Download_listEntity> download_list) {
                            this.download_list = download_list;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public boolean isIs_gif() {
                            return is_gif;
                        }

                        public List<Url_listEntity> getUrl_list() {
                            return url_list;
                        }

                        public List<Download_listEntity> getDownload_list() {
                            return download_list;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public String getUri() {
                            return uri;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public class Url_listEntity {
                            /**
                             * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754_q80.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }

                        public class Download_listEntity {
                            /**
                             * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }
                    }
                }

                public class Cover_imageEntity {
                    /**
                     * is_gif : false
                     * url_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}]
                     * download_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}]
                     * width : 540
                     * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                     * height : 564
                     */
                    private boolean is_gif;
                    private List<Url_listEntity> url_list;
                    private List<Download_listEntity> download_list;
                    private int width;
                    private String uri;
                    private int height;

                    public void setIs_gif(boolean is_gif) {
                        this.is_gif = is_gif;
                    }

                    public void setUrl_list(List<Url_listEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public void setDownload_list(List<Download_listEntity> download_list) {
                        this.download_list = download_list;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public boolean isIs_gif() {
                        return is_gif;
                    }

                    public List<Url_listEntity> getUrl_list() {
                        return url_list;
                    }

                    public List<Download_listEntity> getDownload_list() {
                        return download_list;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public class Url_listEntity {
                        /**
                         * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg
                         */
                        private String url;

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public String getUrl() {
                            return url;
                        }
                    }

                    public class Download_listEntity {
                        /**
                         * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg
                         */
                        private String url;

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public String getUrl() {
                            return url;
                        }
                    }
                }
            }

            public class PrivilegeEntity {
                /**
                 * bullet_play : false
                 * bullet_post : false
                 */
                private boolean bullet_play;
                private boolean bullet_post;

                public void setBullet_play(boolean bullet_play) {
                    this.bullet_play = bullet_play;
                }

                public void setBullet_post(boolean bullet_post) {
                    this.bullet_post = bullet_post;
                }

                public boolean isBullet_play() {
                    return bullet_play;
                }

                public boolean isBullet_post() {
                    return bullet_post;
                }
            }

            public class Aha_imageEntity {
                /**
                 * is_gif : false
                 * url_list : [{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be~c5_200x200_q80.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be~c5_200x200_q80.jpeg"}]
                 * download_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be~tplv-ppx-logo.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be~tplv-ppx-logo.jpeg"}]
                 * width : 200
                 * uri : tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be
                 * height : 200
                 */
                private boolean is_gif;
                private List<Url_listEntity> url_list;
                private List<Download_listEntity> download_list;
                private int width;
                private String uri;
                private int height;

                public void setIs_gif(boolean is_gif) {
                    this.is_gif = is_gif;
                }

                public void setUrl_list(List<Url_listEntity> url_list) {
                    this.url_list = url_list;
                }

                public void setDownload_list(List<Download_listEntity> download_list) {
                    this.download_list = download_list;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public boolean isIs_gif() {
                    return is_gif;
                }

                public List<Url_listEntity> getUrl_list() {
                    return url_list;
                }

                public List<Download_listEntity> getDownload_list() {
                    return download_list;
                }

                public int getWidth() {
                    return width;
                }

                public String getUri() {
                    return uri;
                }

                public int getHeight() {
                    return height;
                }

                public class Url_listEntity {
                    /**
                     * url : https://p3-ppx.byteimg.com/img/tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be~c5_200x200_q80.jpeg
                     */
                    private String url;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getUrl() {
                        return url;
                    }
                }

                public class Download_listEntity {
                    /**
                     * url : https://p9-ppx.byteimg.com/img/tos-cn-i-0000/237c36e4a5a44de2b0cd64d1569d64be~tplv-ppx-logo.jpeg
                     */
                    private String url;

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getUrl() {
                        return url;
                    }
                }
            }

            public class ShareEntity {
                /**
                 * share_text : [皮皮虾]我就直说了 看到最后 你也看不到啥
                 * qq_strategy : 4
                 * schema : bds://cell_detail?item_id=6964896912050755875&type=2&item_cell_type=1
                 * weixin_strategy : 4
                 * wechat_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&timestamp=1627463878&carrier_region=cn&region=cn&language=zh&utm_source=weixin
                 * qzone_strategy : 2
                 * qzone_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&timestamp=1627463878&carrier_region=cn&region=cn&language=zh&utm_source=qzone
                 * image_url : https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~c5_100x100_q60.jpeg
                 * android : {"qq_strategy":4,"weixin_strategy":4,"qzone_strategy":2,"channel":1,"moments_strategy":2}
                 * qq_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&timestamp=1627463878&carrier_region=cn&region=cn&language=zh&utm_source=mobile_qq
                 * title : 我就直说了 看到最后 你也看不到啥
                 * ios : {"qq_strategy":4,"weixin_strategy":4,"qzone_strategy":4,"channel":1,"moments_strategy":4}
                 * compound_page_url : https://h5.pipix.com/bds_web/share/backup/?item_id=6964896912050755875&app_id=0&carrier_region=cn&region=cn&language=zh
                 * content : [皮皮虾] 搞笑娱乐神评论，皮这一下很开心
                 * moments_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&timestamp=1627463878&carrier_region=cn&region=cn&language=zh&utm_source=weixin_moments
                 * large_image_url : https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~c5_500x500_q60.jpeg
                 * share_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&timestamp=1627463878&carrier_region=cn&region=cn&language=zh&utm_source=weixin
                 * moments_strategy : 2
                 * link_text : 我就直说了 看到最后 你也看不到啥
                 * https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&timestamp=1627463878&carrier_region=cn&region=cn&language=zh&utm_source=weixin
                 */
                private String share_text;
                private int qq_strategy;
                private String schema;
                private int weixin_strategy;
                private String wechat_url;
                private int qzone_strategy;
                private String qzone_url;
                private String image_url;
                private AndroidEntity android;
                private String qq_url;
                private String title;
                private IosEntity ios;
                private String compound_page_url;
                private String content;
                private String moments_url;
                private String large_image_url;
                private String share_url;
                private int moments_strategy;
                private String link_text;

                public void setShare_text(String share_text) {
                    this.share_text = share_text;
                }

                public void setQq_strategy(int qq_strategy) {
                    this.qq_strategy = qq_strategy;
                }

                public void setSchema(String schema) {
                    this.schema = schema;
                }

                public void setWeixin_strategy(int weixin_strategy) {
                    this.weixin_strategy = weixin_strategy;
                }

                public void setWechat_url(String wechat_url) {
                    this.wechat_url = wechat_url;
                }

                public void setQzone_strategy(int qzone_strategy) {
                    this.qzone_strategy = qzone_strategy;
                }

                public void setQzone_url(String qzone_url) {
                    this.qzone_url = qzone_url;
                }

                public void setImage_url(String image_url) {
                    this.image_url = image_url;
                }

                public void setAndroid(AndroidEntity android) {
                    this.android = android;
                }

                public void setQq_url(String qq_url) {
                    this.qq_url = qq_url;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setIos(IosEntity ios) {
                    this.ios = ios;
                }

                public void setCompound_page_url(String compound_page_url) {
                    this.compound_page_url = compound_page_url;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public void setMoments_url(String moments_url) {
                    this.moments_url = moments_url;
                }

                public void setLarge_image_url(String large_image_url) {
                    this.large_image_url = large_image_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public void setMoments_strategy(int moments_strategy) {
                    this.moments_strategy = moments_strategy;
                }

                public void setLink_text(String link_text) {
                    this.link_text = link_text;
                }

                public String getShare_text() {
                    return share_text;
                }

                public int getQq_strategy() {
                    return qq_strategy;
                }

                public String getSchema() {
                    return schema;
                }

                public int getWeixin_strategy() {
                    return weixin_strategy;
                }

                public String getWechat_url() {
                    return wechat_url;
                }

                public int getQzone_strategy() {
                    return qzone_strategy;
                }

                public String getQzone_url() {
                    return qzone_url;
                }

                public String getImage_url() {
                    return image_url;
                }

                public AndroidEntity getAndroid() {
                    return android;
                }

                public String getQq_url() {
                    return qq_url;
                }

                public String getTitle() {
                    return title;
                }

                public IosEntity getIos() {
                    return ios;
                }

                public String getCompound_page_url() {
                    return compound_page_url;
                }

                public String getContent() {
                    return content;
                }

                public String getMoments_url() {
                    return moments_url;
                }

                public String getLarge_image_url() {
                    return large_image_url;
                }

                public String getShare_url() {
                    return share_url;
                }

                public int getMoments_strategy() {
                    return moments_strategy;
                }

                public String getLink_text() {
                    return link_text;
                }

                public class AndroidEntity {
                    /**
                     * qq_strategy : 4
                     * weixin_strategy : 4
                     * qzone_strategy : 2
                     * channel : 1
                     * moments_strategy : 2
                     */
                    private int qq_strategy;
                    private int weixin_strategy;
                    private int qzone_strategy;
                    private int channel;
                    private int moments_strategy;

                    public void setQq_strategy(int qq_strategy) {
                        this.qq_strategy = qq_strategy;
                    }

                    public void setWeixin_strategy(int weixin_strategy) {
                        this.weixin_strategy = weixin_strategy;
                    }

                    public void setQzone_strategy(int qzone_strategy) {
                        this.qzone_strategy = qzone_strategy;
                    }

                    public void setChannel(int channel) {
                        this.channel = channel;
                    }

                    public void setMoments_strategy(int moments_strategy) {
                        this.moments_strategy = moments_strategy;
                    }

                    public int getQq_strategy() {
                        return qq_strategy;
                    }

                    public int getWeixin_strategy() {
                        return weixin_strategy;
                    }

                    public int getQzone_strategy() {
                        return qzone_strategy;
                    }

                    public int getChannel() {
                        return channel;
                    }

                    public int getMoments_strategy() {
                        return moments_strategy;
                    }
                }

                public class IosEntity {
                    /**
                     * qq_strategy : 4
                     * weixin_strategy : 4
                     * qzone_strategy : 4
                     * channel : 1
                     * moments_strategy : 4
                     */
                    private int qq_strategy;
                    private int weixin_strategy;
                    private int qzone_strategy;
                    private int channel;
                    private int moments_strategy;

                    public void setQq_strategy(int qq_strategy) {
                        this.qq_strategy = qq_strategy;
                    }

                    public void setWeixin_strategy(int weixin_strategy) {
                        this.weixin_strategy = weixin_strategy;
                    }

                    public void setQzone_strategy(int qzone_strategy) {
                        this.qzone_strategy = qzone_strategy;
                    }

                    public void setChannel(int channel) {
                        this.channel = channel;
                    }

                    public void setMoments_strategy(int moments_strategy) {
                        this.moments_strategy = moments_strategy;
                    }

                    public int getQq_strategy() {
                        return qq_strategy;
                    }

                    public int getWeixin_strategy() {
                        return weixin_strategy;
                    }

                    public int getQzone_strategy() {
                        return qzone_strategy;
                    }

                    public int getChannel() {
                        return channel;
                    }

                    public int getMoments_strategy() {
                        return moments_strategy;
                    }
                }
            }

            public class CommentsEntity {
                /**
                 * comment_count : null
                 * image_thumbs : null
                 * has_liked : false
                 * reveal_replies : []
                 * type : 1
                 * root_cell_id : 6964896912050755875
                 * support_live_photo : false
                 * cover : null
                 * video_fallback : null
                 * has_buried : false
                 * origin_item : null
                 * interact_egg : {"like_style":"default"}
                 * can_delete : false
                 * text : ICU目标客户
                 * send_god_status : 0
                 * comment_id_str : 6964932181558827301
                 * item : {"note":null,"create_time":1621641431,"item_id":6964896912050755875,"item_id_str":"6964896912050755875","item_type":2,"author":{"live_auth":false,"achievements":[],"description":"男人也是永远长不大的男孩","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"73144436042","profile_schema":"bds://user/profile?user_id=73144436042&page_index=1","id":73144436042,"vote_count":0,"broadcast_info":null,"author_info":{"owner":"script","recommend_tag":"","author_item_type":1,"user_id":73144436042,"level":0,"author_type":104007473,"origin_status":0,"username":"BoyFun","tags":[]},"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"}],"download_list":[{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"}],"width":200,"uri":"tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"BoyFun","interaction_limitation":null,"region":"cn","is_following":null,"status":0},"link":null,"video":{"hashtag_schema":[],"video_height":754,"video_download":{"p2p_type":null,"url_list":[],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":720,"definition":null,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":null,"height":754},"transport_text":"","video_width":720,"video_low":null,"video_high":{"p2p_type":null,"url_list":[{"expires":604800,"url":"http://v3-ppx.ixigua.com/c83561088f46199e4f2caa057dbd7e1f/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="},{"expires":604800,"url":"http://v6-ppx.ixigua.com/b19113400d31986bd719661a8c536367/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="}],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":540,"definition":3,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564},"codec_type":1,"height":564},"tail_ad_passthrough":"","transport":false,"title":null,"animate":null,"support_live_photo":false,"duration":28.031,"video_fallback":{"p2p_type":null,"url_list":[],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":720,"definition":null,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":null,"height":754},"video_god_comment_urls":null,"text":"我就直说了 看到最后 你也看不到啥","cover_image":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564},"video_mid":null,"video_id":"v0d04cg10000c2k4heoeoev1doqf30a0"},"content":"我就直说了 看到最后 你也看不到啥","cover":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"},{"url":"https://p5-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"duration":28.031,"default_schema":null,"item_cell_type":1,"drainage_info":null,"text_schema":[],"can_download":true,"status":0}
                 * images : null
                 * like_count : 86619
                 * video_download : null
                 * create_time : 1621649642
                 * is_jiegeng : false
                 * ward_info : {"trend_messages":[],"is_visible":false,"has_new":false,"ward_comment_id":0,"ward_count":43,"ward_reply_id":0,"is_ward":false,"ward_users":[{"live_auth":false,"achievements":null,"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"99027242018","profile_schema":"bds://user/profile?user_id=99027242018&page_index=1","id":99027242018,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"没了对象省了流量","interaction_limitation":null,"region":"cn","is_following":null,"status":null},{"live_auth":false,"achievements":null,"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"99027091060","profile_schema":"bds://user/profile?user_id=99027091060&page_index=1","id":99027091060,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~c5_200x200_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/66da8188944742258dec9ca07699a5a4","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"开黄钻是为了隐藏访问记录","interaction_limitation":null,"region":"cn","is_following":null,"status":null},{"live_auth":false,"achievements":null,"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"99027293940","profile_schema":"bds://user/profile?user_id=99027293940&page_index=1","id":99027293940,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~c5_200x200_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~tplv-ppx-logo.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/0117f499c54e4627b4135333128ddd36","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"一只猫的单身史","interaction_limitation":null,"region":"cn","is_following":null,"status":null}]}
                 * reply_count : 160
                 * labels : null
                 * is_ward_comment : false
                 * replies : []
                 * log_comment_extra : {"comment_source":"200","comment_genre":"1","comment_quality":"5","comment_refer_user_num":"0","god_comment_queue":"","god_comment_time":1621658939,"cell_insert_eye_status":null}
                 * status : 5
                 * frozen_toast :
                 * video : null
                 * with_repost : false
                 * highlight : false
                 * has_author_like : false
                 * bury_count : 120
                 * share : {"share_text":"[皮皮虾]ICU目标客户\n","qq_strategy":4,"schema":"bds://comment/detail?comment_id=6964932181558827301","weixin_strategy":4,"wechat_url":"https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=weixin&timestamp=1627463878","qzone_strategy":4,"qzone_url":"https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=qzone&timestamp=1627463878","image_url":"https://p1-ppx.byteimg.com/img/p1056/cbccb44c6fda4d2494f360ad7fa5dca1~c5_300x300_q60.jpeg","android":{"qq_strategy":4,"weixin_strategy":4,"qzone_strategy":4,"channel":1,"moments_strategy":4},"qq_url":"https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=mobile_qq&timestamp=1627463878","title":"ICU目标客户","ios":{"qq_strategy":4,"weixin_strategy":4,"qzone_strategy":4,"channel":1,"moments_strategy":4},"compound_page_url":"https://h5.pipix.com/bds_web/share/backup/?item_id=6964896912050755875&cell_type=8&cell_id=6964932181558827301&carrier_region=cn&region=cn&language=zh&app_id=0","content":"[皮皮虾] 搞笑娱乐神评论，皮这一下很开心","moments_url":"https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=weixin_moments&timestamp=1627463878","large_image_url":"","share_url":"https://h5.pipix.com/item/6964896912050755875?cell_type=8&cell_id=6964932181558827301&carrier_region=cn&region=cn&language=zh&app_id=0","moments_strategy":4,"link_text":"ICU目标客户\nhttps://h5.pipix.com/item/6964896912050755875?cell_type=8&cell_id=6964932181558827301&carrier_region=cn&region=cn&language=zh&app_id=0"}
                 * bds_origin_type : 1
                 * lightspot_time : -1
                 * ward_content_type : 0
                 * item_id : 6964896912050755875
                 * author_display_tags : null
                 * comment_id : 6964932181558827301
                 * alias_item_id : null
                 * share_count : null
                 * has_favorite : null
                 * text_schema : []
                 * user : {"live_auth":false,"achievements":[],"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"103507429173","profile_schema":"bds://user/profile?user_id=103507429173&page_index=1","id":103507429173,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":[{"decoration_infos":[{"schema":"","decoration_type":2,"decoration_id":0,"icon":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/b642862f2a6a42b8a195bf5d8ffa9c44~c5_360x360_q60.png","description":"神评手"}],"category":2}],"avatar":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg"}],"download_list":[{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c"}],"width":200,"uri":"tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"擎天柱大哥","interaction_limitation":null,"region":"cn","is_following":null,"status":0}
                 * root_cell_type : 1
                 * can_download : true
                 */
                private String comment_count;
                private String image_thumbs;
                private boolean has_liked;
                private List<?> reveal_replies;
                private int type;
                private long root_cell_id;
                private boolean support_live_photo;
                private String cover;
                private String video_fallback;
                private boolean has_buried;
                private String origin_item;
                private Interact_eggEntity interact_egg;
                private boolean can_delete;
                private String text;
                private int send_god_status;
                private String comment_id_str;
                private ItemEntity item;
                private String images;
                private int like_count;
                private String video_download;
                private int create_time;
                private boolean is_jiegeng;
                private Ward_infoEntity ward_info;
                private int reply_count;
                private String labels;
                private boolean is_ward_comment;
                private List<?> replies;
                private String log_comment_extra;
                private int status;
                private String frozen_toast;
                private String video;
                private boolean with_repost;
                private boolean highlight;
                private boolean has_author_like;
                private int bury_count;
                private ShareEntity share;
                private int bds_origin_type;
                private int lightspot_time;
                private int ward_content_type;
                private long item_id;
                private String author_display_tags;
                private long comment_id;
                private String alias_item_id;
                private String share_count;
                private String has_favorite;
                private List<?> text_schema;
                private UserEntity user;
                private int root_cell_type;
                private boolean can_download;

                public void setComment_count(String comment_count) {
                    this.comment_count = comment_count;
                }

                public void setImage_thumbs(String image_thumbs) {
                    this.image_thumbs = image_thumbs;
                }

                public void setHas_liked(boolean has_liked) {
                    this.has_liked = has_liked;
                }

                public void setReveal_replies(List<?> reveal_replies) {
                    this.reveal_replies = reveal_replies;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public void setRoot_cell_id(long root_cell_id) {
                    this.root_cell_id = root_cell_id;
                }

                public void setSupport_live_photo(boolean support_live_photo) {
                    this.support_live_photo = support_live_photo;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public void setVideo_fallback(String video_fallback) {
                    this.video_fallback = video_fallback;
                }

                public void setHas_buried(boolean has_buried) {
                    this.has_buried = has_buried;
                }

                public void setOrigin_item(String origin_item) {
                    this.origin_item = origin_item;
                }

                public void setInteract_egg(Interact_eggEntity interact_egg) {
                    this.interact_egg = interact_egg;
                }

                public void setCan_delete(boolean can_delete) {
                    this.can_delete = can_delete;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public void setSend_god_status(int send_god_status) {
                    this.send_god_status = send_god_status;
                }

                public void setComment_id_str(String comment_id_str) {
                    this.comment_id_str = comment_id_str;
                }

                public void setItem(ItemEntity item) {
                    this.item = item;
                }

                public void setImages(String images) {
                    this.images = images;
                }

                public void setLike_count(int like_count) {
                    this.like_count = like_count;
                }

                public void setVideo_download(String video_download) {
                    this.video_download = video_download;
                }

                public void setCreate_time(int create_time) {
                    this.create_time = create_time;
                }

                public void setIs_jiegeng(boolean is_jiegeng) {
                    this.is_jiegeng = is_jiegeng;
                }

                public void setWard_info(Ward_infoEntity ward_info) {
                    this.ward_info = ward_info;
                }

                public void setReply_count(int reply_count) {
                    this.reply_count = reply_count;
                }

                public void setLabels(String labels) {
                    this.labels = labels;
                }

                public void setIs_ward_comment(boolean is_ward_comment) {
                    this.is_ward_comment = is_ward_comment;
                }

                public void setReplies(List<?> replies) {
                    this.replies = replies;
                }

                public void setLog_comment_extra(String log_comment_extra) {
                    this.log_comment_extra = log_comment_extra;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public void setFrozen_toast(String frozen_toast) {
                    this.frozen_toast = frozen_toast;
                }

                public void setVideo(String video) {
                    this.video = video;
                }

                public void setWith_repost(boolean with_repost) {
                    this.with_repost = with_repost;
                }

                public void setHighlight(boolean highlight) {
                    this.highlight = highlight;
                }

                public void setHas_author_like(boolean has_author_like) {
                    this.has_author_like = has_author_like;
                }

                public void setBury_count(int bury_count) {
                    this.bury_count = bury_count;
                }

                public void setShare(ShareEntity share) {
                    this.share = share;
                }

                public void setBds_origin_type(int bds_origin_type) {
                    this.bds_origin_type = bds_origin_type;
                }

                public void setLightspot_time(int lightspot_time) {
                    this.lightspot_time = lightspot_time;
                }

                public void setWard_content_type(int ward_content_type) {
                    this.ward_content_type = ward_content_type;
                }

                public void setItem_id(long item_id) {
                    this.item_id = item_id;
                }

                public void setAuthor_display_tags(String author_display_tags) {
                    this.author_display_tags = author_display_tags;
                }

                public void setComment_id(long comment_id) {
                    this.comment_id = comment_id;
                }

                public void setAlias_item_id(String alias_item_id) {
                    this.alias_item_id = alias_item_id;
                }

                public void setShare_count(String share_count) {
                    this.share_count = share_count;
                }

                public void setHas_favorite(String has_favorite) {
                    this.has_favorite = has_favorite;
                }

                public void setText_schema(List<?> text_schema) {
                    this.text_schema = text_schema;
                }

                public void setUser(UserEntity user) {
                    this.user = user;
                }

                public void setRoot_cell_type(int root_cell_type) {
                    this.root_cell_type = root_cell_type;
                }

                public void setCan_download(boolean can_download) {
                    this.can_download = can_download;
                }

                public String getComment_count() {
                    return comment_count;
                }

                public String getImage_thumbs() {
                    return image_thumbs;
                }

                public boolean isHas_liked() {
                    return has_liked;
                }

                public List<?> getReveal_replies() {
                    return reveal_replies;
                }

                public int getType() {
                    return type;
                }

                public long getRoot_cell_id() {
                    return root_cell_id;
                }

                public boolean isSupport_live_photo() {
                    return support_live_photo;
                }

                public String getCover() {
                    return cover;
                }

                public String getVideo_fallback() {
                    return video_fallback;
                }

                public boolean isHas_buried() {
                    return has_buried;
                }

                public String getOrigin_item() {
                    return origin_item;
                }

                public Interact_eggEntity getInteract_egg() {
                    return interact_egg;
                }

                public boolean isCan_delete() {
                    return can_delete;
                }

                public String getText() {
                    return text;
                }

                public int getSend_god_status() {
                    return send_god_status;
                }

                public String getComment_id_str() {
                    return comment_id_str;
                }

                public ItemEntity getItem() {
                    return item;
                }

                public String getImages() {
                    return images;
                }

                public int getLike_count() {
                    return like_count;
                }

                public String getVideo_download() {
                    return video_download;
                }

                public int getCreate_time() {
                    return create_time;
                }

                public boolean isIs_jiegeng() {
                    return is_jiegeng;
                }

                public Ward_infoEntity getWard_info() {
                    return ward_info;
                }

                public int getReply_count() {
                    return reply_count;
                }

                public String getLabels() {
                    return labels;
                }

                public boolean isIs_ward_comment() {
                    return is_ward_comment;
                }

                public List<?> getReplies() {
                    return replies;
                }

                public String getLog_comment_extra() {
                    return log_comment_extra;
                }

                public int getStatus() {
                    return status;
                }

                public String getFrozen_toast() {
                    return frozen_toast;
                }

                public String getVideo() {
                    return video;
                }

                public boolean isWith_repost() {
                    return with_repost;
                }

                public boolean isHighlight() {
                    return highlight;
                }

                public boolean isHas_author_like() {
                    return has_author_like;
                }

                public int getBury_count() {
                    return bury_count;
                }

                public ShareEntity getShare() {
                    return share;
                }

                public int getBds_origin_type() {
                    return bds_origin_type;
                }

                public int getLightspot_time() {
                    return lightspot_time;
                }

                public int getWard_content_type() {
                    return ward_content_type;
                }

                public long getItem_id() {
                    return item_id;
                }

                public String getAuthor_display_tags() {
                    return author_display_tags;
                }

                public long getComment_id() {
                    return comment_id;
                }

                public String getAlias_item_id() {
                    return alias_item_id;
                }

                public String getShare_count() {
                    return share_count;
                }

                public String getHas_favorite() {
                    return has_favorite;
                }

                public List<?> getText_schema() {
                    return text_schema;
                }

                public UserEntity getUser() {
                    return user;
                }

                public int getRoot_cell_type() {
                    return root_cell_type;
                }

                public boolean isCan_download() {
                    return can_download;
                }

                public class Interact_eggEntity {
                    /**
                     * like_style : default
                     */
                    private String like_style;

                    public void setLike_style(String like_style) {
                        this.like_style = like_style;
                    }

                    public String getLike_style() {
                        return like_style;
                    }
                }

                public class ItemEntity {
                    /**
                     * note : null
                     * create_time : 1621641431
                     * item_id : 6964896912050755875
                     * item_id_str : 6964896912050755875
                     * item_type : 2
                     * author : {"live_auth":false,"achievements":[],"description":"男人也是永远长不大的男孩","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"73144436042","profile_schema":"bds://user/profile?user_id=73144436042&page_index=1","id":73144436042,"vote_count":0,"broadcast_info":null,"author_info":{"owner":"script","recommend_tag":"","author_item_type":1,"user_id":73144436042,"level":0,"author_type":104007473,"origin_status":0,"username":"BoyFun","tags":[]},"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"}],"download_list":[{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"}],"width":200,"uri":"tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"BoyFun","interaction_limitation":null,"region":"cn","is_following":null,"status":0}
                     * link : null
                     * video : {"hashtag_schema":[],"video_height":754,"video_download":{"p2p_type":null,"url_list":[],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":720,"definition":null,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":null,"height":754},"transport_text":"","video_width":720,"video_low":null,"video_high":{"p2p_type":null,"url_list":[{"expires":604800,"url":"http://v3-ppx.ixigua.com/c83561088f46199e4f2caa057dbd7e1f/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="},{"expires":604800,"url":"http://v6-ppx.ixigua.com/b19113400d31986bd719661a8c536367/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="}],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":540,"definition":3,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564},"codec_type":1,"height":564},"tail_ad_passthrough":"","transport":false,"title":null,"animate":null,"support_live_photo":false,"duration":28.031,"video_fallback":{"p2p_type":null,"url_list":[],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":720,"definition":null,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":null,"height":754},"video_god_comment_urls":null,"text":"我就直说了 看到最后 你也看不到啥","cover_image":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564},"video_mid":null,"video_id":"v0d04cg10000c2k4heoeoev1doqf30a0"}
                     * content : 我就直说了 看到最后 你也看不到啥
                     * cover : {"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"},{"url":"https://p5-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754}
                     * duration : 28.031
                     * default_schema : null
                     * item_cell_type : 1
                     * drainage_info : null
                     * text_schema : []
                     * can_download : true
                     * status : 0
                     */
                    private String note;
                    private int create_time;
                    private long item_id;
                    private String item_id_str;
                    private int item_type;
                    private AuthorEntity author;
                    private String link;
                    private VideoEntity video;
                    private String content;
                    private CoverEntity cover;
                    private double duration;
                    private String default_schema;
                    private int item_cell_type;
                    private String drainage_info;
                    private List<?> text_schema;
                    private boolean can_download;
                    private int status;

                    public void setNote(String note) {
                        this.note = note;
                    }

                    public void setCreate_time(int create_time) {
                        this.create_time = create_time;
                    }

                    public void setItem_id(long item_id) {
                        this.item_id = item_id;
                    }

                    public void setItem_id_str(String item_id_str) {
                        this.item_id_str = item_id_str;
                    }

                    public void setItem_type(int item_type) {
                        this.item_type = item_type;
                    }

                    public void setAuthor(AuthorEntity author) {
                        this.author = author;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public void setVideo(VideoEntity video) {
                        this.video = video;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public void setCover(CoverEntity cover) {
                        this.cover = cover;
                    }

                    public void setDuration(double duration) {
                        this.duration = duration;
                    }

                    public void setDefault_schema(String default_schema) {
                        this.default_schema = default_schema;
                    }

                    public void setItem_cell_type(int item_cell_type) {
                        this.item_cell_type = item_cell_type;
                    }

                    public void setDrainage_info(String drainage_info) {
                        this.drainage_info = drainage_info;
                    }

                    public void setText_schema(List<?> text_schema) {
                        this.text_schema = text_schema;
                    }

                    public void setCan_download(boolean can_download) {
                        this.can_download = can_download;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public String getNote() {
                        return note;
                    }

                    public int getCreate_time() {
                        return create_time;
                    }

                    public long getItem_id() {
                        return item_id;
                    }

                    public String getItem_id_str() {
                        return item_id_str;
                    }

                    public int getItem_type() {
                        return item_type;
                    }

                    public AuthorEntity getAuthor() {
                        return author;
                    }

                    public String getLink() {
                        return link;
                    }

                    public VideoEntity getVideo() {
                        return video;
                    }

                    public String getContent() {
                        return content;
                    }

                    public CoverEntity getCover() {
                        return cover;
                    }

                    public double getDuration() {
                        return duration;
                    }

                    public String getDefault_schema() {
                        return default_schema;
                    }

                    public int getItem_cell_type() {
                        return item_cell_type;
                    }

                    public String getDrainage_info() {
                        return drainage_info;
                    }

                    public List<?> getText_schema() {
                        return text_schema;
                    }

                    public boolean isCan_download() {
                        return can_download;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public class AuthorEntity {
                        /**
                         * live_auth : false
                         * achievements : []
                         * description : 男人也是永远长不大的男孩
                         * language : zh
                         * recommend_reason : null
                         * certify_info : null
                         * punishments : null
                         * id_str : 73144436042
                         * profile_schema : bds://user/profile?user_id=73144436042&page_index=1
                         * id : 73144436042
                         * vote_count : 0
                         * broadcast_info : null
                         * author_info : {"owner":"script","recommend_tag":"","author_item_type":1,"user_id":73144436042,"level":0,"author_type":104007473,"origin_status":0,"username":"BoyFun","tags":[]}
                         * like_count : null
                         * recommend_tag : null
                         * level : 0
                         * god_comment_count : null
                         * commerce_permission_list : null
                         * is_followed : null
                         * decoration_list : null
                         * avatar : {"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"}],"download_list":[{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"}],"width":200,"uri":"tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db","height":200}
                         * followings_count : null
                         * creative_level_info : null
                         * followers_count : null
                         * name : BoyFun
                         * interaction_limitation : null
                         * region : cn
                         * is_following : null
                         * status : 0
                         */
                        private boolean live_auth;
                        private List<?> achievements;
                        private String description;
                        private String language;
                        private String recommend_reason;
                        private String certify_info;
                        private String punishments;
                        private String id_str;
                        private String profile_schema;
                        private long id;
                        private int vote_count;
                        private String broadcast_info;
                        private Author_infoEntity author_info;
                        private String like_count;
                        private String recommend_tag;
                        private int level;
                        private String god_comment_count;
                        private String commerce_permission_list;
                        private String is_followed;
                        private String decoration_list;
                        private AvatarEntity avatar;
                        private String followings_count;
                        private String creative_level_info;
                        private String followers_count;
                        private String name;
                        private String interaction_limitation;
                        private String region;
                        private String is_following;
                        private int status;

                        public void setLive_auth(boolean live_auth) {
                            this.live_auth = live_auth;
                        }

                        public void setAchievements(List<?> achievements) {
                            this.achievements = achievements;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public void setLanguage(String language) {
                            this.language = language;
                        }

                        public void setRecommend_reason(String recommend_reason) {
                            this.recommend_reason = recommend_reason;
                        }

                        public void setCertify_info(String certify_info) {
                            this.certify_info = certify_info;
                        }

                        public void setPunishments(String punishments) {
                            this.punishments = punishments;
                        }

                        public void setId_str(String id_str) {
                            this.id_str = id_str;
                        }

                        public void setProfile_schema(String profile_schema) {
                            this.profile_schema = profile_schema;
                        }

                        public void setId(long id) {
                            this.id = id;
                        }

                        public void setVote_count(int vote_count) {
                            this.vote_count = vote_count;
                        }

                        public void setBroadcast_info(String broadcast_info) {
                            this.broadcast_info = broadcast_info;
                        }

                        public void setAuthor_info(Author_infoEntity author_info) {
                            this.author_info = author_info;
                        }

                        public void setLike_count(String like_count) {
                            this.like_count = like_count;
                        }

                        public void setRecommend_tag(String recommend_tag) {
                            this.recommend_tag = recommend_tag;
                        }

                        public void setLevel(int level) {
                            this.level = level;
                        }

                        public void setGod_comment_count(String god_comment_count) {
                            this.god_comment_count = god_comment_count;
                        }

                        public void setCommerce_permission_list(String commerce_permission_list) {
                            this.commerce_permission_list = commerce_permission_list;
                        }

                        public void setIs_followed(String is_followed) {
                            this.is_followed = is_followed;
                        }

                        public void setDecoration_list(String decoration_list) {
                            this.decoration_list = decoration_list;
                        }

                        public void setAvatar(AvatarEntity avatar) {
                            this.avatar = avatar;
                        }

                        public void setFollowings_count(String followings_count) {
                            this.followings_count = followings_count;
                        }

                        public void setCreative_level_info(String creative_level_info) {
                            this.creative_level_info = creative_level_info;
                        }

                        public void setFollowers_count(String followers_count) {
                            this.followers_count = followers_count;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public void setInteraction_limitation(String interaction_limitation) {
                            this.interaction_limitation = interaction_limitation;
                        }

                        public void setRegion(String region) {
                            this.region = region;
                        }

                        public void setIs_following(String is_following) {
                            this.is_following = is_following;
                        }

                        public void setStatus(int status) {
                            this.status = status;
                        }

                        public boolean isLive_auth() {
                            return live_auth;
                        }

                        public List<?> getAchievements() {
                            return achievements;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public String getLanguage() {
                            return language;
                        }

                        public String getRecommend_reason() {
                            return recommend_reason;
                        }

                        public String getCertify_info() {
                            return certify_info;
                        }

                        public String getPunishments() {
                            return punishments;
                        }

                        public String getId_str() {
                            return id_str;
                        }

                        public String getProfile_schema() {
                            return profile_schema;
                        }

                        public long getId() {
                            return id;
                        }

                        public int getVote_count() {
                            return vote_count;
                        }

                        public String getBroadcast_info() {
                            return broadcast_info;
                        }

                        public Author_infoEntity getAuthor_info() {
                            return author_info;
                        }

                        public String getLike_count() {
                            return like_count;
                        }

                        public String getRecommend_tag() {
                            return recommend_tag;
                        }

                        public int getLevel() {
                            return level;
                        }

                        public String getGod_comment_count() {
                            return god_comment_count;
                        }

                        public String getCommerce_permission_list() {
                            return commerce_permission_list;
                        }

                        public String getIs_followed() {
                            return is_followed;
                        }

                        public String getDecoration_list() {
                            return decoration_list;
                        }

                        public AvatarEntity getAvatar() {
                            return avatar;
                        }

                        public String getFollowings_count() {
                            return followings_count;
                        }

                        public String getCreative_level_info() {
                            return creative_level_info;
                        }

                        public String getFollowers_count() {
                            return followers_count;
                        }

                        public String getName() {
                            return name;
                        }

                        public String getInteraction_limitation() {
                            return interaction_limitation;
                        }

                        public String getRegion() {
                            return region;
                        }

                        public String getIs_following() {
                            return is_following;
                        }

                        public int getStatus() {
                            return status;
                        }

                        public class Author_infoEntity {
                            /**
                             * owner : script
                             * recommend_tag :
                             * author_item_type : 1
                             * user_id : 73144436042
                             * level : 0
                             * author_type : 104007473
                             * origin_status : 0
                             * username : BoyFun
                             * tags : []
                             */
                            private String owner;
                            private String recommend_tag;
                            private int author_item_type;
                            private long user_id;
                            private int level;
                            private int author_type;
                            private int origin_status;
                            private String username;
                            private List<?> tags;

                            public void setOwner(String owner) {
                                this.owner = owner;
                            }

                            public void setRecommend_tag(String recommend_tag) {
                                this.recommend_tag = recommend_tag;
                            }

                            public void setAuthor_item_type(int author_item_type) {
                                this.author_item_type = author_item_type;
                            }

                            public void setUser_id(long user_id) {
                                this.user_id = user_id;
                            }

                            public void setLevel(int level) {
                                this.level = level;
                            }

                            public void setAuthor_type(int author_type) {
                                this.author_type = author_type;
                            }

                            public void setOrigin_status(int origin_status) {
                                this.origin_status = origin_status;
                            }

                            public void setUsername(String username) {
                                this.username = username;
                            }

                            public void setTags(List<?> tags) {
                                this.tags = tags;
                            }

                            public String getOwner() {
                                return owner;
                            }

                            public String getRecommend_tag() {
                                return recommend_tag;
                            }

                            public int getAuthor_item_type() {
                                return author_item_type;
                            }

                            public long getUser_id() {
                                return user_id;
                            }

                            public int getLevel() {
                                return level;
                            }

                            public int getAuthor_type() {
                                return author_type;
                            }

                            public int getOrigin_status() {
                                return origin_status;
                            }

                            public String getUsername() {
                                return username;
                            }

                            public List<?> getTags() {
                                return tags;
                            }
                        }

                        public class AvatarEntity {
                            /**
                             * is_gif : false
                             * url_list : [{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg"}]
                             * download_list : [{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db"}]
                             * width : 200
                             * uri : tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db
                             * height : 200
                             */
                            private boolean is_gif;
                            private List<Url_listEntity> url_list;
                            private List<Download_listEntity> download_list;
                            private int width;
                            private String uri;
                            private int height;

                            public void setIs_gif(boolean is_gif) {
                                this.is_gif = is_gif;
                            }

                            public void setUrl_list(List<Url_listEntity> url_list) {
                                this.url_list = url_list;
                            }

                            public void setDownload_list(List<Download_listEntity> download_list) {
                                this.download_list = download_list;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public boolean isIs_gif() {
                                return is_gif;
                            }

                            public List<Url_listEntity> getUrl_list() {
                                return url_list;
                            }

                            public List<Download_listEntity> getDownload_list() {
                                return download_list;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public String getUri() {
                                return uri;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public class Url_listEntity {
                                /**
                                 * url : https://p1-ppx.byteimg.com/img/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db~200x200.jpeg
                                 */
                                private String url;

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }

                            public class Download_listEntity {
                                /**
                                 * url : https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/d290fe02e84b48498e4f0782ae5e32db
                                 */
                                private String url;

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }
                        }
                    }

                    public class VideoEntity {
                        /**
                         * hashtag_schema : []
                         * video_height : 754
                         * video_download : {"p2p_type":null,"url_list":[],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":720,"definition":null,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":null,"height":754}
                         * transport_text :
                         * video_width : 720
                         * video_low : null
                         * video_high : {"p2p_type":null,"url_list":[{"expires":604800,"url":"http://v3-ppx.ixigua.com/c83561088f46199e4f2caa057dbd7e1f/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="},{"expires":604800,"url":"http://v6-ppx.ixigua.com/b19113400d31986bd719661a8c536367/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="}],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":540,"definition":3,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564},"codec_type":1,"height":564}
                         * tail_ad_passthrough :
                         * transport : false
                         * title : null
                         * animate : null
                         * support_live_photo : false
                         * duration : 28.031
                         * video_fallback : {"p2p_type":null,"url_list":[],"alarm_text":"操作有风险，请勿模仿","uri":"v0d04cg10000c2k4heoeoev1doqf30a0","duration":28.031,"animated_cover_image":null,"file_hash":null,"width":720,"definition":null,"video_model":"","cover_image":{"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754},"codec_type":null,"height":754}
                         * video_god_comment_urls : null
                         * text : 我就直说了 看到最后 你也看不到啥
                         * cover_image : {"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564}
                         * video_mid : null
                         * video_id : v0d04cg10000c2k4heoeoev1doqf30a0
                         */
                        private List<?> hashtag_schema;
                        private int video_height;
                        private Video_downloadEntity video_download;
                        private String transport_text;
                        private int video_width;
                        private String video_low;
                        private Video_highEntity video_high;
                        private String tail_ad_passthrough;
                        private boolean transport;
                        private String title;
                        private String animate;
                        private boolean support_live_photo;
                        private double duration;
                        private Video_fallbackEntity video_fallback;
                        private String video_god_comment_urls;
                        private String text;
                        private Cover_imageEntity cover_image;
                        private String video_mid;
                        private String video_id;

                        public void setHashtag_schema(List<?> hashtag_schema) {
                            this.hashtag_schema = hashtag_schema;
                        }

                        public void setVideo_height(int video_height) {
                            this.video_height = video_height;
                        }

                        public void setVideo_download(Video_downloadEntity video_download) {
                            this.video_download = video_download;
                        }

                        public void setTransport_text(String transport_text) {
                            this.transport_text = transport_text;
                        }

                        public void setVideo_width(int video_width) {
                            this.video_width = video_width;
                        }

                        public void setVideo_low(String video_low) {
                            this.video_low = video_low;
                        }

                        public void setVideo_high(Video_highEntity video_high) {
                            this.video_high = video_high;
                        }

                        public void setTail_ad_passthrough(String tail_ad_passthrough) {
                            this.tail_ad_passthrough = tail_ad_passthrough;
                        }

                        public void setTransport(boolean transport) {
                            this.transport = transport;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public void setAnimate(String animate) {
                            this.animate = animate;
                        }

                        public void setSupport_live_photo(boolean support_live_photo) {
                            this.support_live_photo = support_live_photo;
                        }

                        public void setDuration(double duration) {
                            this.duration = duration;
                        }

                        public void setVideo_fallback(Video_fallbackEntity video_fallback) {
                            this.video_fallback = video_fallback;
                        }

                        public void setVideo_god_comment_urls(String video_god_comment_urls) {
                            this.video_god_comment_urls = video_god_comment_urls;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public void setCover_image(Cover_imageEntity cover_image) {
                            this.cover_image = cover_image;
                        }

                        public void setVideo_mid(String video_mid) {
                            this.video_mid = video_mid;
                        }

                        public void setVideo_id(String video_id) {
                            this.video_id = video_id;
                        }

                        public List<?> getHashtag_schema() {
                            return hashtag_schema;
                        }

                        public int getVideo_height() {
                            return video_height;
                        }

                        public Video_downloadEntity getVideo_download() {
                            return video_download;
                        }

                        public String getTransport_text() {
                            return transport_text;
                        }

                        public int getVideo_width() {
                            return video_width;
                        }

                        public String getVideo_low() {
                            return video_low;
                        }

                        public Video_highEntity getVideo_high() {
                            return video_high;
                        }

                        public String getTail_ad_passthrough() {
                            return tail_ad_passthrough;
                        }

                        public boolean isTransport() {
                            return transport;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public String getAnimate() {
                            return animate;
                        }

                        public boolean isSupport_live_photo() {
                            return support_live_photo;
                        }

                        public double getDuration() {
                            return duration;
                        }

                        public Video_fallbackEntity getVideo_fallback() {
                            return video_fallback;
                        }

                        public String getVideo_god_comment_urls() {
                            return video_god_comment_urls;
                        }

                        public String getText() {
                            return text;
                        }

                        public Cover_imageEntity getCover_image() {
                            return cover_image;
                        }

                        public String getVideo_mid() {
                            return video_mid;
                        }

                        public String getVideo_id() {
                            return video_id;
                        }

                        public class Video_downloadEntity {
                            /**
                             * p2p_type : null
                             * url_list : []
                             * alarm_text : 操作有风险，请勿模仿
                             * uri : v0d04cg10000c2k4heoeoev1doqf30a0
                             * duration : 28.031
                             * animated_cover_image : null
                             * file_hash : null
                             * width : 720
                             * definition : null
                             * video_model :
                             * cover_image : {"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754}
                             * codec_type : null
                             * height : 754
                             */
                            private String p2p_type;
                            private List<?> url_list;
                            private String alarm_text;
                            private String uri;
                            private double duration;
                            private String animated_cover_image;
                            private String file_hash;
                            private int width;
                            private String definition;
                            private String video_model;
                            private Cover_imageEntity cover_image;
                            private String codec_type;
                            private int height;

                            public void setP2p_type(String p2p_type) {
                                this.p2p_type = p2p_type;
                            }

                            public void setUrl_list(List<?> url_list) {
                                this.url_list = url_list;
                            }

                            public void setAlarm_text(String alarm_text) {
                                this.alarm_text = alarm_text;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
                            }

                            public void setDuration(double duration) {
                                this.duration = duration;
                            }

                            public void setAnimated_cover_image(String animated_cover_image) {
                                this.animated_cover_image = animated_cover_image;
                            }

                            public void setFile_hash(String file_hash) {
                                this.file_hash = file_hash;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public void setDefinition(String definition) {
                                this.definition = definition;
                            }

                            public void setVideo_model(String video_model) {
                                this.video_model = video_model;
                            }

                            public void setCover_image(Cover_imageEntity cover_image) {
                                this.cover_image = cover_image;
                            }

                            public void setCodec_type(String codec_type) {
                                this.codec_type = codec_type;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public String getP2p_type() {
                                return p2p_type;
                            }

                            public List<?> getUrl_list() {
                                return url_list;
                            }

                            public String getAlarm_text() {
                                return alarm_text;
                            }

                            public String getUri() {
                                return uri;
                            }

                            public double getDuration() {
                                return duration;
                            }

                            public String getAnimated_cover_image() {
                                return animated_cover_image;
                            }

                            public String getFile_hash() {
                                return file_hash;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public String getDefinition() {
                                return definition;
                            }

                            public String getVideo_model() {
                                return video_model;
                            }

                            public Cover_imageEntity getCover_image() {
                                return cover_image;
                            }

                            public String getCodec_type() {
                                return codec_type;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public class Cover_imageEntity {
                                /**
                                 * is_gif : false
                                 * url_list : [{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}]
                                 * download_list : null
                                 * width : 720
                                 * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                                 * height : 754
                                 */
                                private boolean is_gif;
                                private List<Url_listEntity> url_list;
                                private String download_list;
                                private int width;
                                private String uri;
                                private int height;

                                public void setIs_gif(boolean is_gif) {
                                    this.is_gif = is_gif;
                                }

                                public void setUrl_list(List<Url_listEntity> url_list) {
                                    this.url_list = url_list;
                                }

                                public void setDownload_list(String download_list) {
                                    this.download_list = download_list;
                                }

                                public void setWidth(int width) {
                                    this.width = width;
                                }

                                public void setUri(String uri) {
                                    this.uri = uri;
                                }

                                public void setHeight(int height) {
                                    this.height = height;
                                }

                                public boolean isIs_gif() {
                                    return is_gif;
                                }

                                public List<Url_listEntity> getUrl_list() {
                                    return url_list;
                                }

                                public String getDownload_list() {
                                    return download_list;
                                }

                                public int getWidth() {
                                    return width;
                                }

                                public String getUri() {
                                    return uri;
                                }

                                public int getHeight() {
                                    return height;
                                }

                                public class Url_listEntity {
                                    /**
                                     * url : https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg
                                     */
                                    private String url;

                                    public void setUrl(String url) {
                                        this.url = url;
                                    }

                                    public String getUrl() {
                                        return url;
                                    }
                                }
                            }
                        }

                        public class Video_highEntity {
                            /**
                             * p2p_type : null
                             * url_list : [{"expires":604800,"url":"http://v3-ppx.ixigua.com/c83561088f46199e4f2caa057dbd7e1f/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="},{"expires":604800,"url":"http://v6-ppx.ixigua.com/b19113400d31986bd719661a8c536367/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr="}]
                             * alarm_text : 操作有风险，请勿模仿
                             * uri : v0d04cg10000c2k4heoeoev1doqf30a0
                             * duration : 28.031
                             * animated_cover_image : null
                             * file_hash : null
                             * width : 540
                             * definition : 3
                             * video_model :
                             * cover_image : {"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}],"width":540,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":564}
                             * codec_type : 1
                             * height : 564
                             */
                            private String p2p_type;
                            private List<Url_listEntity> url_list;
                            private String alarm_text;
                            private String uri;
                            private double duration;
                            private String animated_cover_image;
                            private String file_hash;
                            private int width;
                            private int definition;
                            private String video_model;
                            private Cover_imageEntity cover_image;
                            private int codec_type;
                            private int height;

                            public void setP2p_type(String p2p_type) {
                                this.p2p_type = p2p_type;
                            }

                            public void setUrl_list(List<Url_listEntity> url_list) {
                                this.url_list = url_list;
                            }

                            public void setAlarm_text(String alarm_text) {
                                this.alarm_text = alarm_text;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
                            }

                            public void setDuration(double duration) {
                                this.duration = duration;
                            }

                            public void setAnimated_cover_image(String animated_cover_image) {
                                this.animated_cover_image = animated_cover_image;
                            }

                            public void setFile_hash(String file_hash) {
                                this.file_hash = file_hash;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public void setDefinition(int definition) {
                                this.definition = definition;
                            }

                            public void setVideo_model(String video_model) {
                                this.video_model = video_model;
                            }

                            public void setCover_image(Cover_imageEntity cover_image) {
                                this.cover_image = cover_image;
                            }

                            public void setCodec_type(int codec_type) {
                                this.codec_type = codec_type;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public String getP2p_type() {
                                return p2p_type;
                            }

                            public List<Url_listEntity> getUrl_list() {
                                return url_list;
                            }

                            public String getAlarm_text() {
                                return alarm_text;
                            }

                            public String getUri() {
                                return uri;
                            }

                            public double getDuration() {
                                return duration;
                            }

                            public String getAnimated_cover_image() {
                                return animated_cover_image;
                            }

                            public String getFile_hash() {
                                return file_hash;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public int getDefinition() {
                                return definition;
                            }

                            public String getVideo_model() {
                                return video_model;
                            }

                            public Cover_imageEntity getCover_image() {
                                return cover_image;
                            }

                            public int getCodec_type() {
                                return codec_type;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public class Url_listEntity {
                                /**
                                 * expires : 604800
                                 * url : http://v3-ppx.ixigua.com/c83561088f46199e4f2caa057dbd7e1f/61012ef1/video/tos/cn/tos-cn-ve-0076/f1decd1a8e344207bc3a9643122ac068/?a=1319&br=671&bt=671&cd=0%7C0%7C0&ch=0&cr=0&cs=0&cv=1&dr=6&ds=6&er=&ft=5XCuhTTEHAQM_4F_4k0B7X1vkj&l=202107281717580102121640273E00A1CB&lr=&mime_type=video_mp4&net=0&pl=0&qs=0&rc=MzNpcjRoaGg3NTMzNGYzM0ApN2VnNmk7N2Q2NzhpNWRkZmdeMG5hc2xsZWhgLS1kMWFzcy4yXzExMWNhXi5hLS80LTA6Yw%3D%3D&vl=&vr=
                                 */
                                private int expires;
                                private String url;

                                public void setExpires(int expires) {
                                    this.expires = expires;
                                }

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public int getExpires() {
                                    return expires;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }

                            public class Cover_imageEntity {
                                /**
                                 * is_gif : false
                                 * url_list : [{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}]
                                 * download_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}]
                                 * width : 540
                                 * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                                 * height : 564
                                 */
                                private boolean is_gif;
                                private List<Url_listEntity> url_list;
                                private List<Download_listEntity> download_list;
                                private int width;
                                private String uri;
                                private int height;

                                public void setIs_gif(boolean is_gif) {
                                    this.is_gif = is_gif;
                                }

                                public void setUrl_list(List<Url_listEntity> url_list) {
                                    this.url_list = url_list;
                                }

                                public void setDownload_list(List<Download_listEntity> download_list) {
                                    this.download_list = download_list;
                                }

                                public void setWidth(int width) {
                                    this.width = width;
                                }

                                public void setUri(String uri) {
                                    this.uri = uri;
                                }

                                public void setHeight(int height) {
                                    this.height = height;
                                }

                                public boolean isIs_gif() {
                                    return is_gif;
                                }

                                public List<Url_listEntity> getUrl_list() {
                                    return url_list;
                                }

                                public List<Download_listEntity> getDownload_list() {
                                    return download_list;
                                }

                                public int getWidth() {
                                    return width;
                                }

                                public String getUri() {
                                    return uri;
                                }

                                public int getHeight() {
                                    return height;
                                }

                                public class Url_listEntity {
                                    /**
                                     * url : https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg
                                     */
                                    private String url;

                                    public void setUrl(String url) {
                                        this.url = url;
                                    }

                                    public String getUrl() {
                                        return url;
                                    }
                                }

                                public class Download_listEntity {
                                    /**
                                     * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg
                                     */
                                    private String url;

                                    public void setUrl(String url) {
                                        this.url = url;
                                    }

                                    public String getUrl() {
                                        return url;
                                    }
                                }
                            }
                        }

                        public class Video_fallbackEntity {
                            /**
                             * p2p_type : null
                             * url_list : []
                             * alarm_text : 操作有风险，请勿模仿
                             * uri : v0d04cg10000c2k4heoeoev1doqf30a0
                             * duration : 28.031
                             * animated_cover_image : null
                             * file_hash : null
                             * width : 720
                             * definition : null
                             * video_model :
                             * cover_image : {"is_gif":false,"url_list":[{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}],"download_list":null,"width":720,"uri":"tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478","height":754}
                             * codec_type : null
                             * height : 754
                             */
                            private String p2p_type;
                            private List<?> url_list;
                            private String alarm_text;
                            private String uri;
                            private double duration;
                            private String animated_cover_image;
                            private String file_hash;
                            private int width;
                            private String definition;
                            private String video_model;
                            private Cover_imageEntity cover_image;
                            private String codec_type;
                            private int height;

                            public void setP2p_type(String p2p_type) {
                                this.p2p_type = p2p_type;
                            }

                            public void setUrl_list(List<?> url_list) {
                                this.url_list = url_list;
                            }

                            public void setAlarm_text(String alarm_text) {
                                this.alarm_text = alarm_text;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
                            }

                            public void setDuration(double duration) {
                                this.duration = duration;
                            }

                            public void setAnimated_cover_image(String animated_cover_image) {
                                this.animated_cover_image = animated_cover_image;
                            }

                            public void setFile_hash(String file_hash) {
                                this.file_hash = file_hash;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public void setDefinition(String definition) {
                                this.definition = definition;
                            }

                            public void setVideo_model(String video_model) {
                                this.video_model = video_model;
                            }

                            public void setCover_image(Cover_imageEntity cover_image) {
                                this.cover_image = cover_image;
                            }

                            public void setCodec_type(String codec_type) {
                                this.codec_type = codec_type;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public String getP2p_type() {
                                return p2p_type;
                            }

                            public List<?> getUrl_list() {
                                return url_list;
                            }

                            public String getAlarm_text() {
                                return alarm_text;
                            }

                            public String getUri() {
                                return uri;
                            }

                            public double getDuration() {
                                return duration;
                            }

                            public String getAnimated_cover_image() {
                                return animated_cover_image;
                            }

                            public String getFile_hash() {
                                return file_hash;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public String getDefinition() {
                                return definition;
                            }

                            public String getVideo_model() {
                                return video_model;
                            }

                            public Cover_imageEntity getCover_image() {
                                return cover_image;
                            }

                            public String getCodec_type() {
                                return codec_type;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public class Cover_imageEntity {
                                /**
                                 * is_gif : false
                                 * url_list : [{"url":"https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}]
                                 * download_list : null
                                 * width : 720
                                 * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                                 * height : 754
                                 */
                                private boolean is_gif;
                                private List<Url_listEntity> url_list;
                                private String download_list;
                                private int width;
                                private String uri;
                                private int height;

                                public void setIs_gif(boolean is_gif) {
                                    this.is_gif = is_gif;
                                }

                                public void setUrl_list(List<Url_listEntity> url_list) {
                                    this.url_list = url_list;
                                }

                                public void setDownload_list(String download_list) {
                                    this.download_list = download_list;
                                }

                                public void setWidth(int width) {
                                    this.width = width;
                                }

                                public void setUri(String uri) {
                                    this.uri = uri;
                                }

                                public void setHeight(int height) {
                                    this.height = height;
                                }

                                public boolean isIs_gif() {
                                    return is_gif;
                                }

                                public List<Url_listEntity> getUrl_list() {
                                    return url_list;
                                }

                                public String getDownload_list() {
                                    return download_list;
                                }

                                public int getWidth() {
                                    return width;
                                }

                                public String getUri() {
                                    return uri;
                                }

                                public int getHeight() {
                                    return height;
                                }

                                public class Url_listEntity {
                                    /**
                                     * url : https://p3-ppx.bytecdn.cn/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg
                                     */
                                    private String url;

                                    public void setUrl(String url) {
                                        this.url = url;
                                    }

                                    public String getUrl() {
                                        return url;
                                    }
                                }
                            }
                        }

                        public class Cover_imageEntity {
                            /**
                             * is_gif : false
                             * url_list : [{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg"}]
                             * download_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}]
                             * width : 540
                             * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                             * height : 564
                             */
                            private boolean is_gif;
                            private List<Url_listEntity> url_list;
                            private List<Download_listEntity> download_list;
                            private int width;
                            private String uri;
                            private int height;

                            public void setIs_gif(boolean is_gif) {
                                this.is_gif = is_gif;
                            }

                            public void setUrl_list(List<Url_listEntity> url_list) {
                                this.url_list = url_list;
                            }

                            public void setDownload_list(List<Download_listEntity> download_list) {
                                this.download_list = download_list;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public boolean isIs_gif() {
                                return is_gif;
                            }

                            public List<Url_listEntity> getUrl_list() {
                                return url_list;
                            }

                            public List<Download_listEntity> getDownload_list() {
                                return download_list;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public String getUri() {
                                return uri;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public class Url_listEntity {
                                /**
                                 * url : https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~540x564_q80.jpeg
                                 */
                                private String url;

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }

                            public class Download_listEntity {
                                /**
                                 * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg
                                 */
                                private String url;

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }
                        }
                    }

                    public class CoverEntity {
                        /**
                         * is_gif : false
                         * url_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"},{"url":"https://p5-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg"}]
                         * download_list : [{"url":"https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg"}]
                         * width : 720
                         * uri : tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478
                         * height : 754
                         */
                        private boolean is_gif;
                        private List<Url_listEntity> url_list;
                        private List<Download_listEntity> download_list;
                        private int width;
                        private String uri;
                        private int height;

                        public void setIs_gif(boolean is_gif) {
                            this.is_gif = is_gif;
                        }

                        public void setUrl_list(List<Url_listEntity> url_list) {
                            this.url_list = url_list;
                        }

                        public void setDownload_list(List<Download_listEntity> download_list) {
                            this.download_list = download_list;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public boolean isIs_gif() {
                            return is_gif;
                        }

                        public List<Url_listEntity> getUrl_list() {
                            return url_list;
                        }

                        public List<Download_listEntity> getDownload_list() {
                            return download_list;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public String getUri() {
                            return uri;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public class Url_listEntity {
                            /**
                             * url : https://p9-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~720x754.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }

                        public class Download_listEntity {
                            /**
                             * url : https://p1-ppx.byteimg.com/img/tos-cn-p-0076/4b8fd7ff02b04d33ac287527da4c0bd1_1621641478~tplv-ppx-logo.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }
                    }
                }

                public class Ward_infoEntity {
                    /**
                     * trend_messages : []
                     * is_visible : false
                     * has_new : false
                     * ward_comment_id : 0
                     * ward_count : 43
                     * ward_reply_id : 0
                     * is_ward : false
                     * ward_users : [{"live_auth":false,"achievements":null,"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"99027242018","profile_schema":"bds://user/profile?user_id=99027242018&page_index=1","id":99027242018,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"没了对象省了流量","interaction_limitation":null,"region":"cn","is_following":null,"status":null},{"live_auth":false,"achievements":null,"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"99027091060","profile_schema":"bds://user/profile?user_id=99027091060&page_index=1","id":99027091060,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~c5_200x200_q80.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~tplv-ppx-logo.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/66da8188944742258dec9ca07699a5a4~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/66da8188944742258dec9ca07699a5a4","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"开黄钻是为了隐藏访问记录","interaction_limitation":null,"region":"cn","is_following":null,"status":null},{"live_auth":false,"achievements":null,"description":"","language":"zh","recommend_reason":null,"certify_info":null,"punishments":null,"id_str":"99027293940","profile_schema":"bds://user/profile?user_id=99027293940&page_index=1","id":99027293940,"vote_count":0,"broadcast_info":null,"author_info":null,"like_count":null,"recommend_tag":null,"level":0,"god_comment_count":null,"commerce_permission_list":null,"is_followed":null,"decoration_list":null,"avatar":{"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~c5_200x200_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~tplv-ppx-logo.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/0117f499c54e4627b4135333128ddd36~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/0117f499c54e4627b4135333128ddd36","height":200},"followings_count":null,"creative_level_info":null,"followers_count":null,"name":"一只猫的单身史","interaction_limitation":null,"region":"cn","is_following":null,"status":null}]
                     */
                    private List<?> trend_messages;
                    private boolean is_visible;
                    private boolean has_new;
                    private int ward_comment_id;
                    private int ward_count;
                    private int ward_reply_id;
                    private boolean is_ward;
                    private List<Ward_usersEntity> ward_users;

                    public void setTrend_messages(List<?> trend_messages) {
                        this.trend_messages = trend_messages;
                    }

                    public void setIs_visible(boolean is_visible) {
                        this.is_visible = is_visible;
                    }

                    public void setHas_new(boolean has_new) {
                        this.has_new = has_new;
                    }

                    public void setWard_comment_id(int ward_comment_id) {
                        this.ward_comment_id = ward_comment_id;
                    }

                    public void setWard_count(int ward_count) {
                        this.ward_count = ward_count;
                    }

                    public void setWard_reply_id(int ward_reply_id) {
                        this.ward_reply_id = ward_reply_id;
                    }

                    public void setIs_ward(boolean is_ward) {
                        this.is_ward = is_ward;
                    }

                    public void setWard_users(List<Ward_usersEntity> ward_users) {
                        this.ward_users = ward_users;
                    }

                    public List<?> getTrend_messages() {
                        return trend_messages;
                    }

                    public boolean isIs_visible() {
                        return is_visible;
                    }

                    public boolean isHas_new() {
                        return has_new;
                    }

                    public int getWard_comment_id() {
                        return ward_comment_id;
                    }

                    public int getWard_count() {
                        return ward_count;
                    }

                    public int getWard_reply_id() {
                        return ward_reply_id;
                    }

                    public boolean isIs_ward() {
                        return is_ward;
                    }

                    public List<Ward_usersEntity> getWard_users() {
                        return ward_users;
                    }

                    public class Ward_usersEntity {
                        /**
                         * live_auth : false
                         * achievements : null
                         * description :
                         * language : zh
                         * recommend_reason : null
                         * certify_info : null
                         * punishments : null
                         * id_str : 99027242018
                         * profile_schema : bds://user/profile?user_id=99027242018&page_index=1
                         * id : 99027242018
                         * vote_count : 0
                         * broadcast_info : null
                         * author_info : null
                         * like_count : null
                         * recommend_tag : null
                         * level : 0
                         * god_comment_count : null
                         * commerce_permission_list : null
                         * is_followed : null
                         * decoration_list : null
                         * avatar : {"is_gif":false,"url_list":[{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"}],"download_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"}],"width":200,"uri":"tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05","height":200}
                         * followings_count : null
                         * creative_level_info : null
                         * followers_count : null
                         * name : 没了对象省了流量
                         * interaction_limitation : null
                         * region : cn
                         * is_following : null
                         * status : null
                         */
                        private boolean live_auth;
                        private String achievements;
                        private String description;
                        private String language;
                        private String recommend_reason;
                        private String certify_info;
                        private String punishments;
                        private String id_str;
                        private String profile_schema;
                        private long id;
                        private int vote_count;
                        private String broadcast_info;
                        private String author_info;
                        private String like_count;
                        private String recommend_tag;
                        private int level;
                        private String god_comment_count;
                        private String commerce_permission_list;
                        private String is_followed;
                        private String decoration_list;
                        private AvatarEntity avatar;
                        private String followings_count;
                        private String creative_level_info;
                        private String followers_count;
                        private String name;
                        private String interaction_limitation;
                        private String region;
                        private String is_following;
                        private String status;

                        public void setLive_auth(boolean live_auth) {
                            this.live_auth = live_auth;
                        }

                        public void setAchievements(String achievements) {
                            this.achievements = achievements;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public void setLanguage(String language) {
                            this.language = language;
                        }

                        public void setRecommend_reason(String recommend_reason) {
                            this.recommend_reason = recommend_reason;
                        }

                        public void setCertify_info(String certify_info) {
                            this.certify_info = certify_info;
                        }

                        public void setPunishments(String punishments) {
                            this.punishments = punishments;
                        }

                        public void setId_str(String id_str) {
                            this.id_str = id_str;
                        }

                        public void setProfile_schema(String profile_schema) {
                            this.profile_schema = profile_schema;
                        }

                        public void setId(long id) {
                            this.id = id;
                        }

                        public void setVote_count(int vote_count) {
                            this.vote_count = vote_count;
                        }

                        public void setBroadcast_info(String broadcast_info) {
                            this.broadcast_info = broadcast_info;
                        }

                        public void setAuthor_info(String author_info) {
                            this.author_info = author_info;
                        }

                        public void setLike_count(String like_count) {
                            this.like_count = like_count;
                        }

                        public void setRecommend_tag(String recommend_tag) {
                            this.recommend_tag = recommend_tag;
                        }

                        public void setLevel(int level) {
                            this.level = level;
                        }

                        public void setGod_comment_count(String god_comment_count) {
                            this.god_comment_count = god_comment_count;
                        }

                        public void setCommerce_permission_list(String commerce_permission_list) {
                            this.commerce_permission_list = commerce_permission_list;
                        }

                        public void setIs_followed(String is_followed) {
                            this.is_followed = is_followed;
                        }

                        public void setDecoration_list(String decoration_list) {
                            this.decoration_list = decoration_list;
                        }

                        public void setAvatar(AvatarEntity avatar) {
                            this.avatar = avatar;
                        }

                        public void setFollowings_count(String followings_count) {
                            this.followings_count = followings_count;
                        }

                        public void setCreative_level_info(String creative_level_info) {
                            this.creative_level_info = creative_level_info;
                        }

                        public void setFollowers_count(String followers_count) {
                            this.followers_count = followers_count;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public void setInteraction_limitation(String interaction_limitation) {
                            this.interaction_limitation = interaction_limitation;
                        }

                        public void setRegion(String region) {
                            this.region = region;
                        }

                        public void setIs_following(String is_following) {
                            this.is_following = is_following;
                        }

                        public void setStatus(String status) {
                            this.status = status;
                        }

                        public boolean isLive_auth() {
                            return live_auth;
                        }

                        public String getAchievements() {
                            return achievements;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public String getLanguage() {
                            return language;
                        }

                        public String getRecommend_reason() {
                            return recommend_reason;
                        }

                        public String getCertify_info() {
                            return certify_info;
                        }

                        public String getPunishments() {
                            return punishments;
                        }

                        public String getId_str() {
                            return id_str;
                        }

                        public String getProfile_schema() {
                            return profile_schema;
                        }

                        public long getId() {
                            return id;
                        }

                        public int getVote_count() {
                            return vote_count;
                        }

                        public String getBroadcast_info() {
                            return broadcast_info;
                        }

                        public String getAuthor_info() {
                            return author_info;
                        }

                        public String getLike_count() {
                            return like_count;
                        }

                        public String getRecommend_tag() {
                            return recommend_tag;
                        }

                        public int getLevel() {
                            return level;
                        }

                        public String getGod_comment_count() {
                            return god_comment_count;
                        }

                        public String getCommerce_permission_list() {
                            return commerce_permission_list;
                        }

                        public String getIs_followed() {
                            return is_followed;
                        }

                        public String getDecoration_list() {
                            return decoration_list;
                        }

                        public AvatarEntity getAvatar() {
                            return avatar;
                        }

                        public String getFollowings_count() {
                            return followings_count;
                        }

                        public String getCreative_level_info() {
                            return creative_level_info;
                        }

                        public String getFollowers_count() {
                            return followers_count;
                        }

                        public String getName() {
                            return name;
                        }

                        public String getInteraction_limitation() {
                            return interaction_limitation;
                        }

                        public String getRegion() {
                            return region;
                        }

                        public String getIs_following() {
                            return is_following;
                        }

                        public String getStatus() {
                            return status;
                        }

                        public class AvatarEntity {
                            /**
                             * is_gif : false
                             * url_list : [{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"},{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg"}]
                             * download_list : [{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"},{"url":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg"}]
                             * width : 200
                             * uri : tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05
                             * height : 200
                             */
                            private boolean is_gif;
                            private List<Url_listEntity> url_list;
                            private List<Download_listEntity> download_list;
                            private int width;
                            private String uri;
                            private int height;

                            public void setIs_gif(boolean is_gif) {
                                this.is_gif = is_gif;
                            }

                            public void setUrl_list(List<Url_listEntity> url_list) {
                                this.url_list = url_list;
                            }

                            public void setDownload_list(List<Download_listEntity> download_list) {
                                this.download_list = download_list;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public void setUri(String uri) {
                                this.uri = uri;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public boolean isIs_gif() {
                                return is_gif;
                            }

                            public List<Url_listEntity> getUrl_list() {
                                return url_list;
                            }

                            public List<Download_listEntity> getDownload_list() {
                                return download_list;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public String getUri() {
                                return uri;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public class Url_listEntity {
                                /**
                                 * url : https://p9-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~c5_200x200_q80.jpeg
                                 */
                                private String url;

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }

                            public class Download_listEntity {
                                /**
                                 * url : https://p1-ppx.byteimg.com/img/tos-cn-i-0000/cbfd8a9f486643d4a09fc46435e77f05~tplv-ppx-logo.jpeg
                                 */
                                private String url;

                                public void setUrl(String url) {
                                    this.url = url;
                                }

                                public String getUrl() {
                                    return url;
                                }
                            }
                        }
                    }
                }

                public class ShareEntity {
                    /**
                     * share_text : [皮皮虾]ICU目标客户
                     * qq_strategy : 4
                     * schema : bds://comment/detail?comment_id=6964932181558827301
                     * weixin_strategy : 4
                     * wechat_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=weixin&timestamp=1627463878
                     * qzone_strategy : 4
                     * qzone_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=qzone&timestamp=1627463878
                     * image_url : https://p1-ppx.byteimg.com/img/p1056/cbccb44c6fda4d2494f360ad7fa5dca1~c5_300x300_q60.jpeg
                     * android : {"qq_strategy":4,"weixin_strategy":4,"qzone_strategy":4,"channel":1,"moments_strategy":4}
                     * qq_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=mobile_qq&timestamp=1627463878
                     * title : ICU目标客户
                     * ios : {"qq_strategy":4,"weixin_strategy":4,"qzone_strategy":4,"channel":1,"moments_strategy":4}
                     * compound_page_url : https://h5.pipix.com/bds_web/share/backup/?item_id=6964896912050755875&cell_type=8&cell_id=6964932181558827301&carrier_region=cn&region=cn&language=zh&app_id=0
                     * content : [皮皮虾] 搞笑娱乐神评论，皮这一下很开心
                     * moments_url : https://h5.pipix.com/item/6964896912050755875?app_id=0&app=&utm_source=weixin_moments&timestamp=1627463878
                     * large_image_url :
                     * share_url : https://h5.pipix.com/item/6964896912050755875?cell_type=8&cell_id=6964932181558827301&carrier_region=cn&region=cn&language=zh&app_id=0
                     * moments_strategy : 4
                     * link_text : ICU目标客户
                     * https://h5.pipix.com/item/6964896912050755875?cell_type=8&cell_id=6964932181558827301&carrier_region=cn&region=cn&language=zh&app_id=0
                     */
                    private String share_text;
                    private int qq_strategy;
                    private String schema;
                    private int weixin_strategy;
                    private String wechat_url;
                    private int qzone_strategy;
                    private String qzone_url;
                    private String image_url;
                    private AndroidEntity android;
                    private String qq_url;
                    private String title;
                    private IosEntity ios;
                    private String compound_page_url;
                    private String content;
                    private String moments_url;
                    private String large_image_url;
                    private String share_url;
                    private int moments_strategy;
                    private String link_text;

                    public void setShare_text(String share_text) {
                        this.share_text = share_text;
                    }

                    public void setQq_strategy(int qq_strategy) {
                        this.qq_strategy = qq_strategy;
                    }

                    public void setSchema(String schema) {
                        this.schema = schema;
                    }

                    public void setWeixin_strategy(int weixin_strategy) {
                        this.weixin_strategy = weixin_strategy;
                    }

                    public void setWechat_url(String wechat_url) {
                        this.wechat_url = wechat_url;
                    }

                    public void setQzone_strategy(int qzone_strategy) {
                        this.qzone_strategy = qzone_strategy;
                    }

                    public void setQzone_url(String qzone_url) {
                        this.qzone_url = qzone_url;
                    }

                    public void setImage_url(String image_url) {
                        this.image_url = image_url;
                    }

                    public void setAndroid(AndroidEntity android) {
                        this.android = android;
                    }

                    public void setQq_url(String qq_url) {
                        this.qq_url = qq_url;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public void setIos(IosEntity ios) {
                        this.ios = ios;
                    }

                    public void setCompound_page_url(String compound_page_url) {
                        this.compound_page_url = compound_page_url;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public void setMoments_url(String moments_url) {
                        this.moments_url = moments_url;
                    }

                    public void setLarge_image_url(String large_image_url) {
                        this.large_image_url = large_image_url;
                    }

                    public void setShare_url(String share_url) {
                        this.share_url = share_url;
                    }

                    public void setMoments_strategy(int moments_strategy) {
                        this.moments_strategy = moments_strategy;
                    }

                    public void setLink_text(String link_text) {
                        this.link_text = link_text;
                    }

                    public String getShare_text() {
                        return share_text;
                    }

                    public int getQq_strategy() {
                        return qq_strategy;
                    }

                    public String getSchema() {
                        return schema;
                    }

                    public int getWeixin_strategy() {
                        return weixin_strategy;
                    }

                    public String getWechat_url() {
                        return wechat_url;
                    }

                    public int getQzone_strategy() {
                        return qzone_strategy;
                    }

                    public String getQzone_url() {
                        return qzone_url;
                    }

                    public String getImage_url() {
                        return image_url;
                    }

                    public AndroidEntity getAndroid() {
                        return android;
                    }

                    public String getQq_url() {
                        return qq_url;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public IosEntity getIos() {
                        return ios;
                    }

                    public String getCompound_page_url() {
                        return compound_page_url;
                    }

                    public String getContent() {
                        return content;
                    }

                    public String getMoments_url() {
                        return moments_url;
                    }

                    public String getLarge_image_url() {
                        return large_image_url;
                    }

                    public String getShare_url() {
                        return share_url;
                    }

                    public int getMoments_strategy() {
                        return moments_strategy;
                    }

                    public String getLink_text() {
                        return link_text;
                    }

                    public class AndroidEntity {
                        /**
                         * qq_strategy : 4
                         * weixin_strategy : 4
                         * qzone_strategy : 4
                         * channel : 1
                         * moments_strategy : 4
                         */
                        private int qq_strategy;
                        private int weixin_strategy;
                        private int qzone_strategy;
                        private int channel;
                        private int moments_strategy;

                        public void setQq_strategy(int qq_strategy) {
                            this.qq_strategy = qq_strategy;
                        }

                        public void setWeixin_strategy(int weixin_strategy) {
                            this.weixin_strategy = weixin_strategy;
                        }

                        public void setQzone_strategy(int qzone_strategy) {
                            this.qzone_strategy = qzone_strategy;
                        }

                        public void setChannel(int channel) {
                            this.channel = channel;
                        }

                        public void setMoments_strategy(int moments_strategy) {
                            this.moments_strategy = moments_strategy;
                        }

                        public int getQq_strategy() {
                            return qq_strategy;
                        }

                        public int getWeixin_strategy() {
                            return weixin_strategy;
                        }

                        public int getQzone_strategy() {
                            return qzone_strategy;
                        }

                        public int getChannel() {
                            return channel;
                        }

                        public int getMoments_strategy() {
                            return moments_strategy;
                        }
                    }

                    public class IosEntity {
                        /**
                         * qq_strategy : 4
                         * weixin_strategy : 4
                         * qzone_strategy : 4
                         * channel : 1
                         * moments_strategy : 4
                         */
                        private int qq_strategy;
                        private int weixin_strategy;
                        private int qzone_strategy;
                        private int channel;
                        private int moments_strategy;

                        public void setQq_strategy(int qq_strategy) {
                            this.qq_strategy = qq_strategy;
                        }

                        public void setWeixin_strategy(int weixin_strategy) {
                            this.weixin_strategy = weixin_strategy;
                        }

                        public void setQzone_strategy(int qzone_strategy) {
                            this.qzone_strategy = qzone_strategy;
                        }

                        public void setChannel(int channel) {
                            this.channel = channel;
                        }

                        public void setMoments_strategy(int moments_strategy) {
                            this.moments_strategy = moments_strategy;
                        }

                        public int getQq_strategy() {
                            return qq_strategy;
                        }

                        public int getWeixin_strategy() {
                            return weixin_strategy;
                        }

                        public int getQzone_strategy() {
                            return qzone_strategy;
                        }

                        public int getChannel() {
                            return channel;
                        }

                        public int getMoments_strategy() {
                            return moments_strategy;
                        }
                    }
                }

                public class UserEntity {
                    /**
                     * live_auth : false
                     * achievements : []
                     * description :
                     * language : zh
                     * recommend_reason : null
                     * certify_info : null
                     * punishments : null
                     * id_str : 103507429173
                     * profile_schema : bds://user/profile?user_id=103507429173&page_index=1
                     * id : 103507429173
                     * vote_count : 0
                     * broadcast_info : null
                     * author_info : null
                     * like_count : null
                     * recommend_tag : null
                     * level : 0
                     * god_comment_count : null
                     * commerce_permission_list : null
                     * is_followed : null
                     * decoration_list : [{"decoration_infos":[{"schema":"","decoration_type":2,"decoration_id":0,"icon":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/b642862f2a6a42b8a195bf5d8ffa9c44~c5_360x360_q60.png","description":"神评手"}],"category":2}]
                     * avatar : {"is_gif":false,"url_list":[{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg"}],"download_list":[{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c"}],"width":200,"uri":"tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c","height":200}
                     * followings_count : null
                     * creative_level_info : null
                     * followers_count : null
                     * name : 擎天柱大哥
                     * interaction_limitation : null
                     * region : cn
                     * is_following : null
                     * status : 0
                     */
                    private boolean live_auth;
                    private List<?> achievements;
                    private String description;
                    private String language;
                    private String recommend_reason;
                    private String certify_info;
                    private String punishments;
                    private String id_str;
                    private String profile_schema;
                    private long id;
                    private int vote_count;
                    private String broadcast_info;
                    private String author_info;
                    private String like_count;
                    private String recommend_tag;
                    private int level;
                    private String god_comment_count;
                    private String commerce_permission_list;
                    private String is_followed;
                    private List<Decoration_listEntity> decoration_list;
                    private AvatarEntity avatar;
                    private String followings_count;
                    private String creative_level_info;
                    private String followers_count;
                    private String name;
                    private String interaction_limitation;
                    private String region;
                    private String is_following;
                    private int status;

                    public void setLive_auth(boolean live_auth) {
                        this.live_auth = live_auth;
                    }

                    public void setAchievements(List<?> achievements) {
                        this.achievements = achievements;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public void setLanguage(String language) {
                        this.language = language;
                    }

                    public void setRecommend_reason(String recommend_reason) {
                        this.recommend_reason = recommend_reason;
                    }

                    public void setCertify_info(String certify_info) {
                        this.certify_info = certify_info;
                    }

                    public void setPunishments(String punishments) {
                        this.punishments = punishments;
                    }

                    public void setId_str(String id_str) {
                        this.id_str = id_str;
                    }

                    public void setProfile_schema(String profile_schema) {
                        this.profile_schema = profile_schema;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public void setVote_count(int vote_count) {
                        this.vote_count = vote_count;
                    }

                    public void setBroadcast_info(String broadcast_info) {
                        this.broadcast_info = broadcast_info;
                    }

                    public void setAuthor_info(String author_info) {
                        this.author_info = author_info;
                    }

                    public void setLike_count(String like_count) {
                        this.like_count = like_count;
                    }

                    public void setRecommend_tag(String recommend_tag) {
                        this.recommend_tag = recommend_tag;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public void setGod_comment_count(String god_comment_count) {
                        this.god_comment_count = god_comment_count;
                    }

                    public void setCommerce_permission_list(String commerce_permission_list) {
                        this.commerce_permission_list = commerce_permission_list;
                    }

                    public void setIs_followed(String is_followed) {
                        this.is_followed = is_followed;
                    }

                    public void setDecoration_list(List<Decoration_listEntity> decoration_list) {
                        this.decoration_list = decoration_list;
                    }

                    public void setAvatar(AvatarEntity avatar) {
                        this.avatar = avatar;
                    }

                    public void setFollowings_count(String followings_count) {
                        this.followings_count = followings_count;
                    }

                    public void setCreative_level_info(String creative_level_info) {
                        this.creative_level_info = creative_level_info;
                    }

                    public void setFollowers_count(String followers_count) {
                        this.followers_count = followers_count;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public void setInteraction_limitation(String interaction_limitation) {
                        this.interaction_limitation = interaction_limitation;
                    }

                    public void setRegion(String region) {
                        this.region = region;
                    }

                    public void setIs_following(String is_following) {
                        this.is_following = is_following;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public boolean isLive_auth() {
                        return live_auth;
                    }

                    public List<?> getAchievements() {
                        return achievements;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public String getLanguage() {
                        return language;
                    }

                    public String getRecommend_reason() {
                        return recommend_reason;
                    }

                    public String getCertify_info() {
                        return certify_info;
                    }

                    public String getPunishments() {
                        return punishments;
                    }

                    public String getId_str() {
                        return id_str;
                    }

                    public String getProfile_schema() {
                        return profile_schema;
                    }

                    public long getId() {
                        return id;
                    }

                    public int getVote_count() {
                        return vote_count;
                    }

                    public String getBroadcast_info() {
                        return broadcast_info;
                    }

                    public String getAuthor_info() {
                        return author_info;
                    }

                    public String getLike_count() {
                        return like_count;
                    }

                    public String getRecommend_tag() {
                        return recommend_tag;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public String getGod_comment_count() {
                        return god_comment_count;
                    }

                    public String getCommerce_permission_list() {
                        return commerce_permission_list;
                    }

                    public String getIs_followed() {
                        return is_followed;
                    }

                    public List<Decoration_listEntity> getDecoration_list() {
                        return decoration_list;
                    }

                    public AvatarEntity getAvatar() {
                        return avatar;
                    }

                    public String getFollowings_count() {
                        return followings_count;
                    }

                    public String getCreative_level_info() {
                        return creative_level_info;
                    }

                    public String getFollowers_count() {
                        return followers_count;
                    }

                    public String getName() {
                        return name;
                    }

                    public String getInteraction_limitation() {
                        return interaction_limitation;
                    }

                    public String getRegion() {
                        return region;
                    }

                    public String getIs_following() {
                        return is_following;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public class Decoration_listEntity {
                        /**
                         * decoration_infos : [{"schema":"","decoration_type":2,"decoration_id":0,"icon":"https://p9-ppx.byteimg.com/img/tos-cn-i-0000/b642862f2a6a42b8a195bf5d8ffa9c44~c5_360x360_q60.png","description":"神评手"}]
                         * category : 2
                         */
                        private List<Decoration_infosEntity> decoration_infos;
                        private int category;

                        public void setDecoration_infos(List<Decoration_infosEntity> decoration_infos) {
                            this.decoration_infos = decoration_infos;
                        }

                        public void setCategory(int category) {
                            this.category = category;
                        }

                        public List<Decoration_infosEntity> getDecoration_infos() {
                            return decoration_infos;
                        }

                        public int getCategory() {
                            return category;
                        }

                        public class Decoration_infosEntity {
                            /**
                             * schema :
                             * decoration_type : 2
                             * decoration_id : 0
                             * icon : https://p9-ppx.byteimg.com/img/tos-cn-i-0000/b642862f2a6a42b8a195bf5d8ffa9c44~c5_360x360_q60.png
                             * description : 神评手
                             */
                            private String schema;
                            private int decoration_type;
                            private int decoration_id;
                            private String icon;
                            private String description;

                            public void setSchema(String schema) {
                                this.schema = schema;
                            }

                            public void setDecoration_type(int decoration_type) {
                                this.decoration_type = decoration_type;
                            }

                            public void setDecoration_id(int decoration_id) {
                                this.decoration_id = decoration_id;
                            }

                            public void setIcon(String icon) {
                                this.icon = icon;
                            }

                            public void setDescription(String description) {
                                this.description = description;
                            }

                            public String getSchema() {
                                return schema;
                            }

                            public int getDecoration_type() {
                                return decoration_type;
                            }

                            public int getDecoration_id() {
                                return decoration_id;
                            }

                            public String getIcon() {
                                return icon;
                            }

                            public String getDescription() {
                                return description;
                            }
                        }
                    }

                    public class AvatarEntity {
                        /**
                         * is_gif : false
                         * url_list : [{"url":"https://p1-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg"},{"url":"https://p3-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg"}]
                         * download_list : [{"url":"https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c"},{"url":"https://sf3-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c"}]
                         * width : 200
                         * uri : tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c
                         * height : 200
                         */
                        private boolean is_gif;
                        private List<Url_listEntity> url_list;
                        private List<Download_listEntity> download_list;
                        private int width;
                        private String uri;
                        private int height;

                        public void setIs_gif(boolean is_gif) {
                            this.is_gif = is_gif;
                        }

                        public void setUrl_list(List<Url_listEntity> url_list) {
                            this.url_list = url_list;
                        }

                        public void setDownload_list(List<Download_listEntity> download_list) {
                            this.download_list = download_list;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public boolean isIs_gif() {
                            return is_gif;
                        }

                        public List<Url_listEntity> getUrl_list() {
                            return url_list;
                        }

                        public List<Download_listEntity> getDownload_list() {
                            return download_list;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public String getUri() {
                            return uri;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public class Url_listEntity {
                            /**
                             * url : https://p1-ppx.byteimg.com/img/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c~200x200.jpeg
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }

                        public class Download_listEntity {
                            /**
                             * url : https://sf1-nhcdn-tos.pstatp.com/obj/tos-cn-i-0000/1bf7828c53a941fe9a0d8bb94b38796c
                             */
                            private String url;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getUrl() {
                                return url;
                            }
                        }
                    }
                }
            }
        }
    }
}
