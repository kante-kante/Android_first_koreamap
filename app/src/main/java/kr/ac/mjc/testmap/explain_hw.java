package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_hw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gs_haeun);

        Button hwfr = findViewById(R.id.hwfr);
        hwfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hwFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%95%B4%EC%9A%B4%EB%8C%80+%EA%B4%91%EC%95%88%EB%A6%AC+%EB%A7%9B%EC%A7%91&oquery=%EB%8F%99%EB%B0%B1%EC%84%AC+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&tqi=UOgdlwp0YihssaUPlnsssssstxh-440597"));
                startActivity(hwFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%ED%95%B4%EC%9A%B4%EB%8C%80%20%EA%B4%91%EC%95%88%EB%A6%AC&temp="));
                startActivity(more);
            }
        });
    }
}
