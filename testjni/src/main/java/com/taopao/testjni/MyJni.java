package com.taopao.testjni;

/**
 * @Author：淘跑
 * @Date: 2018/11/15 21:09
 * @Use：
 */
public class MyJni {

    static {
        System.loadLibrary("hello");
    }
    public native String hello_FromC();

}
