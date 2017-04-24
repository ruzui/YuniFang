package myapplication888.bwie.com.yunifang.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;



import java.util.ArrayList;

import myapplication888.bwie.com.yunifang.Fragment.Flfagment_mingxing;
import myapplication888.bwie.com.yunifang.R;

/**
 * 类的用途：
 *
 */

public class MianMoFrogment extends Fragment {

    private ArrayList<GoodBrief> data;

    public static MianMoFrogment newInstance(ArrayList<GoodBrief> goodBriefs) {
        Bundle args = new Bundle();
        args.putSerializable("key", goodBriefs);
        MianMoFrogment fragment = new MianMoFrogment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        data = (ArrayList<GoodBrief>) bundle.getSerializable("key");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.mianmo_sange, null);
        return view;

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyGridView gridview = (MyGridView) getView().findViewById(R.id.miaomo_san_gridview);
        gridview.setHorizontalSpacing(10);
        gridview.setVerticalSpacing(10);
        MianMoItemAdapter adapter = new MianMoItemAdapter(getActivity(), data);
        gridview.setAdapter(adapter);
//        gridView的点击事件
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ent = new Intent(getActivity(),Flfagment_mingxing.class);
                String id = data.get(i).getId();
//                    getData().getDefaultGoodsList().get(n).getId();
                String url = UrlUtils.GOODS_URL + id;
                ent.putExtra("url", url);
                startActivity(ent);
                getActivity().overridePendingTransition(R.anim.huanying_enter1, R.anim.huanying_exit1);
            }
        });
    }

}
