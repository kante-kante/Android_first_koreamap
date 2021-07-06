package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_homi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gs_homi);

        Button hmfr = findViewById(R.id.hmfr);
        hmfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hmFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%98%B8%EB%AF%B8%EA%B3%B6+%EB%A7%9B%EC%A7%91&oquery=%EC%97%AC%EC%88%98+%EB%A7%9B%EC%A7%91&tqi=UOghBlprvN8ssmL%2F78hssssst68-059101"));
                startActivity(hmFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%ED%98%B8%EB%AF%B8%EA%B3%B6&temp="));
                startActivity(more);
            }
        });
    }
}
