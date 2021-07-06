package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_insa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seoul_insa);

        Button isfr = findViewById(R.id.isfr);
        isfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9D%B8%EC%82%AC%EB%8F%99+%EB%A7%9B%EC%A7%91&oquery=%EB%B6%81%EC%B4%8C+%EB%A7%9B%EC%A7%91&tqi=UO6uQsp0YidssLaDPuCssssstBo-201939"));
                startActivity(isFr);
            }
        });
        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%9D%B8%EC%82%AC%EB%8F%99&temp="));
                startActivity(more);
            }
        });
    }
}
