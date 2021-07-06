package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_jjhk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonla_jjhk);

        Button jjfr = findViewById(R.id.jjfr);
        jjfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jjFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A0%84%EC%A3%BC+%ED%95%9C%EC%98%A5%EB%A7%88%EC%9D%84+%EB%A7%9B%EC%A7%91&oquery=%EC%88%9C%EC%B2%9C%EB%A7%8C+%EB%A7%9B%EC%A7%91&tqi=UOgKklp0Jy0ssEJhU5hsssssswR-042076"));
                startActivity(jjFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%A0%84%EC%A3%BC%20%ED%95%9C%EC%98%A5%EB%A7%88%EC%9D%84&temp="));
                startActivity(more);
            }
        });
    }
}
