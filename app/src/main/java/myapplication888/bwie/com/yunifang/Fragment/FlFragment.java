package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import myapplication888.bwie.com.yunifang.R;
import myapplication888.bwie.com.yunifang.dateActivity.mianno;

/**
 * Created by dell on 2017/4/12.
 */
public class FlFragment extends Fragment {
    private ImageView mian;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.flfragment, null);
        mian = (ImageView) inflate.findViewById(R.id.mianmo);
        onClickListener();
        return  inflate;
    }

    private void onClickListener() {
        mian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getActivity(),mianno.class));
            }
        });
    }
}
