package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_buyeo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chungcheong_buyeo);

        Button byfr = findViewById(R.id.byfr);
        byfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent byFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%B6%80%EC%97%AC+%EB%A7%9B%EC%A7%91&oquery=%EB%B3%B4%EB%A0%B9+%EB%A7%9B%EC%A7%91&tqi=UO6vNsp0JXVssgddTmNssssst2l-436456"));
                startActivity(byFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EB%B6%80%EC%97%AC&temp="));
                startActivity(more);
            }
        });

    }
}
