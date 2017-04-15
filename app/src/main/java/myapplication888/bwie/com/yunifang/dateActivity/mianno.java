package myapplication888.bwie.com.yunifang.dateActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import myapplication888.bwie.com.yunifang.R;
public class mianno extends AppCompatActivity {

    private ListView listview;
    String url_image = "http://m.yunifang.com/yunifang/mobile/goods/getall?random=91873&encode=68301f6ea0d6adcc0fee63bd21815d69&category_id=9";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mianno);
        listview = (ListView) findViewById(R.id.mianmo_listview);
        getdate();
    }

    private void getdate() {
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
                 Gson gson  = new Gson();


             }
         });
    }
}
