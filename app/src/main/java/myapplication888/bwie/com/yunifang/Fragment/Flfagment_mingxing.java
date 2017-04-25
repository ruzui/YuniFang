package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.msebera.android.httpclient.Header;
import myapplication888.bwie.com.yunifang.Activity.MainActivity;
import myapplication888.bwie.com.yunifang.R;

public class Flfagment_mingxing extends AppCompatActivity implements View.OnClickListener {
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
    private boolean flag;
    private Gson gson;
    private List<Flfagment_mingxing_gv_bean.DataBean.GoodsBean.AttributesBean> attributes;
    private List<Flfagment_mingxing_gv_bean.DataBean.CommentsBean> comments;
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
    private TextView jiarugouwu;
    private PopupWindow pw;
    private RelativeLayout pw_jia;
    private RelativeLayout pw_jian;
    private ImageView pw_jiaimg;
    private ImageView pw_jianimg;
    private ImageView pw_iv;
    private TextView pw_num;
    private TextView pw_kucun;
    private TextView pw_xiangou;
    private TextView pw_price;
    private Button pw_queding;
    private Par_User.DataBean.GoodsBean goods;
    private SharedPrefrenceUtils prefrenceUtils;
    private int count = 1;
    private String url = "http://m.yunifang.com/yunifang/mobile/goods/detail?" +
            "random=46389&encode=70ed2ed2facd7a812ef46717b37148d6&id=";

    private Handler handler1 = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    String data = (String) msg.obj;
                    getJson(data);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flfagment_mingxing);
        //获取传值
        String id1 = getIntent().getStringExtra("id1");
        prefrenceUtils = SharedPrefrenceUtils.Shoucang(this);
        //找到控件
        find();
        //网络请求数据
        getData(id1);
        getData1(url + id1);
        //
        getPopupwindow();


    }

    //获取数据
    private void getData1(String s) {
        //创建OkHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();

        //创建Request对象
        Request request = new Request.Builder().url(s).build();
        //得到Call
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
            }

            @Override
            public void onResponse(Response response) throws IOException {
                final String string = response.body().string();
                Message message = handler1.obtainMessage(0, string);
                message.sendToTarget();
            }
        });
    }

    private void find() {
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

        jiarugouwu = (TextView) findViewById(R.id.jiarugouwu);
        //加入购物车点击监听
        jiarugouwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pw.isShowing()) {
                    pw.dismiss();
                } else {
                    pw.showAtLocation(jiarugouwu, Gravity.BOTTOM, 0, 0);
                }
            }
        });
    }

    private void getPopupwindow() {
        View view = View.inflate(Flfagment_mingxing.this, R.layout.popupwindow, null);
        pw = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        pw.setFocusable(true);
        pw.setTouchable(true);
        pw.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorBg)));
        pw_jia = (RelativeLayout) view.findViewById(R.id.pw_jia);
        pw_jian = (RelativeLayout) view.findViewById(R.id.pw_jian);
        pw_jiaimg = (ImageView) view.findViewById(R.id.pw_jiaimg);
        pw_jianimg = (ImageView) view.findViewById(R.id.pw_jianimg);
        pw_iv = (ImageView) view.findViewById(R.id.pw_iv);
        pw_num = (TextView) view.findViewById(R.id.pw_num);
        pw_kucun = (TextView) view.findViewById(R.id.pw_kucun);
        pw_xiangou = (TextView) view.findViewById(R.id.pw_xiangou);
        pw_price = (TextView) view.findViewById(R.id.pw_price);
        pw_queding = (Button) view.findViewById(R.id.pw_queding);

        pw_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == goods.getRestrict_purchase_num() - 1) {
                    pw_jiaimg.setImageResource(R.mipmap.add_unable);
                }

                if (count < goods.getRestrict_purchase_num()) {
                    count++;
                    pw_num.setText(count + "");
                    pw_jianimg.setImageResource(R.mipmap.reduce_able);
                }
            }
        });
        pw_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (count == 2) {
                    pw_jianimg.setImageResource(R.mipmap.reduce_unable);
                }
                if (count > 1) {
                    count--;
                    pw_num.setText(count + "");
                    pw_jiaimg.setImageResource(R.mipmap.add_able);
                }
            }
        });
        pw_queding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = prefrenceUtils.getSp("flag");
                if (flag) {
                    RequestQueue queue = Volley.newRequestQueue(Flfagment_mingxing.this);
                    String url = "http://169.254.116.62:8080/bullking1/cart";
                    StringRequest request = new StringRequest(com.android.volley.Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
                        @Override
                        public void onResponse(String s) {
                            Toast.makeText(Flfagment_mingxing.this, "成功加入购物车！", Toast.LENGTH_SHORT).show();

                        }
                    }, new com.android.volley.Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError volleyError) {
                            Toast.makeText(Flfagment_mingxing.this, "加入购物车失败！", Toast.LENGTH_SHORT).show();
                        }

                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> map = new HashMap<>();
                            //store_id = 3850
                            map.put("productID", goods.getId());
                            map.put("count", pw_num.getText().toString().trim());
                            map.put("price", goods.getShop_price() + "");
                            map.put("pic", goods.getGoods_img());
                            map.put("userID", SharedPrefrenceUtils.getId("id") + "");
                            map.put("name", goods.getGoods_name());
                            return map;
                        }
                    };
                    queue.add(request);
                } else {
                    Toast.makeText(Flfagment_mingxing.this, "请先登录", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Flfagment_mingxing.this,LoginActivity.class);
                    startActivityForResult(intent, 12);
                }
            }
        });
    }


    //解析json串
    private void getJson(String data) {
        Gson gson = new Gson();
        Par_User par_user = gson.fromJson(data, Par_User.class);
        goods = par_user.getData().getGoods();

        pw_kucun.setText("库存"+ goods.getStock_number()+"件");
        pw_price.setText("￥"+ goods.getShop_price());
        pw_xiangou.setText("限购"+ goods.getRestrict_purchase_num()+"件");

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
