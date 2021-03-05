package com.example.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv1 : TextView
        var tv2 : TextView
        var tv3 : TextView

        tv1 = findViewById<TextView>(R.id.textView1)
    }
}