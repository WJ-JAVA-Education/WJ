package com.example.ch10_e01activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    lateinit var btnNewActivity : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNewActivity = findViewById<Button>(R.id.btnNewActivity)


        btnNewActivity.setOnClickListener {
            var intent = Intent(applicationContext , SecondActivity::class.java)
            startActivity(intent)
        }
    }
}