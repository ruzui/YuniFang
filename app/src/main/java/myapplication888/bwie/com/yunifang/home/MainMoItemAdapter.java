package myapplication888.bwie.com.yunifang.home;

import android.graphics.Paint;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import myapplication888.bwie.com.yunifang.R;


class MianMoItemAdapter extends BaseAdapter {
    private FragmentActivity activity;
    private ArrayList<GoodBrief> data;

    public MianMoItemAdapter(FragmentActivity activity, ArrayList<GoodBrief> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = View.inflate(activity, R.layout.mingxing_item, null);

        ImageView bagImage = (ImageView) inflate.findViewById(R.id.mingxing_bagImage);
        ImageView smallImage = (ImageView) inflate.findViewById(R.id.mingxing_smallImage);
        TextView title = (TextView) inflate.findViewById(R.id.mingxing_title);
        TextView neirong = (TextView) inflate.findViewById(R.id.mingxing_neirong);
        TextView price = (TextView) inflate.findViewById(R.id.mingxing_price);
        TextView oldprice = (TextView) inflate.findViewById(R.id.mingxing_oldprice);
        Glide.with(activity).load(data.get(i).getGoods_img()).into(bagImage);
        Glide.with(activity).load(data.get(i).getWatermarkUrl()).into(smallImage);
        title.setText(data.get(i).getEfficacy());
        neirong.setText(data.get(i).getGoods_name());
        price.setText("￥"+data.get(i).getShop_price()+" ");
        oldprice.setText("￥"+data.get(i).getMarket_price());
        //数字上画斜线
        oldprice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        return inflate;
    }
}
