package com.shivamgadhia.android.nativelibrary;

public class NativeStringLoader {

    public native String getNativeString();

    static {
        System.loadLibrary("native-lib");
    }
}
