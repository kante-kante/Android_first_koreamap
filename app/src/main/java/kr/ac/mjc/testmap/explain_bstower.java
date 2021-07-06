package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_bstower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gs_bstower);

        Button bsfr = findViewById(R.id.bsfr);
        bsfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%B6%80%EC%82%B0%ED%83%80%EC%9B%8C+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&oquery=%EB%B6%80%EC%82%B0+%EB%A7%9B%EC%A7%91&tqi=UOgnBsp0JywssbdSd%2BKssssstVZ-407925"));
                startActivity(bsFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EB%B6%80%EC%82%B0%ED%83%80%EC%9B%8C&temp="));
                startActivity(more);
            }
        });
    }
}
