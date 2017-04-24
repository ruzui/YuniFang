package myapplication888.bwie.com.yunifang.home;


import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.okhttp.Response;

public class getDataHome {
    private HomeFragmentData homedata;
    private Context context;

    public getDataHome(HomeFragmentData homedata, Context context) {
        this.homedata=homedata;
        this.context=context;
    }

    public void getDataFromNet(String url){
        //得到requestQueue请求队列对象
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        //得到request对象
      StringRequest request=  new StringRequest(url, new com.android.volley.Response.Listener<String>() {
             @Override
             public void onResponse(String response) {
                 homedata.succes(response);
             }
         }, new com.android.volley.Response.ErrorListener() {
             @Override
             public void onErrorResponse(VolleyError error) {
                 Log.d("------>>>","失败");             }
         });
        requestQueue.add(request);
    }



}

