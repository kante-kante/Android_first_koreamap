package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_suwon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gyeonggi_suwon);

        Button swfr = findViewById(R.id.swfr);
        swfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent swFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%88%98%EC%9B%90+%ED%99%94%EC%84%B1+%EB%A7%9B%EC%A7%91&oquery=%ED%97%A4%EC%9D%B4%EB%A6%AC%EB%A7%88%EC%9D%84+%EB%A7%9B%EC%A7%91&tqi=UO6dVlprvTossB%2FLjQlssssstiC-409656"));
                startActivity(swFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%88%98%EC%9B%90%20%ED%99%94%EC%84%B1&temp="));
                startActivity(more);
            }
        });
    }
}
