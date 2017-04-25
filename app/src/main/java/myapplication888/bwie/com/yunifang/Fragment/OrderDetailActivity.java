package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.baway.chilijie.R;
import com.baway.chilijie.zhifubao.PayDemoActivity;
import com.bumptech.glide.Glide;

import java.util.List;

public class OrderDetailActivity extends AppCompatActivity {
        private ListView lv;
        private Button bt_pay;
        private CheckBox change1;
        private List<Shop> cartItemList;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_order_detail);
            //找控件
            lv= (ListView) findViewById(R.id.lv);
            bt_pay= (Button) findViewById(R.id.bt_pay);
            change1= (CheckBox) findViewById(R.id.change1);
            //接值
            Intent it=getIntent();
            cartItemList = (List<Shop>) it.getSerializableExtra("sh");
        /*details = (Details) it.getSerializableExtra("details");
        goods = details.data.goods;
        list.add(goods);*/

            lv.setAdapter(new MyAdapter());
            bt_pay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(OrderDetailActivity.this, PayDemoActivity.class);
                    //intent.putExtra(cartItemList);
                    startActivity(intent);
                }
            });

        }
        class MyAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return cartItemList.size();
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView=View.inflate(OrderDetailActivity.this,R.layout.pay_adapter_item,null);
                TextView tv_name= (TextView) convertView.findViewById(R.id.tv_name);
                TextView tv_price= (TextView) convertView.findViewById(R.id.tv_price);
                TextView tv_count= (TextView) convertView.findViewById(R.id.tv_count);
                ImageView image= (ImageView) convertView.findViewById(R.id.image);
                Glide.with(OrderDetailActivity.this).load(cartItemList.get(position).getPic()).into(image);
                tv_name.setText(cartItemList.get(position).getName());
                tv_price.setText(cartItemList.get(position).getPrice()+"");
                tv_count.setText(cartItemList.get(position).getCount()+"");
                return convertView;
            }
        }
    }

