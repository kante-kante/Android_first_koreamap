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

public class chungcheong extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<MapInfo> arr = new ArrayList<>();

    ListView mainLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chungcheong);

        mainLv= (ListView) findViewById(R.id.chungcheongdo);
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
                    Intent gosu = new Intent(chungcheong.this, explain_gosu.class);
                    startActivity(gosu);
                }else if(position==1){
                    Intent by = new Intent(chungcheong.this, explain_buyeo.class);
                    startActivity(by);
                }else if(position==2) {
                    Intent gh = new Intent(chungcheong.this, explain_ghpark.class);
                    startActivity(gh);
                }
            }
        });

        init();
    }


    private void init(){
        arr.add(new MapInfo("단양 고수동굴","종유석의 신비함 속으로",R.drawable.gosu));
        arr.add(new MapInfo("부여 궁남지","부여의 발자취를 따라서",R.drawable.buyeo));
        arr.add(new MapInfo("보령 개화예술공원","꽃구경을 가고싶다면?",R.drawable.ghpark));
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

