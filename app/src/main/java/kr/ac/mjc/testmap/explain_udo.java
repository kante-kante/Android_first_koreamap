package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_udo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeju_udo);

        Button udofr = findViewById(R.id.udofr);
        udofr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent udoFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9A%B0%EB%8F%84+%EB%A7%9B%EC%A7%91&oquery=%EC%84%B1%EC%82%B0%EC%9D%BC%EC%B6%9C%EB%B4%89+%EB%A7%9B%EC%A7%91&tqi=UOgRKwp0J1ZssRVa4MRssssssno-322392"));
                startActivity(udoFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%9A%B0%EB%8F%84&temp="));
                startActivity(more);
            }
        });
    }
}
