package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_abai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kangwon_abai);
        Button abaifr = findViewById(R.id.abaifr);
        abaifr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abaiFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%95%84%EB%B0%94%EC%9D%B4%EB%A7%88%EC%9D%84+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&oquery=%EC%B9%98%EC%95%85%EC%82%B0+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&tqi=UO6adwp0J1sss4RVIWKssssssE0-097433"));
                startActivity(abaiFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%95%84%EB%B0%94%EC%9D%B4%EB%A7%88%EC%9D%84&temp="));
                startActivity(more);
            }
        });
    }
}
