package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.text.DecimalFormat;
import java.util.List;

import myapplication888.bwie.com.yunifang.R;

public class CarListviewAdapter extends BaseAdapter {
    private List<Shop> shops;
    private Context context;
    private TextView car_price;
    public CarListviewAdapter(List<Shop> shops, Context context, TextView car_price, OnCheckListener onCheckListener) {
        this.shops=shops;
        this.context=context;
        this.listener=onCheckListener;
        this.car_price=car_price;
    }
    public OnCheckListener listener;

    //定义接口
    public interface OnCheckListener {
        void onCheck(boolean check, double price);
    }
    @Override
    public int getCount() {
        return shops.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public void setCheck(Boolean check){
        for (int i = 0; i <shops.size() ; i++) {

            shops.get(i).setaBoolean(check);

        }
        double price = getPrice();
        DecimalFormat df=new DecimalFormat(".##");
        String s1 = df.format(price);
        car_price.setText("总计:￥"+s1);
        notifyDataSetChanged();
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView=View.inflate(context, R.layout.carlistview_item,null);
        CheckBox car_lv_cb= (CheckBox) convertView.findViewById(R.id.car_lv_cb);
        ImageView car_lv_iv= (ImageView) convertView.findViewById(R.id.car_lv_iv);
        TextView car_lv_name= (TextView) convertView.findViewById(R.id.car_lv_name);
        TextView car_lv_price= (TextView) convertView.findViewById(R.id.car_lv_price);
        TextView car_lv_count= (TextView) convertView.findViewById(R.id.car_lv_count);

        Glide.with(context).load(shops.get(position).getPic()).into(car_lv_iv);
        car_lv_name.setText(shops.get(position).getName());
        car_lv_price.setText("￥"+shops.get(position).getPrice());
        car_lv_count.setText("数量:"+shops.get(position).getCount());
        car_lv_cb.setChecked(shops.get(position).isaBoolean());
        car_lv_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                    //listener.setPrice(checked,shops.get(position).getPrice());

                shops.get(position).setaBoolean(checked);
                boolean b=true;
                for (Shop s:shops) {
                    boolean b1 = s.isaBoolean();
                    if (!b1){
                        b=false;
                        listener.onCheck(b,getPrice());
                        return;
                    }
                }
                if (b){
                    listener.onCheck(b,getPrice());
                }
            }
        });
        return convertView;
    }
    private double getPrice() {
        double itemPrice=0.00;
        for (Shop shop:shops) {
            if (shop.isaBoolean()){
                itemPrice+=shop.getPrice()*shop.getCount();
                Log.i("ssss",itemPrice+"");
            }
        }
        return itemPrice;
    }
}
