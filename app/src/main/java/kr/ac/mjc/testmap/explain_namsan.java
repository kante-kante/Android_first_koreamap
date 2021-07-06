package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class explain_namsan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seoul_namsan);

        Button nsfr = findViewById(R.id.nsfr);
        nsfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nsFr = new Intent(Intent.ACTION_VIEW,Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%82%A8%EC%82%B0+%EB%A7%9B%EC%A7%91&oquery=%EC%A2%85%EB%A1%9C%EA%B5%AC+%EB%A7%9B%EC%A7%91&tqi=UO5%2B1wprvTossCKt3aRssssstuV-276238"));
                startActivity(nsFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%84%9C%EC%9A%B8&temp="));
                startActivity(more);
            }
        });
        Button testmap = findViewById(R.id.map1);
        testmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testMap = new Intent(explain_namsan.this,mapViewtest1.class);
                Toast.makeText(getApplicationContext(),"데이터나 와이파이에 연결되어야 지도가 표시됩니다",Toast.LENGTH_LONG).show();
                startActivity(testMap);
            }
        });


    }
}
