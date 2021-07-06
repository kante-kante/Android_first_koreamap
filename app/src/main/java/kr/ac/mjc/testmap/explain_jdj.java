package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_jdj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kangwon_jdj);

        Button jdjfr = findViewById(R.id.jdjfr);
        jdjfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jdjFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A0%95%EB%8F%99%EC%A7%84+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&oquery=%EC%95%84%EB%B0%94%EC%9D%B4%EB%A7%88%EC%9D%84+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&tqi=UO6bXsprvxsssnsB4s8ssssstB8-063843"));
                startActivity(jdjFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%A0%95%EB%8F%99%EC%A7%84&temp="));
                startActivity(more);
            }
        });
    }
}
