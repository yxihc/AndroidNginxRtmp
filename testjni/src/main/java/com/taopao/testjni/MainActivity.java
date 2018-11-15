package com.taopao.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyJni myJni = new MyJni();
        String s = myJni.hello_FromC();
        Toast.makeText(MainActivity.this, ""+s, Toast.LENGTH_SHORT).show();

    }
}
