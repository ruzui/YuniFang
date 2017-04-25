package myapplication888.bwie.com.yunifang.Fragment;

import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */

public class ShopData {


    /**
     * cartItemList : [{"colorID":0,"count":2,"id":41,"name":"新品眼罩丨悠然舒缓蒸汽眼罩","pic":"https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg","price":49,"productID":1615,"repertory":110,"sizeID":0,"userID":20},{"colorID":0,"count":2,"id":57,"name":"懒妹纸必备丨玫瑰滋养矿物睡眠面膜180g","pic":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","price":59.9,"productID":9,"repertory":110,"sizeID":0,"userID":20},{"colorID":0,"count":1,"id":58,"name":"新品眼罩丨悠然舒缓蒸汽眼罩","pic":"https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg","price":49,"productID":1615,"repertory":110,"sizeID":0,"userID":20}]
     * response : cart
     */

    private String response;
    private List<CartItemListBean> cartItemList;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<CartItemListBean> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItemListBean> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public static class CartItemListBean {
        /**
         * colorID : 0
         * count : 2
         * id : 41
         * name : 新品眼罩丨悠然舒缓蒸汽眼罩
         * pic : https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg
         * price : 49
         * productID : 1615
         * repertory : 110
         * sizeID : 0
         * userID : 20
         */

        private boolean flag;
        private int colorID;
        private int count;
        private int id;
        private String name;
        private String pic;
        private float price;
        private int productID;
        private int repertory;
        private int sizeID;
        private int userID;

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public int getColorID() {
            return colorID;
        }

        public void setColorID(int colorID) {
            this.colorID = colorID;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }


        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public int getRepertory() {
            return repertory;
        }

        public void setRepertory(int repertory) {
            this.repertory = repertory;
        }

        public int getSizeID() {
            return sizeID;
        }

        public void setSizeID(int sizeID) {
            this.sizeID = sizeID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        @Override
        public String toString() {
            return "CartItemListBean{" +
                    "colorID=" + colorID +
                    ", count=" + count +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", pic='" + pic + '\'' +
                    ", price=" + price +
                    ", productID=" + productID +
                    ", repertory=" + repertory +
                    ", sizeID=" + sizeID +
                    ", userID=" + userID +
                    '}';
        }
    }
}
