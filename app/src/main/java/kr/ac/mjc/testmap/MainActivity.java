package kr.ac.mjc.testmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.kakao.util.maps.helper.Utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.kakao.util.maps.helper.Utility.getPackageInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*try {
            PackageInfo info = getPackageManager().getPackageInfo("kr.ac.mjc.testmap", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }*/

        Button seoul = findViewById(R.id.seoul);
        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seouIntent = new Intent(MainActivity.this,seoul.class);
                startActivity(seouIntent);
            }
        });

        Button gyeongin = findViewById(R.id.gyeongin);
        gyeongin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent gyeonginIntent = new Intent(MainActivity.this,gyeongin.class);
                startActivity(gyeonginIntent);
            }
        });

       Button chungcheong = (Button)findViewById(R.id.chungcheong);
        chungcheong.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent ccIntent = new Intent(MainActivity.this,chungcheong.class);
                startActivity(ccIntent);
            }
        });
        Button gyeongsang = (Button)findViewById(R.id.gyeongsang);
        gyeongsang.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent gsIntent = new Intent(MainActivity.this,gyeongsang.class);
                startActivity(gsIntent);
            }
        });
        Button jeonla =(Button) findViewById(R.id.jeonla);
        jeonla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeonlaIntent = new Intent(MainActivity.this,jeonla.class);
                startActivity(jeonlaIntent);
            }
        });
        Button kangwon = (Button)findViewById(R.id.kangwon);
        kangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kangwonIntent = new Intent(MainActivity.this, kangwon.class);
                startActivity(kangwonIntent);
            }
        });
        Button jeju = (Button)findViewById(R.id.jeju);
        jeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jejuIntent = new Intent(MainActivity.this,jeju.class);
                startActivity(jejuIntent);
            }
        });



    }
}
