package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import myapplication888.bwie.com.yunifang.Activity.MainActivity;
import myapplication888.bwie.com.yunifang.R;

/**
 * Created by dell on 2017/4/12.
 */
public class GwFragment extends Fragment implements View.OnClickListener {
    private CarListviewAdapter adapter;
    private Context mContext;
    private TextView cartitle_num;
    private TextView cartitle_bianji;
    private TextView car_price;
    private Button car_jiesuan;
    private CheckBox cb_quan;
    private ListView car_lv;
    private LinearLayout ll_shop;
    private LinearLayout ll_mo;
    private Button car_guang;
    private List<ShopData.CartItemListBean> list;
    private View view;
    private List<Shop> shopList=new ArrayList<>();
    private List<Shop> shops;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.gwfragment, null);
        initView();
        return view;

    }
    private void initView() {
        cartitle_num = (TextView) view.findViewById(R.id.cartitle_num);
        cartitle_bianji = (TextView) view.findViewById(R.id.cartitle_bianji);
        car_price = (TextView) view.findViewById(R.id.car_price);
        car_guang = (Button) view.findViewById(R.id.car_guang);
        car_jiesuan = (Button) view.findViewById(R.id.car_jiesuan);
        cb_quan = (CheckBox) view.findViewById(R.id.cb_quan);
        car_lv = (ListView) view.findViewById(R.id.car_lv);
        ll_shop = (LinearLayout) view.findViewById(R.id.ll_shop);
        ll_mo = (LinearLayout) view.findViewById(R.id.ll_mo);
        car_guang.setOnClickListener(this);
        car_jiesuan.setOnClickListener(this);
        cb_quan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();
                if (checked){
                    adapter.setCheck(checked);

                }else{
                    adapter.setCheck(checked);
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.car_guang:
                Intent intent=new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.car_jiesuan:
                shopList.clear();
                for (Shop s:shops) {
                    if (s.isaBoolean()){
                        Log.i("ssss","111111111111");
                        shopList.add(s);
                    }
                }
                Intent it=new Intent(getActivity(), OrderDetailActivity.class);
                it.putExtra("sh", (Serializable) shops);
                startActivity(it);
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gatData();
    }


    private void gatData() {
        SharedPrefrenceUtils shoucang = SharedPrefrenceUtils.Shoucang(getActivity());
        int id = shoucang.getId("id");
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        String url="http://169.254.116.62:8080/bullking1/cart?userID="+id;
        StringRequest request=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                try {
                    JSONArray jsonArray = new JSONObject(s).getJSONArray("cartItemList");
                    Gson gson=new Gson();
                    Type type=new TypeToken<List<Shop>>(){}.getType();
                    shops= gson.fromJson(jsonArray.toString(),type);
                    if (shops.size()!=0){
                        ll_shop.setVisibility(View.VISIBLE);
                        ll_mo.setVisibility(View.GONE);
                        cartitle_bianji.setVisibility(View.VISIBLE);
                        adapter =  new CarListviewAdapter(shops, getActivity(),car_price,new CarListviewAdapter.OnCheckListener() {
                            @Override
                            public void onCheck(boolean check,double price) {
                                cb_quan.setChecked(check);

                                DecimalFormat df=new DecimalFormat(".##");
                                String s1 = df.format(price);
                                car_price.setText("总计:￥"+s1);
                            }
                        });
                        car_lv.setAdapter(adapter);
                        cartitle_num.setText("("+adapter.getCount()+")");
                    }else{
                        ll_shop.setVisibility(View.GONE);
                        ll_mo.setVisibility(View.VISIBLE);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        queue.add(request);
    }

}
