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

public class jeju extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<MapInfo> arr = new ArrayList<>();

    ListView mainLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeju);

        mainLv= (ListView) findViewById(R.id.jejudo);
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
                    Intent ss = new Intent(jeju.this, explain_sungsan.class);
                    startActivity(ss);
                }else if(position==1){
                    Intent hu = new Intent(jeju.this, explain_hueree.class);
                    startActivity(hu);
                }else if(position==2) {
                    Intent eco = new Intent(jeju.this, explain_eco.class);
                    startActivity(eco);
                }else if(position==3) {
                    Intent udo = new Intent(jeju.this, explain_udo.class);
                    startActivity(udo);
                }
            }
        });

        init();
    }


    private void init(){
        arr.add(new MapInfo("제주 성산일출봉","제주도의 일출은 이곳으로",R.drawable.sungsan));
        arr.add(new MapInfo("휴애리 공원","꽃과 함꼐 노닐고 싶다면",R.drawable.hueree));
        arr.add(new MapInfo("에코랜드 테마파크","제주도에서 체험을 원한다면?",R.drawable.ecoland));
        arr.add(new MapInfo("제주 우도","섬 속의 섬",R.drawable.udo));
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

