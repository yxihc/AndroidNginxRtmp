#include <stdlib.h>
#include <stdio.h>
#include <jni.h>

jstring Java_com_taopao_testjni_MyJni_hello_1FromC(JNIEnv *env, jobject thiz) {
    char *cstr = "hello from c!";
    return (*env)->NewStringUTF(env, cstr);
}
