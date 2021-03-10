package com.example.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup1: RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton
    lateinit var btnOK : Button
    lateinit var imgPet : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "애완동물 사진 보기"

        text1 = findViewById<TextView>(R.id.text1)
        text2 = findViewById<TextView>(R.id.text2)
        chkAgree = findViewById<CheckBox>(R.id.chkAgree)
        rGroup1 = findViewById<RadioGroup>(R.id.rGroup1)
        rdoDog = findViewById<RadioButton>(R.id.rdoDog)
        rdoCat = findViewById<RadioButton>(R.id.rdoCat)
        rdoRabbit = findViewById<RadioButton>(R.id.rdoRabbit)
        btnOK = findViewById<Button>(R.id.btnOK)
        imgPet = findViewById<ImageView>(R.id.imgPet)

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if (chkAgree.isChecked == true){
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOK.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOK.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }

        btnOK.setOnClickListener {
            when (rGroup1.checkedRadioButtonId){

                R.id.rdoDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.rdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.rdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)

                else -> Toast.makeText(applicationContext,"동물을 먼저 선택하세요",Toast.LENGTH_SHORT).show()
            }
        }
    }

}