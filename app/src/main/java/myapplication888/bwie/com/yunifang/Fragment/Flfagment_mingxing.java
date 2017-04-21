package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import myapplication888.bwie.com.yunifang.Activity.MainActivity;
import myapplication888.bwie.com.yunifang.R;

public class Flfagment_mingxing extends AppCompatActivity implements View.OnClickListener {
    private Gson gson;
    private List<Flfagment_mingxing_gv_bean.DataBean.GoodsBean.AttributesBean> attributes;
    private List<Flfagment_mingxing_gv_bean.DataBean.CommentsBean> comments;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    Type type = new TypeToken<List<Flfagment_mingxing_gv_sj_bean>>() {
                    }.getType();
                    List<Flfagment_mingxing_gv_sj_bean> flfagment_mingxing_gv_sj_bean = gson.fromJson(goods_desc, type);
                    for (int i = 0; i < flfagment_mingxing_gv_sj_bean.size(); i++) {
                        View view = LayoutInflater.from(Flfagment_mingxing.this).inflate(R.layout.cpxq_sj, cpxq_sj, false);
                        ImageView cpxq_sj_iv = (ImageView) view.findViewById(R.id.cpxq_sj_iv);
                        ImageLoader.getInstance().displayImage(flfagment_mingxing_gv_sj_bean.get(i).getUrl(), cpxq_sj_iv);
                        cpxq_sj_iv.setScaleType(ImageView.ScaleType.FIT_XY);
                        cpxq_sj.addView(view);

                    }

                    break;
                case 1:
                    List<Flfagment_mingxing_gv_bean.DataBean.GoodsBean.AttributesBean> attr = (List<Flfagment_mingxing_gv_bean.DataBean.GoodsBean.AttributesBean>) msg.obj;
                    for (int i = 1; i < 4; i++) {
                        View inflate = LayoutInflater.from(Flfagment_mingxing.this).inflate(R.layout.cpcs_sj, cpcs_sj, false);
                        TextView attr_name = (TextView) inflate.findViewById(R.id.attr_name);
                        TextView value = (TextView) inflate.findViewById(R.id.attr_value);
                        attr_name.setText(attributes.get(i).getAttr_name());
                        value.setText(attributes.get(i).getAttr_value());
                        cpcs_sj.addView(inflate);
                    }
                    break;
                case 2:

                    break;

            }
        }
    };
    private String goods_desc;
    private Flfagment_mingxing_gv_bean bean;
    private double shipping_fee;
    private ArrayList<ImageView> list_image;
    private ArrayList<ImageView> list_yuan;
    private LinearLayout linear_yuan;
    private MXAdapter mxAdapter;
    private ViewPager vp;
    private String id1;
    private TextView mmname;
    private String goods_name;
    private TextView xianjia;
    private TextView yuanjia;
    private double shop_price;
    private double market_price;
    private TextView yunfei;
    private TextView xiaoliang;
    private TextView shoucang;
    private int sales_volume;
    private int stock_number;
    private ListView mx;
    private List<Flfagment_mingxing_gv_bean.DataBean.ActivityBean> activity1;
    private LinearLayout cpxq_sj;
    private LinearLayout cpcs_sj;
    private LinearLayout pl_sj;
    private TextView cpxq;
    private TextView cpcs;
    private TextView pl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flfagment_mingxing);
        list_image = new ArrayList<>();
        list_yuan = new ArrayList<>();
        linear_yuan = (LinearLayout) findViewById(R.id.mingxing_lin);
        vp = (ViewPager) findViewById(R.id.mingxing_vp);
        mx = (ListView) findViewById(R.id.mmxx);
        cpxq_sj = (LinearLayout) findViewById(R.id.cpxq_sj);
        cpcs_sj = (LinearLayout) findViewById(R.id.cpcs_sj);
        pl_sj = (LinearLayout) findViewById(R.id.pl_sj);
        cpxq = (TextView) findViewById(R.id.cpxq);
        cpxq.setOnClickListener(this);
        cpcs = (TextView) findViewById(R.id.cpcs);
        cpcs.setOnClickListener(this);
        pl = (TextView) findViewById(R.id.pl);
        pl.setOnClickListener(this);
        String id1 = getIntent().getStringExtra("id1");
        Log.e("sfasd", id1 + "");
        getData(id1);

    }


    private void getdate() {
        mmname = (TextView) findViewById(R.id.mmname);
        xianjia = (TextView) findViewById(R.id.xianjia);
        yuanjia = (TextView) findViewById(R.id.yuanjia);
        yunfei = (TextView) findViewById(R.id.yunfei);
        xiaoliang = (TextView) findViewById(R.id.xiaoliang);
        shoucang = (TextView) findViewById(R.id.shoucang);
        xiaoliang.setText("¥" + sales_volume);
        yunfei.setText("¥" + shipping_fee + "");
        shoucang.setText(stock_number + "");
        xianjia.setText("¥" + shop_price + "");
        yuanjia.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        yuanjia.setText(market_price + "");
        mmname.setText(goods_name);

    }

    private void getData(String id) {
        String url = "http://m.yunifang.com/yunifang/mobile/goods/detail?random=42187&encode=168d21c6d627072293fbbb0a44cc72e9&id=" + id;
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get(this, url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                gson = new Gson();
                bean = gson.fromJson(responseString, Flfagment_mingxing_gv_bean.class);
                Log.d("zzz", bean.getData().getGoods().getGallery().toString());
                goods_name = bean.getData().getGoods().getGoods_name();
                shop_price = bean.getData().getGoods().getShop_price();
                market_price = bean.getData().getGoods().getMarket_price();

                sales_volume = bean.getData().getGoods().getSales_volume();
                shipping_fee = bean.getData().getGoods().getShipping_fee();
                stock_number = bean.getData().getGoods().getStock_number();
                activity1 = bean.getData().getActivity();
                mx.setAdapter(new mmxxAdapter(Flfagment_mingxing.this, activity1));
                getdate();

                goods_desc = bean.getData().getGoods().getGoods_desc();


                Message message = handler.obtainMessage(0, goods_desc);
                message.sendToTarget();
                comments = bean.getData().getComments();
                Message message1 = handler.obtainMessage(1, comments);
                message1.sendToTarget();
                attributes = bean.getData().getGoods().getAttributes();
                Message message2 = handler.obtainMessage(2, attributes);
                message2.sendToTarget();

                List<Flfagment_mingxing_gv_bean.DataBean.GoodsBean.GalleryBean> gallery = bean.getData().getGoods().getGallery();
                for (int i = 0; i < gallery.size(); i++) {
                    //獲取網絡地址
                    String url = gallery.get(i).getNormal_url();
                    //new一張圖片
                    ImageView imageView = new ImageView(Flfagment_mingxing.this);
                    //設置他填充福昌體
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    //用imageloder給他网络地址，进而显示图片
                    ImageLoader.getInstance().displayImage(url, imageView);
                    //把图片装进集合
                    list_image.add(imageView);
                    //new一个小圆点
                    ImageView button = new ImageView(Flfagment_mingxing.this);
                    button.setImageResource(R.drawable.yuan_nomal);
                    button.setPadding(5, 0, 5, 0);
                    linear_yuan.addView(button);
                    //把原点装进集合
                    list_yuan.add(button);
                }
                list_yuan.get(0).setImageResource(R.drawable.yuan_select);
                initDatas();


            }
        });
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < list_yuan.size(); i++) {
                    if (position == i) {
                        list_yuan.get(i).setImageResource(R.drawable.yuan_select);
                    } else {
                        list_yuan.get(i).setImageResource(R.drawable.yuan_nomal);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initDatas() {
        if (mxAdapter == null) {
            mxAdapter = new MXAdapter();
            vp.setAdapter(mxAdapter);
        } else {
            mxAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cpxq:
                Toast.makeText(Flfagment_mingxing.this, "显示、", Toast.LENGTH_SHORT).show();
                cpxq_sj.setVisibility(View.VISIBLE);
                cpcs_sj.setVisibility(View.GONE);
                pl_sj.setVisibility(View.GONE);
                break;
            case R.id.cpcs:
                Toast.makeText(Flfagment_mingxing.this, "点了、", Toast.LENGTH_SHORT).show();
                cpxq_sj.setVisibility(View.GONE);
                cpcs_sj.setVisibility(View.VISIBLE);
                pl_sj.setVisibility(View.GONE);
                break;
            case R.id.pl:
                Toast.makeText(Flfagment_mingxing.this, "草、", Toast.LENGTH_SHORT).show();
                cpxq_sj.setVisibility(View.GONE);
                cpcs_sj.setVisibility(View.GONE);
                pl_sj.setVisibility(View.VISIBLE);
                break;
        }
    }


    class MXAdapter extends PagerAdapter {

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(list_image.get(position));
            return list_image.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(list_image.get(position));
        }

        @Override
        public int getCount() {
        return list_image.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }
}
