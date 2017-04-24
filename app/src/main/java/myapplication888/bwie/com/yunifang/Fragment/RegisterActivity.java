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
import android.widget.Toast;

import com.baway.chilijie.R;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

import java.io.IOException;

import myapplication888.bwie.com.yunifang.Activity.MainActivity;

public class RegisterActivity extends AppCompatActivity {
    private ImageView register_fan;
    private EditText register_name;
    private EditText register_pwd;
    private Button register;
    private String registerInterface;
    private String pwd;
    private String name;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    String content= (String) msg.obj;
                    Toast.makeText(RegisterActivity.this, content, Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    String string= (String) msg.obj;
                    try {
                        String dataStr = new JSONObject(string).getString("dataStr");
                        if (dataStr.equals("register succeed")){
                            Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(RegisterActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
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
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        register_fan = (ImageView) findViewById(R.id.register_fan);
        register_name = (EditText) findViewById(R.id.register_name);
        register_pwd = (EditText) findViewById(R.id.register_pwd);
        register = (Button) findViewById(R.id.register);
        register_fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                setResult(13, intent);
                finish();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name =   register_name.getText().toString().trim();
                pwd = register_pwd.getText().toString().trim();
                registerInterface= "http://169.254.116.62:8080/bullking1/register?name="+name+"&pwd="+pwd;
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)) {
                    OkHttpClient okHttpClient = new OkHttpClient();
                    Request request = new Request.Builder().url(registerInterface).build();
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
                    Toast.makeText(RegisterActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RegisterActivity.this, "请输入账号", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}