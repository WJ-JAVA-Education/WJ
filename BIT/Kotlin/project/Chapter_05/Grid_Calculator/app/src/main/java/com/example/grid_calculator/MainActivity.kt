package com.example.grid_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

    lateinit var edit1 : TextView
    lateinit var edit2 : TextView

    internal var numButtons = ArrayList<Button>(10)
    internal var numBtnIDs = arrayOf(
        R.id.BtnNum0,R.id.BtnNum1,R.id.BtnNum2,R.id.BtnNum3,R.id.BtnNum4,
        R.id.BtnNum5,R.id.BtnNum6,R.id.BtnNum7,R.id.BtnNum8,R.id.BtnNum9)

    lateinit internal var btnAdd : Button
    lateinit internal var btnSub : Button
    lateinit internal var btnMul : Button
    lateinit internal var btnDiv : Button

    lateinit internal var textResult : TextView
    lateinit internal var num1 : String
    lateinit internal var num2 : String
    internal var result : Int? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "그리드 레이아웃 계산기"

        var edit1 = findViewById<EditText>(R.id.edit1)
        var edit2 = findViewById<EditText>(R.id.edit2)
        var btnAdd = findViewById<Button>(R.id.BtnAdd)
        var btnSub = findViewById<Button>(R.id.BtnSub)
        var btnMul = findViewById<Button>(R.id.BtnMul)
        var btnDiv = findViewById<Button>(R.id.BtnDiv)

        for (i in 0..numBtnIDs.size-1 step 1){
            numButtons.add(findViewById<Button>(numBtnIDs[i]))
        }

        for (i in 0..numBtnIDs.size-1 step 1){
            numButtons[i].setOnClickListener {
                if (edit1.isFocused){

                }else if (edit2.isFoucsed){

                }

            }
        }


    }
}