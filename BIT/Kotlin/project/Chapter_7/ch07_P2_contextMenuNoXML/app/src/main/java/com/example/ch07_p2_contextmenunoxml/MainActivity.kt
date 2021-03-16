package com.example.ch07_e07contextmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RadioGroup
import com.example.ch07_p2_contextmenunoxml.R

class MainActivity : AppCompatActivity() {
    lateinit var baseLayout: LinearLayout
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var spin1 : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button1)
        title = "배경색 바꾸기 ( 컨텍스트 메뉴)"

        baseLayout = findViewById<LinearLayout>(R.id.baseLayout)
        btn1 = findViewById<Button>(R.id.btn1) as Button
        registerForContextMenu(btn1)
        btn2 = findViewById<Button>(R.id.btn2) as Button
        registerForContextMenu(btn2)

        spin1 = findViewById<CheckBox>(R.id.spin1)

        spin1.setOnClickListener {
            var i = 0
            while (spin1.isChecked){
                i += 1
                Thread.sleep(100)
                btn1.rotation = btn1.rotation + i
            }
        }
    }


    override fun onCreateContextMenu(menu: ContextMenu?,v: View?,menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var menuInflater = this.menuInflater
        if (v === btn1) {
            menu!!.setHeaderTitle("배경색 변경")
            menu!!.add(0,1,0, "배경색 (빨강)")
            menu!!.add(0,2,0, "배경색 (초록)")
            menu!!.add(0,3,0, "배경색 (파랑)")
        }
        if (v === btn2) {
            menu!!.setHeaderTitle("버튼 변경")
            menu!!.add(0,4,0, "버튼 45도 회전")
            menu!!.add(0,5,0, "버튼 크기변경")
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                baseLayout.setBackgroundColor(Color.RED)
                return true
            }
            2 -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                return true
            }
            3 -> {
                baseLayout.setBackgroundColor(Color.BLUE)
                return true
            }
            4 -> {
                btn1.rotation = btn1.rotation+45f
                btn2.rotation = btn2.rotation+45f
                return true
            }
            5 -> {
                if (btn1.scaleX < 45f) {
                    btn1.scaleX = btn1.scaleX+45f
                    btn2.scaleX = btn2.scaleX+45f
                    true
                }else{
                    btn1.scaleX = btn1.scaleX - 45f
                    btn2.scaleX = btn2.scaleX - 45f
                    true
                }
            }
        }
        return false
    }
}
