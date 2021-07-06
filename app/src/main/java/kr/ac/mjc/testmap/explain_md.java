package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_md extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seoul_md);

        Button mdfr = findViewById(R.id.mdfr);
        mdfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mdFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%AA%85%EB%8F%99+%EB%A7%9B%EC%A7%91&oquery=%EC%A2%85%EB%A1%9C%EA%B5%AC+%EB%A7%9B%EC%A7%91&tqi=UO6u2lp0Jy0ssaFPOp4ssssstdV-128443"));
                startActivity(mdFr);
            }
        });
        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EB%AA%85%EB%8F%99&temp="));
                startActivity(more);
            }
        });
    }
}
