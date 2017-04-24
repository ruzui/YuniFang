package myapplication888.bwie.com.yunifang.home;

import java.util.ArrayList;


public class XinXiData {
    private ArrayList<GoodBrief> data;

    public XinXiData(ArrayList<GoodBrief> data) {
        this.data = data;
    }

    public XinXiData() {
        super();
    }

    public ArrayList<GoodBrief> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "XinXiData{" +
                "data=" + data +
                '}';
    }

    public void setData(ArrayList<GoodBrief> data) {
        this.data = data;
    }
}
