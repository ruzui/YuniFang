package myapplication888.bwie.com.yunifang.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myapplication888.bwie.com.yunifang.R;

/**
 * Created by dell on 2017/4/12.
 */
public class WdFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.wdfragment, null);

        return  inflate;
    }
}
