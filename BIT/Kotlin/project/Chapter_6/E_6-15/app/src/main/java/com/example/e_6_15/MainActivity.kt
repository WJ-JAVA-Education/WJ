package com.example.e_6_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterViewFlipper
import android.widget.Button
import android.widget.ViewFlipper
import com.example.e_6_15.databinding.ActivityMainBinding

lateinit var vb: ActivityMainBinding
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
            viewFlipper1.showPrevious()
        }

        btnNext.setOnClickListener {
            viewFlipper1.showNext()
        }

    }
}