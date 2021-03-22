package com.example.ch10_activity_calculation

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        title = "Second 액티비티"

        var inIntent = intent

        var num1 = intent.getIntExtra("Num1", 0)
        var num2 = intent.getIntExtra("Num2", 0)
        var strOp = intent.getStringExtra("Operator")

        var result = 0 //결과값
        when(strOp)
        {
            "+" -> result = num1 + num2
            "-" -> result = num1 - num2
            "*" -> result = num1 * num2
            "/" -> result = num1 / num2
        }



        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            var outIntent = Intent(applicationContext, MainActivity::class.java)
            outIntent.putExtra("Hap", result)
            setResult(Activity.RESULT_OK, outIntent)
            finish()
        }
    }
}