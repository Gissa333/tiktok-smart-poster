package com.example.tiktokposter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "مرحباً! تطبيق تيك توك الذكي يعمل بنجاح 🎉"
            textSize = 24f
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            setPadding(32, 400, 32, 32)
        }
        setContentView(textView)
    }
}