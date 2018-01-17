#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_shivamgadhia_android_nativelibrary_NativeStringLoader_getNativeString(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from JNI!";
    return env->NewStringUTF(hello.c_str());
}
