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

public class gyeongsang extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<MapInfo> arr = new ArrayList<>();

    ListView mainLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongsang);

        mainLv= (ListView) findViewById(R.id.gyeongsangdo);
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
                    Intent bst = new Intent(gyeongsang.this, explain_bstower.class);
                    startActivity(bst);
                }else if(position==1){
                    Intent homi = new Intent(gyeongsang.this, explain_homi.class);
                    startActivity(homi);
                }else if(position==2) {
                    Intent hw = new Intent(gyeongsang.this, explain_hw.class);
                    startActivity(hw);
                }else if(position==3) {
                    Intent  gj = new Intent(gyeongsang.this, explain_bsgj.class);
                    startActivity(gj);
                }else if(position==4) {
                    Intent dongbaek = new Intent(gyeongsang.this, explain_dongbaek.class);
                    startActivity(dongbaek);
                }
            }
        });

        init();
    }


    private void init(){
        arr.add(new MapInfo("부산 타워","부산의 랜드마크",R.drawable.bstower));
        arr.add(new MapInfo("구룡포 호미곶","가장 해가 빨리 뜨는 곳",R.drawable.homi));
        arr.add(new MapInfo("해운대 - 광안리","부산의 대표 해수욕장",R.drawable.haewoondae));
        arr.add(new MapInfo("경주 동궁과 월지","경주의 역사를 따라서...",R.drawable.gyeongju));
        arr.add(new MapInfo("부산 동백섬","부산 바다와 함께 즐기다.",R.drawable.dongbaek));
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

