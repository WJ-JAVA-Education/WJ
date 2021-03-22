package com.example.p_5_09

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)


        // 0단계: 레이아웃 객체를 만들기전에 옵션값 객체를 먼저 만든다.
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT)

        // 1단계: 레이아웃 객체를 만든다. (예 : LinearLayout 코틀린 객체)
        val baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        baseLayout.setBackgroundColor(Color.rgb(0,255,0))
        setContentView(baseLayout,params)


        // 2단계: 버튼 객체를 만든다.
        var btn = Button(this)
        btn.text = "버튼입니다"
        btn.setBackgroundColor(Color.MAGENTA)
        // 3단계: 버튼 객체를 레이아웃 객체에 소속(상속,부모자식관계) 시킨다.
        baseLayout.addView(btn)

        var textView = TextView(this)
        textView.setBackgroundColor(Color.rgb(0,250,250))
        textView.setText("버튼입니다")


        var textView2 = TextView(this)
        TextView.TEXT_ALIGNMENT_CENTER
        textView2.setText("IT CookBook. Android")

        // 4단계: 버튼 이벤트를 처리한다.
        btn.setOnClickListener {
            Toast.makeText(applicationContext,"코드로 생성한 버튼입니다.",Toast.LENGTH_SHORT).show()
            baseLayout.addView(textView)
            baseLayout.addView(textView2)
        }
    }
}