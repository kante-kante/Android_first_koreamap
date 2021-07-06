package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_ys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeonla_ys);

        Button ysfr = findViewById(R.id.ysfr);
        ysfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ysFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%97%AC%EC%88%98+%EB%A7%9B%EC%A7%91&oquery=%EC%97%AC%EC%88%98+%EB%A7%9B%EC%A7%96%E3%85%82&tqi=UOghBsprvN8ssmKgvdhssssssMo-226792"));
                startActivity(ysFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%97%AC%EC%88%98&temp="));
                startActivity(more);
            }
        });
    }
}
