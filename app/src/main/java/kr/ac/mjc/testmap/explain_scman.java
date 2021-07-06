package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_scman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonla_scman);

        Button scfr = findViewById(R.id.scfr);
        scfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%88%9C%EC%B2%9C%EB%A7%8C+%EB%A7%9B%EC%A7%91&oquery=%EB%8C%80%ED%95%9C%EB%AF%BC%EA%B5%AD+%EA%B5%AC%EC%84%9D%EA%B5%AC%EC%84%9D&tqi=UOg7odp0Jywssbu3fywssssssy8-088795"));
                startActivity(scFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%88%9C%EC%B2%9C%EB%A7%8C&temp="));
                startActivity(more);
            }
        });
    }
}
