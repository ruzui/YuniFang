package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Context;
import android.graphics.Paint;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import myapplication888.bwie.com.yunifang.R;

/**
 * Created by dell on 2017/4/13.
 */
public class adapter extends BaseAdapter {
    private Context context;
    private List<Syfragment_bean.DataBean.SubjectsBean> list;

    public adapter(Context context, List<Syfragment_bean.DataBean.SubjectsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String image = list.get(position).getImage();

        List<Syfragment_bean.DataBean.SubjectsBean.GoodsListBean> goodsList = list.get(position).getGoodsList();
//            View secondView = LayoutInflater.from(context).inflate(R.layout.item_text_2,false);
        convertView = View.inflate(context, R.layout.syfragment_sj_, null);
        LinearLayout hot_spring_linear = (LinearLayout) convertView.findViewById(R.id.hot_special_linear);
        ImageView hot_spring_image = (ImageView) convertView.findViewById(R.id.hot_special_image);
        ImageLoader.getInstance().displayImage(image, hot_spring_image);
        //  Glide.with(context).load(image).into(hot_spring_image);
        for (int j = 0; j < goodsList.size(); j++) {
            View view = LayoutInflater.from(context).inflate(R.layout.syfragment_sj, hot_spring_linear, false);
            //通过View寻找ID实例化控件
            ImageView img = (ImageView) view.findViewById(R.id.imageView_commodity);
            //实例化TextView控件
            TextView tv = (TextView) view.findViewById(R.id.textView_name);
            TextView tv_price = (TextView) view.findViewById(R.id.textView_price);
            TextView tv_market_price = (TextView) view.findViewById(R.id.textView_market_price);
            //将集合中的数据放到ImageView中
            //Glide.with(context).load(goodsList.get(j).getGoods_img()).into(img);
            ImageLoader.getInstance().displayImage(goodsList.get(j).getGoods_img(), img);
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            //给TextView添加文字
            tv.setText(goodsList.get(j).getGoods_name());
            tv_price.setText(goodsList.get(j).getShop_price() + "");
            tv_market_price.setText(goodsList.get(j).getMarket_price() + "");
            tv_market_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            //把行布局放到linear里
            hot_spring_linear.addView(view);
        }

        return convertView;

    }
}
