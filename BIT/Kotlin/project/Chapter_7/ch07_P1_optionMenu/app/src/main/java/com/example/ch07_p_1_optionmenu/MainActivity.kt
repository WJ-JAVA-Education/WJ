package com.example.ch07_p_1_optionmenu

import android.content.ClipData
import android.graphics.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView
import androidx.constraintlayout.widget.Group
import androidx.core.graphics.drawable.toDrawable

class MainActivity : AppCompatActivity() {
    lateinit var gakdo : EditText
    lateinit var img1 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "옵션 메뉴로 사진바꾸기"

        gakdo = findViewById<EditText>(R.id.gakdo)
        img1 = findViewById<ImageView>(R.id.img1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var mInflate = menuInflater
            mInflate.inflate(R.menu.menu,menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.rocation -> {
                img1.rotation += Integer.parseInt(gakdo.text.toString()).toFloat()
            }
            R.id.item1 ->{
                    img1.setImageResource(R.drawable.jeju1)
                    item.setChecked(true)
                return true
            }
            R.id.item2 ->{
                img1.setImageResource(R.drawable.jeju2)
                item.setChecked(true)
                return true
            }
            R.id.item3 ->{
                img1.setImageResource(R.drawable.jeju3)
                item.setChecked(true)
                return true
            }
        }

        return false
    }
}