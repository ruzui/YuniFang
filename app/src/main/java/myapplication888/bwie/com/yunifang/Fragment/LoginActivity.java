package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

import java.io.IOException;

import myapplication888.bwie.com.yunifang.Activity.MainActivity;
import myapplication888.bwie.com.yunifang.R;

public class LoginActivity extends AppCompatActivity {

    private ImageView login_fan;
    private TextView login_zhuce;
    private EditText login_name;
    private EditText login_pwd;
    private Button login;
    private String name;
    private String pwd;
    private String loginInterface;
    private SharedPrefrenceUtils prefrenceUtils;
    private boolean flag;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    String content= (String) msg.obj;
                    Toast.makeText(LoginActivity.this, content, Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    String string= (String) msg.obj;
                    try {
                        String dataStr = new JSONObject(string).getString("dataStr");
                        int id = new JSONObject(string).getInt("id");
                        SharedPrefrenceUtils.add("id",id);
                        if (dataStr.equals("login succeed")){
                            Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                            SharedPrefrenceUtils.add("flag",true);

                            back();
                        }else{
                            Toast.makeText(LoginActivity.this, "该账号还没有注册", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        prefrenceUtils = SharedPrefrenceUtils.Shoucang(this);
        flag = prefrenceUtils.getSp("flag");
    }

    private void initView() {
        login_fan = (ImageView) findViewById(R.id.login_fan);
        login_zhuce = (TextView) findViewById(R.id.login_zhuce);
        login_name = (EditText) findViewById(R.id.login_name);
        login_pwd = (EditText) findViewById(R.id.login_pwd);
        login = (Button) findViewById(R.id.login);
        login_fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                setResult(12,intent);
                finish();
            }
        });
        login_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivityForResult(intent,13);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name =  login_name.getText().toString().trim();
                pwd = login_pwd.getText().toString().trim();
                loginInterface="http://169.254.116.62:8080/bullking1/login?name="+name+"&pwd="+pwd;
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)) {
                OkHttpClient okHttpClient = new OkHttpClient();
                Request request = new Request.Builder().url(loginInterface).build();
                Call call = okHttpClient.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Request request, IOException e) {
                        String content = "请求失败";
                        Message.obtain(handler, 0, content).sendToTarget();
                    }
                    @Override
                    public void onResponse(Response response) throws IOException {
                        String string = response.body().string();
                        Message.obtain(handler, 1, string).sendToTarget();
                    }
                });
            }else if (!TextUtils.isEmpty(name) && TextUtils.isEmpty(pwd)){
                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this, "请输入账号", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void back() {
        setResult(20);
        finish();
    }
}