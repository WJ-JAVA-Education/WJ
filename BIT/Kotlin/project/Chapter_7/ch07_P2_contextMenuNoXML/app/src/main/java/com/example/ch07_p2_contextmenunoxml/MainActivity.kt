package com.example.ch07_p2_contextmenunoxml

import android.R
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FieldClassification
import android.text.BoringLayout
import android.text.Layout
import android.util.AttributeSet
import android.util.Size
import android.view.*
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.appcompat.widget.ButtonBarLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.Slide

class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
        val baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        baseLayout.gravity = Gravity.CENTER_HORIZONTAL
        setContentView(baseLayout, params)



        val btn1 = Button(this)
        btn1.text = "색 변경"
        btn1.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
        baseLayout.addView(btn1)
/*
        <Button
        android:id="@+id/btn1"
        android:layout_width=" "
        android:layout_height="wrap_content"
        android:text="배경색 변경"/>

 */

        var btn2 = Button(this)
        btn2.text = "버튼변경"
        btn2.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
        baseLayout.addView(btn2)
    }


    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if (v === btn1) {
            menu!!.add(0, 1, 0, "배경색 (빨강)")
            menu!!.add(0, 2, 0, "배경색 (초록)")
            menu!!.add(0, 3, 0, "배경색 (파랑)")
        }
        if (v === btn2) {
            menu!!.add(0,1,0, "화면 45도 전환")
            menu!!.add(0,2,0, "버튼 사이즈 전환")
        }
    }
}