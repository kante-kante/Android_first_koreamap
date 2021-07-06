package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class explain_minsok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gyeonggi_minsok);

        Button msfr = findViewById(R.id.msfr);
        msfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msFr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%95%9C%EA%B5%AD%EB%AF%BC%EC%86%8D%EC%B4%8C+%EB%A7%9B%EC%A7%91&oquery=%EB%AF%BC%EC%86%8D%EC%B4%8C+%EA%B7%BC%EC%B2%98+%EB%A7%9B%EC%A7%91&tqi=UO6M1lprvmZssDXbF%2Bhssssss98-087732"));
                startActivity(msFr);
            }
        });

        Button more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(Intent.ACTION_VIEW,Uri.parse("https://korean.visitkorea.or.kr/search/search_list.do?keyword=%ED%95%9C%EA%B5%AD%EB%AF%BC%EC%86%8D%EC%B4%8C&temp="));
                startActivity(more);
            }
        });
    }
}
