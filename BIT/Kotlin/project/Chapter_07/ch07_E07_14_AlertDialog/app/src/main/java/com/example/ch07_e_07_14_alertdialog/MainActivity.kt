package com.example.ch07_e_07_14_alertdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
        var dlg = AlertDialog.Builder(this@MainActivity)
        dlg.setTitle("제목 입니다")
        dlg.setMessage("이곳이 내용입니다.")
        dlg.setIcon(R.mipmap.ic_launcher)

            // 버튼이 1개인 대화상자 Kotlin 코드
        dlg.setPositiveButton("확인", {dialog,which->Toast.makeText(this,"확인을 눌렀네요" , Toast.LENGTH_SHORT ).show()})
        dlg.show()
        }
    }
}