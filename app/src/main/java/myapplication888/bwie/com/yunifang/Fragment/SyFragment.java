package myapplication888.bwie.com.yunifang.Fragment;

import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import myapplication888.bwie.com.yunifang.R;

/**
 * Created by dell on 2017/4/12.
 */
public class SyFragment extends Fragment {
    private Handler handler1 = new Handler() {

        private TextView show_price;
        private TextView name;
        private TextView market_price;
        private ImageView image;
        private LinearLayout linear;

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    linear = (LinearLayout) inflate.findViewById(R.id.linear);
                    List<Syfragment_bean.DataBean.DefaultGoodsListBean> xx = (List<Syfragment_bean.DataBean.DefaultGoodsListBean>) msg.obj;
                    for (int i = 0; i < xx.size(); i++) {
                        View view = LayoutInflater.from(getActivity()).inflate(R.layout.syfragment_sj, linear, false);
                        image = (ImageView) view.findViewById(R.id.imageView_commodity);
                        market_price = (TextView) view.findViewById(R.id.textView_market_price);
                        name = (TextView) view.findViewById(R.id.textView_name);
                        show_price = (TextView) view.findViewById(R.id.textView_price);
                        ImageLoader.getInstance().displayImage(ad5.get(i).getGoods_img(), image);
                        name.setText(ad5.get(i).getGoods_name());
                        market_price.setText(ad5.get(i).getMarket_price() + "");
                        show_price.setText(ad5.get(i).getShop_price() + "");
                        market_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                        linear.addView(view);
                    }
                    break;
                case 1:
                    List<Syfragment_bean.DataBean.SubjectsBean> yy = (List<Syfragment_bean.DataBean.SubjectsBean>) msg.obj;
                    listview.setAdapter(new adapter(getActivity(),subjects));
                    break;

            }

        }
    };
    @Nullable
    Handler handler = new Handler();
    //图片网络地址
    String url_image = "http://m.yunifang.com/yunifang/mobile/home?random=84831&encode=9dd34239798e8cb22bf99a75d1882447";
    private List<Syfragment_bean.DataBean.SubjectsBean> subjects;
    private List<Syfragment_bean.DataBean.DefaultGoodsListBean> ad5;
    private ViewPager vp;
    private int current;
    private ArrayList<ImageView> list_image;
    private ArrayList<ImageView> list_yuan;
    private LinearLayout linear_yuan;
    private MyAdapter myAdapter;
    private ImageView mrqd;
    private ImageView jfsc;
    private ImageView dhzq;
    private ImageView zwcx;
    private View inflate;
    private ListView listview;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = View.inflate(getActivity(), R.layout.syfragment, null);
        list_image = new ArrayList<>();
        list_yuan = new ArrayList<>();
        linear_yuan = (LinearLayout) inflate.findViewById(R.id.lin);
        vp = (ViewPager) inflate.findViewById(R.id.vp);
        listview = (ListView) inflate.findViewById(R.id.Home_page_listView);
        mrqd = (ImageView) inflate.findViewById(R.id.mrjd);
        jfsc = (ImageView) inflate.findViewById(R.id.jfsc);
        dhzq = (ImageView) inflate.findViewById(R.id.dhzq);
        zwcx = (ImageView) inflate.findViewById(R.id.zwcx);
        ImageLoader.getInstance().displayImage("http://image.hmeili.com/yunifang/images/goods/ad0/160823172997710201253418883.png", mrqd);
        ImageLoader.getInstance().displayImage("http://image.hmeili.com/yunifang/images/goods/ad0/160623120383916524110935835.png", jfsc);
        ImageLoader.getInstance().displayImage("http://image.hmeili.com/yunifang/images/goods/ad0/160623120326416505640517284.png", dhzq);
        ImageLoader.getInstance().displayImage("http://image.hmeili.com/yunifang/images/goods/ad0/160623120430916487170096321.png", zwcx);
        getNetData();
        intinite();
        return inflate;
    }

    private void intinite() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url_image).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {




            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String s = response.body().string();
                Gson gosn = new Gson();
                Syfragment_bean bean1 = gosn.fromJson(s, Syfragment_bean.class);
                ad5 = bean1.getData().getDefaultGoodsList();
                subjects = bean1.getData().getSubjects();
                Message message = handler1.obtainMessage(0, ad5);
                message.sendToTarget();
                Message message1 = handler1.obtainMessage(1, subjects);
                message1.sendToTarget();
            }
        });
    }


    private void getNetData() {

        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get(getActivity(), url_image, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Gson gson = new Gson();
                Syfragment_bean bean = gson.fromJson(responseString, Syfragment_bean.class);
                //Log.d("aaa",bean.getDate().getAd1().toString());
                // List<Syfragment_bean.Date.ad11> ad1 = bean.getDate().getAd1();
                List<Syfragment_bean.DataBean.Ad1Bean> ad1 = bean.getData().getAd1();
                for (int i = 0; i < ad1.size(); i++) {
                    //獲取網絡地址
                    String url = ad1.get(i).getImage();
                    //new一張圖片
                    ImageView imageView = new ImageView(getActivity());
                    //設置他填充福昌體
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    //用imageloder給他网络地址，进而显示图片
                    ImageLoader.getInstance().displayImage(url, imageView);
                    //把图片装进集合
                    list_image.add(imageView);

                    //new一个小圆点
                    ImageView button = new ImageView(getActivity());
                    button.setImageResource(R.drawable.yuan_nomal);
                    button.setPadding(5, 0, 5, 0);
                    linear_yuan.addView(button);
                    //把原点装进集合
                    list_yuan.add(button);
                }
                //设置小圆点的第一个是默认选中状态
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
                    if (position % list_yuan.size() == i) {
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


    @Override
    public void onResume() {
        super.onResume();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                current = vp.getCurrentItem();

                vp.setCurrentItem(current + 1);
                handler.postDelayed(this, 3000);
            }
        }, 50);


    }

    private void initDatas() {
        if (myAdapter == null) {
            myAdapter = new MyAdapter();
            vp.setAdapter(myAdapter);
        } else {
            myAdapter.notifyDataSetChanged();
        }


    }

    class MyAdapter extends PagerAdapter {

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = list_image.get(position % (list_image.size()));
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = list_image.get(position % (list_image.size()));
            container.removeView(view);
        }

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }


}


