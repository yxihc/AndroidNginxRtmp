//
// Created by ShenKun on 2018/11/15.
//

#include "jni.h"
#include "MyJni.h"

JNIEXPORT jstring JNICALL Java_com_taopao_testjni_JNIMes_getStr
        (JNIEnv *env, jobject) {
    return (*env)->NewStringUTF(env, "this is the first time for me to use jni");

}