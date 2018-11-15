package com.taopao.androidnginxrtmp;

/**
 * @Author：淘跑
 * @Date: 2018/11/15 14:52
 * @Use：
 */
public class TestJNI {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public String getS() {
        return stringFromJNI();
    }

}
