package com.example.ch10_e01activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class ThirdActivity : AppCompatActivity() {
    lateinit var SecAct : RadioButton
    lateinit var ThirAct : RadioButton
    lateinit var newBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        SecAct = findViewById<RadioButton>(R.id.SecAct)
        ThirAct = findViewById<RadioButton>(R.id.ThirAct)
        newBtn = findViewById<Button>(R.id.newBtn)

        SecAct.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity::class.java)

        }
        ThirAct.setOnClickListener {
            var intent = Intent(applicationContext,ThirdActivity::class.java)
        }
        newBtn.setOnClickListener {
            startActivity(intent)
        }
    }
}