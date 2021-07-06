package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_bc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seoul_bc);

        Button bcfr = findViewById(R.id.bcfr);
        bcfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bcFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%B6%81%EC%B4%8C+%EB%A7%9B%EC%A7%91&oquery=%EB%82%A8%EC%82%B0+%EB%A7%9B%EC%A7%91&tqi=UO6uslp0Jywss572TYNssssstqo-265352"));
                startActivity(bcFr);
            }
        });
        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EB%B6%81%EC%B4%8C&temp="));
                startActivity(more);
            }
        });
    }
}
