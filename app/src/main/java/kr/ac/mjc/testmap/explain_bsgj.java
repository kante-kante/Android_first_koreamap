package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_bsgj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gs_wolji);

        Button gjfr = findViewById(R.id.gjfr);
        gjfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gjFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EA%B2%BD%EC%A3%BC+%EC%95%88%EC%95%95%EC%A7%80+%EB%A7%9B%EC%A7%91&oquery=%EA%B2%BD%EC%A3%BC+%EB%8F%99%EA%B6%81%EA%B3%BC+%EC%9B%94%EC%A7%80+%EB%A7%9B%EC%A7%91&tqi=UOgi2dprvh8ssvJVMQNssssstvd-228929"));
                startActivity(gjFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EA%B2%BD%EC%A3%BC&temp="));
                startActivity(more);
            }
        });
    }
}
