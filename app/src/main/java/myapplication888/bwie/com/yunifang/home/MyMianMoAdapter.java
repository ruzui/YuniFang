package myapplication888.bwie.com.yunifang.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;

/**
 * 类的用途：
 *
 */

public class MyMianMoAdapter extends FragmentPagerAdapter {

    private FragmentManager fm;
    private ArrayList<MianMoFrogment> fragmentNum;

    public MyMianMoAdapter(FragmentManager fm, ArrayList<MianMoFrogment> fragmentNum) {
        super(fm);
        this.fm = fm;
        this.fragmentNum = fragmentNum;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentNum.get(position);
    }

    @Override
    public int getCount() {
        return fragmentNum.size();
    }
}
