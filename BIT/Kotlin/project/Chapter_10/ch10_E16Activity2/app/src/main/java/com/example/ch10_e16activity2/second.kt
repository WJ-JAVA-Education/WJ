package com.example.ch10_e16activity2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        title = "Second 액티비티"

        var inIntent = intent
        var hapValue = inIntent.getIntExtra("Num1",0) + inIntent.getIntExtra("Num2",0)
        var btnReturn = findViewById<Button>(R.id.btnReturn)

        btnReturn.setOnClickListener {
            var outIntent = Intent (applicationContext,MainActivity::class.java)
            outIntent.putExtra("Hap",hapValue)
            setResult(Activity.RESULT_OK,outIntent)
            finish()
        }
    }
}