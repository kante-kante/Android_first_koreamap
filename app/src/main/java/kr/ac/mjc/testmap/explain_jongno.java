package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_jongno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seoul_jongno);

        Button jnfr = findViewById(R.id.jnfr);
        jnfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jnFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A2%85%EB%A1%9C%EA%B5%AC+%EB%A7%9B%EC%A7%91&oquery=%EC%9D%B8%EC%82%AC%EB%8F%99+%EB%A7%9B%EC%A7%91&tqi=UO6uxsp0YihssKvO5dVsssssttK-013181"));
                startActivity(jnFr);
            }
        });
        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%84%9C%EC%9A%B8%20%EC%A2%85%EB%A1%9C&temp="));
                startActivity(more);
            }
        });
    }
}
