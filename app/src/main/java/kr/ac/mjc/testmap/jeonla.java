package kr.ac.mjc.testmap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class jeonla extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<MapInfo> arr = new ArrayList<>();

    ListView mainLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeonla);

        mainLv= (ListView) findViewById(R.id.jeonlado);
        adapter = new MyAdapter(this);
        mainLv.setAdapter(adapter);
        /*mainLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = (String)parent.getAdapter().getItem(position);
                Toast.makeText(getApplicationContext(),"토스트!",Toast.LENGTH_SHORT).show();
            }
        });*/
        mainLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent sm = new Intent(jeonla.this, explain_scman.class);
                    startActivity(sm);
                }else if(position==1){
                    Intent haenam = new Intent(jeonla.this, explain_haenam.class);
                    startActivity(haenam);
                }else if(position==2) {
                    Intent jjhk = new Intent(jeonla.this, explain_jjhk.class);
                    startActivity(jjhk);
                }else if(position==3) {
                    Intent ys = new Intent(jeonla.this, explain_ys.class);
                    startActivity(ys);
                }
            }
        });

        init();
    }


    private void init(){
        arr.add(new MapInfo("순천만","자연을 보존하는 곳",R.drawable.scman));
        arr.add(new MapInfo("해남 땅끝마을","대한민국의 땅 끝",R.drawable.haenam));
        arr.add(new MapInfo("전주 한옥마을","전주의 고즈넉함을 느끼다",R.drawable.jjhk));
        arr.add(new MapInfo("여수 돌산공원","여수의 경치를 맛보다",R.drawable.yeosu));
        adapter.notifyDataSetChanged();
    }

    public class RowDataViewHolder {
        public TextView nameHolder;
        public TextView exHolder;
        public ImageView imgHoler;
    }

    class MyAdapter extends ArrayAdapter {
        LayoutInflater lnf;

        public MyAdapter(Activity context) {
            super(context, R.layout.item, arr);
            lnf = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return arr.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return arr.get(position);
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            RowDataViewHolder viewHolder;

            if (convertView == null) {
                convertView = lnf.inflate(R.layout.item, parent, false);
                viewHolder = new RowDataViewHolder();
                viewHolder.nameHolder = (TextView) convertView.findViewById(R.id.name);
                viewHolder.exHolder = (TextView) convertView.findViewById(R.id.ex);
                viewHolder.imgHoler = (ImageView) convertView.findViewById(R.id.img);

                convertView.setTag(viewHolder);
            } else {
                viewHolder = (RowDataViewHolder) convertView.getTag();
            }

            viewHolder.nameHolder.setText(arr.get(position).name);
            viewHolder.exHolder.setText(arr.get(position).ex);
            viewHolder.imgHoler.setImageResource(arr.get(position).imgId);

            return convertView;
        }
    }
}

