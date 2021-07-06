package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_nami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kangwon_nami);

        Button nmfr = findViewById(R.id.nmfr);
        nmfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nmFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%82%A8%EC%9D%B4%EC%84%AC+%EB%A7%9B%EC%A7%91&oquery=%EB%B6%80%EC%97%AC+%EB%A7%9B%EC%A7%91&tqi=UO6vDdp0J1Zsshswk58ssssssId-365952"));
                startActivity(nmFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%B6%98%EC%B2%9C&temp="));
                startActivity(more);
            }
        });
    }
}
