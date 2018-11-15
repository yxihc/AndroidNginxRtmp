package com.taopao.androidnginxrtmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.taopao.androidnginxrtmp.nginx.Nginx;

public class MainActivity extends AppCompatActivity {
    // Used to load the 'native-lib' library on application startup.
//    static {
//        System.loadLibrary("native-lib");
//    }

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
//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mNginx.start();
//            }
//        });

        TestJNI testJNI = new TestJNI();

        tv.setText(testJNI.stringFromJNI());
    }

//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    public native String stringFromJNI();
}
