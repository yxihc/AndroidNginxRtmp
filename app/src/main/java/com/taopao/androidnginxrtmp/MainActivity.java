package com.taopao.androidnginxrtmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.screenshare.rtmp.nginx.Nginx;

public class MainActivity extends AppCompatActivity {
    /**
     * Nginx instance.
     */
    private Nginx mNginx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
//        tv.setText(stringFromJNI());

        tv.setText("sadsdsada");
        mNginx = Nginx.create();
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNginx.start();
            }
        });

    }

}
