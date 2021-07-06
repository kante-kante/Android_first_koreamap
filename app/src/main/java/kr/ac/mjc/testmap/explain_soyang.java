package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_soyang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kangwon_soyang);

        Button syfr = findViewById(R.id.syfr);
        syfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%B6%98%EC%B2%9C+%EB%A7%9B%EC%A7%91&oquery=%EC%A0%95%EB%8F%99%EC%A7%84+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&tqi=UO6cBsp0JXVssfImaFwsssssssl-324585"));
                startActivity(syFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%86%8C%EC%96%91%EA%B0%95&temp="));
                startActivity(more);
            }
        });
    }
}
