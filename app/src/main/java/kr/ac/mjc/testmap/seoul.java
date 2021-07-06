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

public class seoul extends AppCompatActivity {

    MyAdapter adapter;
    ArrayList<MapInfo> arr = new ArrayList<>();

    ListView mainLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seoul);

        mainLv= (ListView) findViewById(R.id.main_view);
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
                    Intent ns = new Intent(seoul.this, explain_namsan.class);
                    startActivity(ns);
                }else if(position==1){
                    Intent jongno = new Intent(seoul.this, explain_jongno.class);
                    startActivity(jongno);
                }else if(position==2) {
                    Intent bc = new Intent(seoul.this, explain_bc.class);
                    startActivity(bc);
                }else if(position==3) {
                    Intent insa = new Intent(seoul.this, explain_insa.class);
                    startActivity(insa);
                }else if(position==4) {
                    Intent md = new Intent(seoul.this, explain_md.class);
                    startActivity(md);
                }
            }
        });

        init();
    }


    private void init(){
        arr.add(new MapInfo("남산 타워","서울의 랜드마크",R.drawable.nstower1));
        arr.add(new MapInfo("종로 광장시장","종로의 대표 재래시장",R.drawable.kjmarket));
        arr.add(new MapInfo("북촌 한옥마을","서울의 고즈넉함",R.drawable.hk));
        arr.add(new MapInfo("인사동","전통과 역사의 동네",R.drawable.insa));
        arr.add(new MapInfo("중구 명동","서울 번화가 1번지",R.drawable.md));
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

