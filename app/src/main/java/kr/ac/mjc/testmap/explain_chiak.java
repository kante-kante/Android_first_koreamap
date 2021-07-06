package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_chiak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kangwon_chiak);

        Button mofr = findViewById(R.id.mofr);
        mofr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%B9%98%EC%95%85%EC%82%B0+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&oquery=%EB%82%A8%EC%9D%B4%EC%84%AC+%EB%A7%9B%EC%A7%91&tqi=UO6Z8sp0Jywss5Dnmr8ssssst2G-023642"));
                startActivity(moFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%B9%98%EC%95%85%EC%82%B0&temp="));
                startActivity(more);
            }
        });
    }
}
