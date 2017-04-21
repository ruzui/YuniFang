package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

import myapplication888.bwie.com.yunifang.R;
import myapplication888.bwie.com.yunifang.dateActivity.mianno;

/**
 * Created by dell on 2017/4/12.
 */
public class FlFragment extends Fragment {
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                      gv.setAdapter(new gvadapter(getActivity(),goodsBrief));
                    break;
            }
        }
    };
    private List<Flfragment_mingxing_bean.DataBean.GoodsBriefBean> goodsBrief;
    private ImageView mian;
    private GridView gv;
    private String url = "http://m.yunifang.com/yunifang/mobile/category/list?random=96333&encode=bf3386e14fe5bb0bcef234baebca2414";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.flfragment, null);
        gv = (GridView) inflate.findViewById(R.id.gv);
        getdata();
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String id1 = goodsBrief.get(position).getId();

                 Intent intent = new Intent(getActivity(),Flfagment_mingxing.class);
                 intent.putExtra("id1",id1);
                 startActivity(intent);
            }
        });
        return inflate;
    }

    private void getdata() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {



            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String s = response.body().string();
                Gson gson = new Gson();
                Flfragment_mingxing_bean bean = gson.fromJson(s, Flfragment_mingxing_bean.class);
                goodsBrief = bean.getData().getGoodsBrief();
                Message message = handler.obtainMessage(0, goodsBrief);
                message.sendToTarget();
            }
        });
    }

}
