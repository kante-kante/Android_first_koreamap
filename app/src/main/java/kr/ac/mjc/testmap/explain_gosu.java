package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_gosu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chungcheong_gosu);

        Button gsfr = findViewById(R.id.gsfr);
        gsfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gsFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%8B%A8%EC%96%91+%EB%A7%9B%EC%A7%91&oquery=%EB%AA%85%EB%8F%99+%EB%A7%9B%EC%A7%91&tqi=UO6vssp0JXossDATTzVssssssNK-242073"));
                startActivity(gsFr);
            }
        });
        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EB%8B%A8%EC%96%91&temp="));
                startActivity(more);
            }
        });
    }
}
