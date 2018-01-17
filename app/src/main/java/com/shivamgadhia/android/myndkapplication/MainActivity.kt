package com.shivamgadhia.android.myndkapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.shivamgadhia.android.myndkapplication.messagebuilder.MessageBuilder
import com.shivamgadhia.android.myndkapplication.messagebuilder.NativeStringFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageBuilder = MessageBuilder()

        sample_text.text = messageBuilder.buildMessage(NativeStringFactory())
    }
}
