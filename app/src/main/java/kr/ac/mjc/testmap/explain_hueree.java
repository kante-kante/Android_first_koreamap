package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_hueree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeju_hueree);

        Button hufr = findViewById(R.id.hufr);
        hufr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent huFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A0%9C%EC%A3%BC+%EB%A7%9B%EC%A7%91&oquery=%EC%A0%9C%EC%A3%BC+%EB%A7%88%EB%A6%AC%EC%A2%8B%EC%95%84&tqi=UOgjEwprvh8ssvyWvChssssst%2FV-306008"));
                startActivity(huFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%A0%9C%EC%A3%BC&temp="));
                startActivity(more);
            }
        });
    }
}
