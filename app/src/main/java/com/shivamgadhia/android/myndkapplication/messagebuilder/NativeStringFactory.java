package com.shivamgadhia.android.myndkapplication.messagebuilder;

import com.shivamgadhia.android.nativelibrary.NativeStringLoader;

public class NativeStringFactory implements StringFactory {
    @Override
    public String getStringForDisplay() {
        return new NativeStringLoader().getNativeString();
    }
}
