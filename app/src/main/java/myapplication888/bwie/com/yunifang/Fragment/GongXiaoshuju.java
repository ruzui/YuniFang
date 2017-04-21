package myapplication888.bwie.com.yunifang.Fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import myapplication888.bwie.com.yunifang.R;
import myapplication888.bwie.com.yunifang.tablayout.bushuibaoshi;
import myapplication888.bwie.com.yunifang.tablayout.jinzikanghou;
import myapplication888.bwie.com.yunifang.tablayout.kongyouqudou;
import myapplication888.bwie.com.yunifang.tablayout.meibaitiliang;
import myapplication888.bwie.com.yunifang.tablayout.shuhuanxiufu;

public class GongXiaoshuju extends AppCompatActivity {
    private String[] titleArr = new String[]{"补水保湿", "舒缓修护", "控油祛痘", "美白提亮", "紧致抗皱"};
    private List<Fragment> fragmentlist = new ArrayList<>();
    private TabLayout tab;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gong_xiaoshuju);
        find();
        intinite();
    }

    private void intinite() {
        fragmentlist.add(new bushuibaoshi());
        fragmentlist.add(new shuhuanxiufu());
        fragmentlist.add(new kongyouqudou());
        fragmentlist.add(new meibaitiliang());
        fragmentlist.add(new jinzikanghou());
        vp.setAdapter(new gongxiaoadapter(getSupportFragmentManager(),GongXiaoshuju.this,fragmentlist,titleArr));
        tab.setupWithViewPager(vp);
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    private void find() {
        tab = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp);
    }
}
