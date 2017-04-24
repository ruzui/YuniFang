package myapplication888.bwie.com.yunifang.Fragment;

import java.util.List;

/**
 * Created by MacBook- on 2017/4/19.
 */
public class Par_User {
    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * goods : {"id":"1638","goods_sn":"6951439943397","goods_name":"嫩肌酵素黑膜礼盒21片","stock_number":922,"collect_count":789,"market_price":299,"shop_price":139.9,"shipping_fee":10,"goods_desc":"[{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/170416095993418584246493910.jpg\",\"width\":\"790\",\"height\":\"476\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/17041609595218575011289207.jpg\",\"width\":\"790\",\"height\":\"340\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/17041609594918565776078840.jpg\",\"width\":\"790\",\"height\":\"340\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102261516442501551442.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102264916451736769209.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102270316460971974298.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102274516470207189649.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102279416479442397891.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102284316488677602878.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102291316497912817092.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102293016507148022235.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102299616516383233757.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/17030210227416719557851230.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/17030210227716728793069875.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102215516738028277193.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102215416747263485940.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102258516756498698222.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102224416765733902728.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102232516774969116657.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102241016784204321474.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102248716793439537193.jpg\",\"width\":\"790\",\"height\":\"550\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102261616802674744503.jpg\",\"width\":\"790\",\"height\":\"725\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025516467283569251.jpg\",\"width\":\"790\",\"height\":\"662\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/17033114066620099894394425.jpg\",\"width\":\"790\",\"height\":\"218\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025762485753989290.jpg\",\"width\":\"790\",\"height\":\"662\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025814494989196626.jpg\",\"width\":\"790\",\"height\":\"661\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949504224405918.jpg\",\"width\":\"790\",\"height\":\"662\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949513459611883.jpg\",\"width\":\"790\",\"height\":\"661\"}]","goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg","is_on_sale":"1","quality":0,"valueformoney":0,"desmatch":0,"sales_volume":3743,"reservable":false,"createuser":"shanxian","lastupdateuser":"hani","restriction":0,"restrict_purchase_num":5,"is_activity_goods":"0","is_coupon_allowed":true,"allocated_stock":0,"gallery":[{"id":"9440","sort":0,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg","enable":true},{"id":"9443","sort":1,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102190912979167573827.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102190912979167573827.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102190912979167573827.jpg","enable":true},{"id":"9441","sort":2,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102197712969932369139.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102197712969932369139.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102197712969932369139.jpg","enable":true},{"id":"9442","sort":3,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102199112988402785051.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102199112988402785051.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102199112988402785051.jpg","enable":true}],"attributes":[{"id":"7465","goods_id":"1638","attr_name":"上市时间","attr_value":"2017年"},{"id":"7466","goods_id":"1638","attr_name":"适合肤质","attr_value":"中性、干性、油性及混合性"},{"id":"7467","goods_id":"1638","attr_name":"保质期","attr_value":"三年"},{"id":"7468","goods_id":"1638","attr_name":"产品功效","attr_value":"清爽补水 提亮肤色"},{"id":"7469","goods_id":"1638","attr_name":"产品规格","attr_value":"30ml*21片"}],"efficacy":"鲜果酵素 弹嫩水润","is_gift":0,"goods_source":"0","redeem_goods_restrict_flag":"0","is_allow_credit":"1","commission_scale":0,"goods_type":"0","datagoodtype":9,"categorys":["9","14","13","29","28","17","19","18"]}
         * collected : false
         * reserved : false
         * commentNumber : 1212
         * comments : [{"id":"1338357","createtime":"2017.04.18 09:09:39","content":"好！","user":{"id":"381658","nick_name":"雨寂q88","icon":"http://image.hmeili.com/yunifang/images/user/150910092839814215322126015.jpg"}},{"id":"1338341","createtime":"2017.04.18 08:38:39","content":"好评","user":{"id":"4772659","nick_name":"LM515907","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"},"picture":[{"id":"128644","normal_url":"https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg","original_url":"https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg"}]},{"id":"1338339","createtime":"2017.04.18 08:36:37","content":"很没有用，应该不错","user":{"id":"3580662","nick_name":"Angelina","icon":"http://image.hmeili.com/yunifang/images/user/16112709511288792942583148.jpg"}},{"id":"1338335","createtime":"2017.04.18 08:30:11","content":"好评","user":{"id":"1815547","nick_name":"wenchao922","icon":"http://image.hmeili.com/yunifang/images/user/16030916483314215322127614.jpg"}},{"id":"1338333","createtime":"2017.04.18 08:29:46","content":"好评","user":{"id":"219183","nick_name":"Verona Rupes","icon":"http://image.hmeili.com/yunifang/images/user/15042106516141421532212.jpg"}},{"id":"1338295","createtime":"2017.04.18 07:25:29","content":"好评还不错！新品，用过后追评","user":{"id":"3743970","nick_name":"ynf_0810","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1338284","createtime":"2017.04.18 07:03:38","content":"好评","user":{"id":"2308734","nick_name":"ynf_5411","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1338276","createtime":"2017.04.18 06:42:41","content":"好评","user":{"id":"5039901","nick_name":"ynf_3552","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1338258","createtime":"2017.04.18 06:11:33","content":"好评","user":{"id":"2952719","nick_name":"萌女神","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1338231","createtime":"2017.04.18 01:05:51","content":"好评","user":{"id":"3370981","nick_name":"ynf_5179","icon":"http://image.hmeili.com/yunifang/images/user/161118093862414215322121487.jpg"}},{"id":"1338188","createtime":"2017.04.18 00:16:06","content":"好评啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦积积","user":{"id":"1180174","nick_name":"不疯魔不成活","icon":"http://image.hmeili.com/yunifang/images/user/160912175598314215322126928.jpg"}},{"id":"1338161","createtime":"2017.04.17 23:52:17","content":"好评","user":{"id":"2240865","nick_name":"小青","icon":"http://image.hmeili.com/yunifang/images/user/160519101265814215322128477.jpg"}},{"id":"1338118","createtime":"2017.04.17 23:05:18","content":"好评","user":{"id":"2045618","nick_name":"可爱不不","icon":"https://image.yunifang.com/yunifang/images/user/170324121972114215322129464.jpg"}},{"id":"1338096","createtime":"2017.04.17 22:58:07","content":"服务态度很好，还送了两盒面膜，喜欢的朋友快来下手吧，我一直在用，真的很不错","user":{"id":"3438035","nick_name":"ynf_1107","icon":"https://image.yunifang.com/yunifang/images/user/170415164627614215322128131.jpg"}},{"id":"1338068","createtime":"2017.04.17 22:33:13","content":"好评。很好用，物流也特别快。赠送了面膜也很喜欢。赞赞赞。","user":{"id":"4685056","nick_name":"ynf_4927","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1338062","createtime":"2017.04.17 22:29:50","content":"好评新款，第一次用，感觉很清爽不油腻，适合夏季用，评价好用，值得入手","user":{"id":"5001084","nick_name":"ynf_4937","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}}]
         * activity : [{"id":"36","title":"实付满49元包邮","description":"http://h.yunifang.com/h/postage.html"},{"id":"25","title":"海量赠品·满69自选","description":"http://h.yunifang.com/h/11_meet.html"},{"id":"21","title":"购物须知·客服时间8:30-23:30","description":"http://h.yunifang.com/h/shopping_tips.html"}]
         * matchPriceRule : {"restriction":0,"state":0,"matchPriceRuleEnable":"0"}
         * goodsRelDetails : [{"id":"79","goods_name":"氨基酸温和净透洁面乳100ml","shop_price":59.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/79/goods_img/160819085485217215236528712.jpg","reservable":false,"stock_number":0,"restrict_purchase_num":0},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/343/goods_img/161109195539019451480402371.jpg","reservable":false,"stock_number":0,"restrict_purchase_num":0},{"id":"15","goods_name":"清爽控油泥浆面膜四件套","shop_price":179.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/15/goods_img/160819084839612979380157998.jpg","reservable":false,"stock_number":0,"restrict_purchase_num":0}]
         */

        private GoodsBean goods;
        private boolean collected;
        private boolean reserved;
        private int commentNumber;
        private MatchPriceRuleBean matchPriceRule;
        private List<CommentsBean> comments;
        private List<ActivityBean> activity;
        private List<GoodsRelDetailsBean> goodsRelDetails;

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public boolean isCollected() {
            return collected;
        }

        public void setCollected(boolean collected) {
            this.collected = collected;
        }

        public boolean isReserved() {
            return reserved;
        }

        public void setReserved(boolean reserved) {
            this.reserved = reserved;
        }

        public int getCommentNumber() {
            return commentNumber;
        }

        public void setCommentNumber(int commentNumber) {
            this.commentNumber = commentNumber;
        }

        public MatchPriceRuleBean getMatchPriceRule() {
            return matchPriceRule;
        }

        public void setMatchPriceRule(MatchPriceRuleBean matchPriceRule) {
            this.matchPriceRule = matchPriceRule;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public List<ActivityBean> getActivity() {
            return activity;
        }

        public void setActivity(List<ActivityBean> activity) {
            this.activity = activity;
        }

        public List<GoodsRelDetailsBean> getGoodsRelDetails() {
            return goodsRelDetails;
        }

        public void setGoodsRelDetails(List<GoodsRelDetailsBean> goodsRelDetails) {
            this.goodsRelDetails = goodsRelDetails;
        }

        public static class GoodsBean {
            /**
             * id : 1638
             * goods_sn : 6951439943397
             * goods_name : 嫩肌酵素黑膜礼盒21片
             * stock_number : 922
             * collect_count : 789
             * market_price : 299.0
             * shop_price : 139.9
             * shipping_fee : 10.0
             * goods_desc : [{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/170416095993418584246493910.jpg","width":"790","height":"476"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/17041609595218575011289207.jpg","width":"790","height":"340"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/17041609594918565776078840.jpg","width":"790","height":"340"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102261516442501551442.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102264916451736769209.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102270316460971974298.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102274516470207189649.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102279416479442397891.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102284316488677602878.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102291316497912817092.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102293016507148022235.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102299616516383233757.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/17030210227416719557851230.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/17030210227716728793069875.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102215516738028277193.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102215416747263485940.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102258516756498698222.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102224416765733902728.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102232516774969116657.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102241016784204321474.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102248716793439537193.jpg","width":"790","height":"550"},{"url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_desc/170302102261616802674744503.jpg","width":"790","height":"725"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025516467283569251.jpg","width":"790","height":"662"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/17033114066620099894394425.jpg","width":"790","height":"218"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025762485753989290.jpg","width":"790","height":"662"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025814494989196626.jpg","width":"790","height":"661"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949504224405918.jpg","width":"790","height":"662"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949513459611883.jpg","width":"790","height":"661"}]
             * goods_img : https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg
             * is_on_sale : 1
             * quality : 0.0
             * valueformoney : 0.0
             * desmatch : 0.0
             * sales_volume : 3743
             * reservable : false
             * createuser : shanxian
             * lastupdateuser : hani
             * restriction : 0
             * restrict_purchase_num : 5
             * is_activity_goods : 0
             * is_coupon_allowed : true
             * allocated_stock : 0
             * gallery : [{"id":"9440","sort":0,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg","enable":true},{"id":"9443","sort":1,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102190912979167573827.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102190912979167573827.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102190912979167573827.jpg","enable":true},{"id":"9441","sort":2,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102197712969932369139.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102197712969932369139.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102197712969932369139.jpg","enable":true},{"id":"9442","sort":3,"goods_id":"1638","normal_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102199112988402785051.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102199112988402785051.jpg","original_url":"https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102199112988402785051.jpg","enable":true}]
             * attributes : [{"id":"7465","goods_id":"1638","attr_name":"上市时间","attr_value":"2017年"},{"id":"7466","goods_id":"1638","attr_name":"适合肤质","attr_value":"中性、干性、油性及混合性"},{"id":"7467","goods_id":"1638","attr_name":"保质期","attr_value":"三年"},{"id":"7468","goods_id":"1638","attr_name":"产品功效","attr_value":"清爽补水 提亮肤色"},{"id":"7469","goods_id":"1638","attr_name":"产品规格","attr_value":"30ml*21片"}]
             * efficacy : 鲜果酵素 弹嫩水润
             * is_gift : 0
             * goods_source : 0
             * redeem_goods_restrict_flag : 0
             * is_allow_credit : 1
             * commission_scale : 0.0
             * goods_type : 0
             * datagoodtype : 9
             * categorys : ["9","14","13","29","28","17","19","18"]
             */

            private String id;
            private String goods_sn;
            private String goods_name;
            private int stock_number;
            private int collect_count;
            private double market_price;
            private double shop_price;
            private double shipping_fee;
            private String goods_desc;
            private String goods_img;
            private String is_on_sale;
            private double quality;
            private double valueformoney;
            private double desmatch;
            private int sales_volume;
            private boolean reservable;
            private String createuser;
            private String lastupdateuser;
            private int restriction;
            private int restrict_purchase_num;
            private String is_activity_goods;
            private boolean is_coupon_allowed;
            private int allocated_stock;
            private String efficacy;
            private int is_gift;
            private String goods_source;
            private String redeem_goods_restrict_flag;
            private String is_allow_credit;
            private double commission_scale;
            private String goods_type;
            private int datagoodtype;
            private List<GalleryBean> gallery;
            private List<AttributesBean> attributes;
            private List<String> categorys;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public int getStock_number() {
                return stock_number;
            }

            public void setStock_number(int stock_number) {
                this.stock_number = stock_number;
            }

            public int getCollect_count() {
                return collect_count;
            }

            public void setCollect_count(int collect_count) {
                this.collect_count = collect_count;
            }

            public double getMarket_price() {
                return market_price;
            }

            public void setMarket_price(double market_price) {
                this.market_price = market_price;
            }

            public double getShop_price() {
                return shop_price;
            }

            public void setShop_price(double shop_price) {
                this.shop_price = shop_price;
            }

            public double getShipping_fee() {
                return shipping_fee;
            }

            public void setShipping_fee(double shipping_fee) {
                this.shipping_fee = shipping_fee;
            }

            public String getGoods_desc() {
                return goods_desc;
            }

            public void setGoods_desc(String goods_desc) {
                this.goods_desc = goods_desc;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public String getIs_on_sale() {
                return is_on_sale;
            }

            public void setIs_on_sale(String is_on_sale) {
                this.is_on_sale = is_on_sale;
            }

            public double getQuality() {
                return quality;
            }

            public void setQuality(double quality) {
                this.quality = quality;
            }

            public double getValueformoney() {
                return valueformoney;
            }

            public void setValueformoney(double valueformoney) {
                this.valueformoney = valueformoney;
            }

            public double getDesmatch() {
                return desmatch;
            }

            public void setDesmatch(double desmatch) {
                this.desmatch = desmatch;
            }

            public int getSales_volume() {
                return sales_volume;
            }

            public void setSales_volume(int sales_volume) {
                this.sales_volume = sales_volume;
            }

            public boolean isReservable() {
                return reservable;
            }

            public void setReservable(boolean reservable) {
                this.reservable = reservable;
            }

            public String getCreateuser() {
                return createuser;
            }

            public void setCreateuser(String createuser) {
                this.createuser = createuser;
            }

            public String getLastupdateuser() {
                return lastupdateuser;
            }

            public void setLastupdateuser(String lastupdateuser) {
                this.lastupdateuser = lastupdateuser;
            }

            public int getRestriction() {
                return restriction;
            }

            public void setRestriction(int restriction) {
                this.restriction = restriction;
            }

            public int getRestrict_purchase_num() {
                return restrict_purchase_num;
            }

            public void setRestrict_purchase_num(int restrict_purchase_num) {
                this.restrict_purchase_num = restrict_purchase_num;
            }

            public String getIs_activity_goods() {
                return is_activity_goods;
            }

            public void setIs_activity_goods(String is_activity_goods) {
                this.is_activity_goods = is_activity_goods;
            }

            public boolean isIs_coupon_allowed() {
                return is_coupon_allowed;
            }

            public void setIs_coupon_allowed(boolean is_coupon_allowed) {
                this.is_coupon_allowed = is_coupon_allowed;
            }

            public int getAllocated_stock() {
                return allocated_stock;
            }

            public void setAllocated_stock(int allocated_stock) {
                this.allocated_stock = allocated_stock;
            }

            public String getEfficacy() {
                return efficacy;
            }

            public void setEfficacy(String efficacy) {
                this.efficacy = efficacy;
            }

            public int getIs_gift() {
                return is_gift;
            }

            public void setIs_gift(int is_gift) {
                this.is_gift = is_gift;
            }

            public String getGoods_source() {
                return goods_source;
            }

            public void setGoods_source(String goods_source) {
                this.goods_source = goods_source;
            }

            public String getRedeem_goods_restrict_flag() {
                return redeem_goods_restrict_flag;
            }

            public void setRedeem_goods_restrict_flag(String redeem_goods_restrict_flag) {
                this.redeem_goods_restrict_flag = redeem_goods_restrict_flag;
            }

            public String getIs_allow_credit() {
                return is_allow_credit;
            }

            public void setIs_allow_credit(String is_allow_credit) {
                this.is_allow_credit = is_allow_credit;
            }

            public double getCommission_scale() {
                return commission_scale;
            }

            public void setCommission_scale(double commission_scale) {
                this.commission_scale = commission_scale;
            }

            public String getGoods_type() {
                return goods_type;
            }

            public void setGoods_type(String goods_type) {
                this.goods_type = goods_type;
            }

            public int getDatagoodtype() {
                return datagoodtype;
            }

            public void setDatagoodtype(int datagoodtype) {
                this.datagoodtype = datagoodtype;
            }

            public List<GalleryBean> getGallery() {
                return gallery;
            }

            public void setGallery(List<GalleryBean> gallery) {
                this.gallery = gallery;
            }

            public List<AttributesBean> getAttributes() {
                return attributes;
            }

            public void setAttributes(List<AttributesBean> attributes) {
                this.attributes = attributes;
            }

            public List<String> getCategorys() {
                return categorys;
            }

            public void setCategorys(List<String> categorys) {
                this.categorys = categorys;
            }

            public static class GalleryBean {
                /**
                 * id : 9440
                 * sort : 0
                 * goods_id : 1638
                 * normal_url : https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg
                 * thumb_url : https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg
                 * original_url : https://image.yunifang.com/yunifang/images/goods/1638/goods_gallery/170302102182011471658403397.jpg
                 * enable : true
                 */

                private String id;
                private int sort;
                private String goods_id;
                private String normal_url;
                private String thumb_url;
                private String original_url;
                private boolean enable;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getNormal_url() {
                    return normal_url;
                }

                public void setNormal_url(String normal_url) {
                    this.normal_url = normal_url;
                }

                public String getThumb_url() {
                    return thumb_url;
                }

                public void setThumb_url(String thumb_url) {
                    this.thumb_url = thumb_url;
                }

                public String getOriginal_url() {
                    return original_url;
                }

                public void setOriginal_url(String original_url) {
                    this.original_url = original_url;
                }

                public boolean isEnable() {
                    return enable;
                }

                public void setEnable(boolean enable) {
                    this.enable = enable;
                }
            }

            public static class AttributesBean {
                /**
                 * id : 7465
                 * goods_id : 1638
                 * attr_name : 上市时间
                 * attr_value : 2017年
                 */

                private String id;
                private String goods_id;
                private String attr_name;
                private String attr_value;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getAttr_name() {
                    return attr_name;
                }

                public void setAttr_name(String attr_name) {
                    this.attr_name = attr_name;
                }

                public String getAttr_value() {
                    return attr_value;
                }

                public void setAttr_value(String attr_value) {
                    this.attr_value = attr_value;
                }
            }
        }

        public static class MatchPriceRuleBean {
            /**
             * restriction : 0
             * state : 0
             * matchPriceRuleEnable : 0
             */

            private int restriction;
            private int state;
            private String matchPriceRuleEnable;

            public int getRestriction() {
                return restriction;
            }

            public void setRestriction(int restriction) {
                this.restriction = restriction;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getMatchPriceRuleEnable() {
                return matchPriceRuleEnable;
            }

            public void setMatchPriceRuleEnable(String matchPriceRuleEnable) {
                this.matchPriceRuleEnable = matchPriceRuleEnable;
            }
        }

        public static class CommentsBean {
            /**
             * id : 1338357
             * createtime : 2017.04.18 09:09:39
             * content : 好！
             * user : {"id":"381658","nick_name":"雨寂q88","icon":"http://image.hmeili.com/yunifang/images/user/150910092839814215322126015.jpg"}
             * picture : [{"id":"128644","normal_url":"https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg","thumb_url":"https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg","original_url":"https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg"}]
             */

            private String id;
            private String createtime;
            private String content;
            private UserBean user;
            private List<PictureBean> picture;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public List<PictureBean> getPicture() {
                return picture;
            }

            public void setPicture(List<PictureBean> picture) {
                this.picture = picture;
            }

            public static class UserBean {
                /**
                 * id : 381658
                 * nick_name : 雨寂q88
                 * icon : http://image.hmeili.com/yunifang/images/user/150910092839814215322126015.jpg
                 */

                private String id;
                private String nick_name;
                private String icon;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getNick_name() {
                    return nick_name;
                }

                public void setNick_name(String nick_name) {
                    this.nick_name = nick_name;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class PictureBean {
                /**
                 * id : 128644
                 * normal_url : https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg
                 * thumb_url : https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg
                 * original_url : https://image.yunifang.com/yunifang/images/comments/user/4772659/17041808387029147734801454.jpg
                 */

                private String id;
                private String normal_url;
                private String thumb_url;
                private String original_url;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getNormal_url() {
                    return normal_url;
                }

                public void setNormal_url(String normal_url) {
                    this.normal_url = normal_url;
                }

                public String getThumb_url() {
                    return thumb_url;
                }

                public void setThumb_url(String thumb_url) {
                    this.thumb_url = thumb_url;
                }

                public String getOriginal_url() {
                    return original_url;
                }

                public void setOriginal_url(String original_url) {
                    this.original_url = original_url;
                }
            }
        }

        public static class ActivityBean {
            /**
             * id : 36
             * title : 实付满49元包邮
             * description : http://h.yunifang.com/h/postage.html
             */

            private String id;
            private String title;
            private String description;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }

        public static class GoodsRelDetailsBean {
            /**
             * id : 79
             * goods_name : 氨基酸温和净透洁面乳100ml
             * shop_price : 59.9
             * goods_img : http://image.hmeili.com/yunifang/images/goods/79/goods_img/160819085485217215236528712.jpg
             * reservable : false
             * stock_number : 0
             * restrict_purchase_num : 0
             */

            private String id;
            private String goods_name;
            private double shop_price;
            private String goods_img;
            private boolean reservable;
            private int stock_number;
            private int restrict_purchase_num;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public double getShop_price() {
                return shop_price;
            }

            public void setShop_price(double shop_price) {
                this.shop_price = shop_price;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public boolean isReservable() {
                return reservable;
            }

            public void setReservable(boolean reservable) {
                this.reservable = reservable;
            }

            public int getStock_number() {
                return stock_number;
            }

            public void setStock_number(int stock_number) {
                this.stock_number = stock_number;
            }

            public int getRestrict_purchase_num() {
                return restrict_purchase_num;
            }

            public void setRestrict_purchase_num(int restrict_purchase_num) {
                this.restrict_purchase_num = restrict_purchase_num;
            }
        }
    }
}
