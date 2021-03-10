package com.example.example4_4

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.app.ActivityCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var stoggle : Switch
    lateinit var rGroup1: RadioGroup
    lateinit var oreo : RadioButton
    lateinit var pi : RadioButton
    lateinit var Q : RadioButton
    lateinit var imgBox : ImageView
    lateinit var sBtn : Button
    lateinit var eBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1 = findViewById<TextView>(R.id.text1)
        text2 = findViewById<TextView>(R.id.text2)
        stoggle = findViewById<Switch>(R.id.stoggle)
        rGroup1 = findViewById<RadioGroup>(R.id.rGroup1)
        oreo = findViewById<RadioButton>(R.id.oreo)
        pi = findViewById<RadioButton>(R.id.pi)
        Q = findViewById<RadioButton>(R.id.Q)
        imgBox = findViewById(R.id.imgBox)
        sBtn = findViewById(R.id.sBtn)
        eBtn = findViewById(R.id.eBtn)

        stoggle.setOnClickListener {
            if (stoggle.isChecked == true){
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                oreo.visibility = android.view.View.VISIBLE
                pi.visibility = android.view.View.VISIBLE
                Q.visibility = android.view.View.VISIBLE
                imgBox.visibility = android.view.View.VISIBLE
                sBtn.visibility = android.view.View.VISIBLE
                eBtn.visibility = android.view.View.VISIBLE
            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                oreo.visibility = android.view.View.INVISIBLE
                pi.visibility = android.view.View.INVISIBLE
                Q.visibility = android.view.View.INVISIBLE
                imgBox.visibility = android.view.View.INVISIBLE
                sBtn.visibility = android.view.View.INVISIBLE
                eBtn.visibility = android.view.View.INVISIBLE
            }

            oreo.setOnClickListener {
                imgBox.setImageResource(R.drawable.oreo)
            }
            pi.setOnClickListener{
                imgBox.setImageResource(R.drawable.pie)
            }
            Q.setOnClickListener {
                imgBox.setImageResource(R.drawable.q10)
            }
            when(rGroup1.checkedRadioButtonId){
                    R.id.oreo -> imgBox.setImageResource(R.drawable.oreo)
                    R.id.pi -> imgBox.setImageResource(R.drawable.pie)
                    R.id.Q -> imgBox.setImageResource(R.drawable.q10)

                }
            }

         sBtn.setOnClickListener {
             ActivityCompat.finishAffinity(this)
         }
         eBtn.setOnClickListener {
             text2.visibility = android.view.View.INVISIBLE
             rGroup1.visibility = android.view.View.INVISIBLE
             oreo.visibility = android.view.View.INVISIBLE
             pi.visibility = android.view.View.INVISIBLE
             Q.visibility = android.view.View.INVISIBLE
             imgBox.visibility = android.view.View.INVISIBLE
             sBtn.visibility = android.view.View.INVISIBLE
             eBtn.visibility = android.view.View.INVISIBLE
             stoggle.isChecked = false
             rGroup1.clearCheck()
             imgBox.setImageResource(0)
         }

        }







    }
