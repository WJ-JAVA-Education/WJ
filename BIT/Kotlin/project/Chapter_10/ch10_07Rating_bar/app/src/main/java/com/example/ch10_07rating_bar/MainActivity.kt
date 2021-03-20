package com.example.ch10_07rating_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {
    lateinit var rating1 : RatingBar
    lateinit var rating2 : RatingBar
    lateinit var rating3 : RatingBar
    lateinit var btnInc : Button
    lateinit var btnDec : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rating1 = findViewById<RatingBar>(R.id.ratingBar1)
        rating2 = findViewById<RatingBar>(R.id.ratingBar2)
        rating3 = findViewById<RatingBar>(R.id.ratingBar3)
        btnInc = findViewById<Button>(R.id.btnInc)
        btnDec = findViewById<Button>(R.id.btnDec)

        btnInc.setOnClickListener {
            rating1.rating = rating1.rating + rating1.stepSize
            rating2.rating = rating2.rating + rating2.stepSize
            rating3.rating = rating3.rating + rating3.stepSize
        }

        btnDec.setOnClickListener {
            rating1.rating = rating1.rating - rating1.stepSize
            rating2.rating = rating2.rating - rating2.stepSize
            rating3.rating = rating3.rating - rating3.stepSize
        }

    }
}