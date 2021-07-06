package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_goyo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gyeonggi_goyo);

        Button gyfr = findViewById(R.id.gyfr);
        gyfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gyFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%95%84%EC%B9%A8%EA%B3%A0%EC%9A%94%EC%88%98%EB%AA%A9%EC%9B%90+%EB%A7%9B%EC%A7%91&oquery=%EA%B3%A0%EC%9A%94%EC%88%98%EB%AA%A9%EC%9B%90+%EB%A7%9B%EC%A7%91&tqi=UO6n2sprvTVssnXXakossssstLN-469051"));
                startActivity(gyFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%EC%95%84%EC%B9%A8%EA%B3%A0%EC%9A%94%EC%88%98%EB%AA%A9%EC%9B%90&temp="));
                startActivity(more);
            }
        });
    }
}
