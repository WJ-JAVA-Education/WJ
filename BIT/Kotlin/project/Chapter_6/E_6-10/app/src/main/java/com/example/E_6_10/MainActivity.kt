package com.example.E_6_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import com.example.E_6_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var vb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        var view = vb.root
        setContentView(view)

        // 1. 배열에 목록들을 담는다.
        var items = arrayOf("CSI-뉴욕", "CSI-라스베가스","CSI-마이애미","Friends","Fringe","Lost")
        // 2. 드랍다운 아이템에 목록들을 변수에 담는다.
        var adapter = ArrayAdapter(this , android.R.layout.simple_dropdown_item_1line , items)
        // 3. 드랍다운 ID에 목록들을 심어준다.
        vb.autoComplete1.setAdapter(adapter)


        var token = MultiAutoCompleteTextView.CommaTokenizer()
        vb.autoComplete2.setTokenizer(token)
        vb.autoComplete2.setAdapter(adapter)



    }
}