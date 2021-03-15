package com.example.ch07_e07contextmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var baseLayout: LinearLayout
    lateinit var btn1: Button
    lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색 바꾸기 ( 컨텍스트 메뉴)"

        baseLayout = findViewById<LinearLayout>(R.id.baseLayout)
        btn1 = findViewById<Button>(R.id.btn1) as Button
        registerForContextMenu(btn1)
        btn2 = findViewById<Button>(R.id.btn2) as Button
        registerForContextMenu(btn2)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        var menuInflater = this.menuInflater
        if (v === btn1) {
            menu!!.setHeaderTitle("배경색 변경")
            menuInflater.inflate(R.menu.menu1, menu)
        }
        if (v === btn2) {
            menuInflater.inflate(R.menu.menu2, menu)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.itemRed -> {
                baseLayout.setBackgroundColor(Color.RED)
                return true
            }
            R.id.itemGreen -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                return true
            }
            R.id.subRotate -> {
                btn2.rotation = 45f
                return true
            }
            R.id.subSize -> {
                btn1.scaleX = 45f
                btn2.scaleX = 45f
                return true
            }
        }
        return false
    }
}
