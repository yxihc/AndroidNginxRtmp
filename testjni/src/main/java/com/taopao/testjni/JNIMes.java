package com.taopao.testjni;

public class JNIMes {

    static {
        System.loadLibrary("MyJni");
    }

    public native String getStr();

    public native int getInt();
}
