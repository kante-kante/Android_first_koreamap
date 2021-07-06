package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_haenam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonla_haenam);

        Button hnfr = findViewById(R.id.hnfr);
        hnfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hnFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%95%B4%EB%82%A8+%EB%95%85%EB%81%9D%EB%A7%88%EC%9D%84+%EB%A7%9B%EC%A7%91&oquery=%EC%9A%B0%EB%8F%84+%EB%A7%9B%EC%A7%91&tqi=UOgTklprvTVss42pL5Zssssstsd-246066"));
                startActivity(hnFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%ED%95%B4%EB%82%A8&temp="));
                startActivity(more);
            }
        });
    }
}
