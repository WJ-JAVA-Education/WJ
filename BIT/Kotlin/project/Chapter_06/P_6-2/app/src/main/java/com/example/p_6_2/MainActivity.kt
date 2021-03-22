package com.example.p_6_2

import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper
import androidx.appcompat.app.AppCompatActivity

lateinit var btnPrev : Button
lateinit var btnNext : Button
lateinit var viewFlipper1: ViewFlipper
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPrev = findViewById<Button>(R.id.btnPrev)
        btnNext = findViewById<Button>(R.id.btnNext)
        viewFlipper1 = findViewById<ViewFlipper>(R.id.viewFlipper1)

        btnPrev.setOnClickListener {
            viewFlipper1.startFlipping()
            viewFlipper1.flipInterval.times(1000)
        }

        btnNext.setOnClickListener {
            viewFlipper1.stopFlipping()
        }

    }
}