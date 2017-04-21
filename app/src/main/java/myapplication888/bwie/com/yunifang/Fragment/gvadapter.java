package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Context;
import android.graphics.Paint;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import myapplication888.bwie.com.yunifang.R;

/**
 * Created by dell on 2017/4/17.
 */
public class gvadapter extends BaseAdapter {
    private Context context;
    private List<Flfragment_mingxing_bean.DataBean.GoodsBriefBean>list;

    public gvadapter(Context context, List<Flfragment_mingxing_bean.DataBean.GoodsBriefBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return 14;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         viewHolder v;
         if (convertView==null){
             convertView = View.inflate(context, R.layout.flfragment_gvmingxing, null);
             v = new viewHolder();
             v.imageview = (ImageView) convertView.findViewById(R.id.mx_img);
             v.textview1 = (TextView) convertView.findViewById(R.id.efficacy);
             v.textview2 = (TextView) convertView.findViewById(R.id.mx_name);
             v.textview3 = (TextView) convertView.findViewById(R.id.price);
             v.textview4 = (TextView) convertView.findViewById(R.id.price_long);
             convertView.setTag(v);
         }else{
             v = (viewHolder) convertView.getTag();
         }
        ImageLoader.getInstance().displayImage(list.get(position).getGoods_img(),v.imageview);
        v.textview1.setText(list.get(position).getEfficacy());
        v.textview2.setText(list.get(position).getGoods_name());
        v.textview3.setText(list.get(position).getShop_price()+"");
        v.textview4.setText(list.get(position).getMarket_price()+"");
        v.textview4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        return convertView;
    }
     class viewHolder{
          ImageView imageview;
          TextView textview1;
          TextView textview4;
          TextView textview2;
          TextView textview3;
     }
}
