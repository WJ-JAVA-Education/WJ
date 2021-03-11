package com.example.p_6_1

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Time
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import com.example.p_6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        val view = vb.root
        setContentView(view)

        title = "시간 예약"






    }
}