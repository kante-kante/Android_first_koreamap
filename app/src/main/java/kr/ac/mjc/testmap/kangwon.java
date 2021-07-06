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

public class kangwon extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<MapInfo> arr = new ArrayList<>();

    ListView mainLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kangwon);

        mainLv= (ListView) findViewById(R.id.kangwondo);
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
                    Intent nami = new Intent(kangwon.this, explain_nami.class);
                    startActivity(nami);
                }else if(position==1){
                    Intent chiak = new Intent(kangwon.this, explain_chiak.class);
                    startActivity(chiak);
                }else if(position==2) {
                    Intent jdj = new Intent(kangwon.this, explain_jdj.class);
                    startActivity(jdj);
                }else if(position==3) {
                    Intent abai = new Intent(kangwon.this, explain_abai.class);
                    startActivity(abai);
                }else if(position==4) {
                    Intent sky = new Intent(kangwon.this, explain_soyang.class);
                    startActivity(sky);
                }
            }
        });

        init();
    }


    private void init(){
        arr.add(new MapInfo("남이섬","드라마 로망을 품고 오는 곳",R.drawable.nami));
        arr.add(new MapInfo("치악산","가을 경치가 예쁜 산",R.drawable.mountain));
        arr.add(new MapInfo("정동진","일출 보기 좋은 곳",R.drawable.jdj));
        arr.add(new MapInfo("속초 아바이마을","순대의 본고장",R.drawable.abai));
        arr.add(new MapInfo("소양강 스카이워크","춘천의 랜드마크",R.drawable.soyang));
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

