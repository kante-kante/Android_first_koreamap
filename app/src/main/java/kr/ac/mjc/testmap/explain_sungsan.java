package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_sungsan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeju_sungsan);

        Button ssfr = findViewById(R.id.ssfr);
        ssfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ssFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%84%B1%EC%82%B0%EC%9D%BC%EC%B6%9C%EB%B4%89+%EB%A7%9B%EC%A7%91&oquery=%ED%95%B4%EC%9A%B4%EB%8C%80+%EA%B4%91%EC%95%88%EB%A6%AC+%EB%A7%9B%EC%A7%91&tqi=UOgeilp0JXossA2kmnZssssstCZ-361877"));
                startActivity(ssFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%84%B1%EC%82%B0%EC%9D%BC%EC%B6%9C%EB%B4%89&temp="));
                startActivity(more);
            }
        });
    }
}
