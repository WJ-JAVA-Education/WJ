package com.example.ch10_e01activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btnReturn : Button
    lateinit var gothirdbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        gothirdbtn = findViewById<Button>(R.id.gothirdbtn)
        btnReturn = findViewById<Button>(R.id.btnReturn)

        btnReturn.setOnClickListener {
            finish()
        }
        gothirdbtn.setOnClickListener {
            intent = Intent(applicationContext,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}