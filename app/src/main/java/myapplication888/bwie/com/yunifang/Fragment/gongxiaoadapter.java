package myapplication888.bwie.com.yunifang.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.List;

/**
 * Created by dell on 2017/4/21.
 */
public class gongxiaoadapter extends FragmentPagerAdapter{
    private final FragmentManager supportFragmentManager;
    private final GongXiaoshuju gongxiao;
    private final List<Fragment> fragmentList;
    private final String[] titleArr;


    public gongxiaoadapter(FragmentManager supportFragmentManager, GongXiaoshuju gongXiaoshuju, List<Fragment> fragmentlist, String[] titleArr) {
        super(supportFragmentManager);
        this.supportFragmentManager = supportFragmentManager;
        this.gongxiao = gongXiaoshuju;
        this.fragmentList = fragmentlist;
        this.titleArr = titleArr;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleArr[position];

    }
}
