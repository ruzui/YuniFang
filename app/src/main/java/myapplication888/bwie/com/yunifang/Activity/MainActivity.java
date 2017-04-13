package myapplication888.bwie.com.yunifang.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import myapplication888.bwie.com.yunifang.Fragment.FlFragment;
import myapplication888.bwie.com.yunifang.Fragment.GwFragment;
import myapplication888.bwie.com.yunifang.Fragment.SyFragment;
import myapplication888.bwie.com.yunifang.Fragment.WdFragment;
import myapplication888.bwie.com.yunifang.R;

public class MainActivity extends FragmentActivity {
    private ImageView iv_sy;
    private ImageView iv_fl;
    private ImageView iv_gw;
    private ImageView iv_wd;
    private TextView tv_sy;
    private TextView tv_fl;
    private TextView tv_gw;
    private TextView tv_wd;
    private LinearLayout sy;
    private LinearLayout fl;
    private LinearLayout gw;
    private LinearLayout wd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_sy = (ImageView) findViewById(R.id.iv_sy);
        iv_fl = (ImageView) findViewById(R.id.iv_fl);
        iv_gw = (ImageView) findViewById(R.id.iv_gw);
        iv_wd = (ImageView) findViewById(R.id.iv_wd);
        tv_sy = (TextView) findViewById(R.id.tv_sy);
        tv_fl = (TextView) findViewById(R.id.tv_fl);
        tv_gw = (TextView) findViewById(R.id.tv_gw);
        tv_wd = (TextView) findViewById(R.id.tv_wd);
        initite();
        fag(new SyFragment());
       onClickListener();
    }

    private void initite() {
        sy = (LinearLayout) findViewById(R.id.sy);
        fl = (LinearLayout) findViewById(R.id.flei);
        gw = (LinearLayout) findViewById(R.id.gw);
        wd = (LinearLayout) findViewById(R.id.wd);
    }

    public void fag(Fragment fragment) {
        FragmentManager sfm = getSupportFragmentManager();
        FragmentTransaction replace = sfm.beginTransaction().replace(R.id.fl, fragment);
        replace.commit();
    }
    private void onClickListener() {
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_sy.setBackgroundResource(R.drawable.shouye);
                iv_fl.setBackgroundResource(R.drawable.fenleifu);
                iv_gw.setBackgroundResource(R.drawable.gouwuchefu);
                iv_wd.setBackgroundResource(R.drawable.wodefu);
                tv_sy.setTextColor(getResources().getColor(R.color.hong));
                tv_fl.setTextColor(getResources().getColor(R.color.hei));
                tv_gw.setTextColor(getResources().getColor(R.color.hei));
                tv_wd.setTextColor(getResources().getColor(R.color.hei));
                fag(new SyFragment());
            }
        });
        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_sy.setBackgroundResource(R.drawable.shouyefu);
                iv_fl.setBackgroundResource(R.drawable.fenlei);
                iv_gw.setBackgroundResource(R.drawable.gouwuchefu);
                iv_wd.setBackgroundResource(R.drawable.wodefu);
                tv_sy.setTextColor(getResources().getColor(R.color.hei));
                tv_fl.setTextColor(getResources().getColor(R.color.hong));
                tv_gw.setTextColor(getResources().getColor(R.color.hei));
                tv_wd.setTextColor(getResources().getColor(R.color.hei));
                fag(new FlFragment());
            }
        });
        gw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_sy.setBackgroundResource(R.drawable.shouyefu);
                iv_fl.setBackgroundResource(R.drawable.fenleifu);
                iv_gw.setBackgroundResource(R.drawable.gouwuche);
                iv_wd.setBackgroundResource(R.drawable.wodefu);
                tv_sy.setTextColor(getResources().getColor(R.color.hei));
                tv_fl.setTextColor(getResources().getColor(R.color.hei));
                tv_gw.setTextColor(getResources().getColor(R.color.hong));
                tv_wd.setTextColor(getResources().getColor(R.color.hei));
                fag(new GwFragment());
            }
        });

        wd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_sy.setBackgroundResource(R.drawable.shouyefu);
                iv_fl.setBackgroundResource(R.drawable.fenleifu);
                iv_gw.setBackgroundResource(R.drawable.gouwuchefu);
                iv_wd.setBackgroundResource(R.drawable.wode);
                tv_sy.setTextColor(getResources().getColor(R.color.hei));
                tv_fl.setTextColor(getResources().getColor(R.color.hei));
                tv_gw.setTextColor(getResources().getColor(R.color.hei));
                tv_wd.setTextColor(getResources().getColor(R.color.hong));
                fag(new WdFragment());
            }
        });
    }
}
