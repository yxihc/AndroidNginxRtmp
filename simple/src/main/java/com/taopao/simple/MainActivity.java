package com.taopao.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.taopao.androidnginxrtmp.service.NginxUtils;

public class MainActivity extends AppCompatActivity {
//    Nginx mNginx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mNginx = Nginx.create();
        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mNginx.start();
//                Intent intent = new Intent(MainActivity.this, NginxService.class);
//                intent.setAction(NginxService.ACTION_START_NGINX);
//                startService(intent);
                NginxUtils.startNginx(MainActivity.this);
            }
        });


    }
}
