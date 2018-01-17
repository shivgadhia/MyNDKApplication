package com.shivamgadhia.android.myndkapplication.messagebuilder

class MessageBuilder {
    fun buildMessage(factory: StringFactory): String {
        return factory.stringForDisplay
    }
}