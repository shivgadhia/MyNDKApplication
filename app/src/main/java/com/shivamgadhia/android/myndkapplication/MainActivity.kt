package com.shivamgadhia.android.myndkapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.shivamgadhia.android.nativelibrary.NativeStringLoader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sampleTextView.text = NativeStringLoader().nativeString
    }
}
