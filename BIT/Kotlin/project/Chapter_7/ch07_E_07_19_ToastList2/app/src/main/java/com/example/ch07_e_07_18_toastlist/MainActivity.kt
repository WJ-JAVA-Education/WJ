package com.example.ch07_e_07_18_toastlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button1 = findViewById<Button>(R.id.button1)

            button1.setOnClickListener {
            var versionArray = arrayOf("오레오", "파이", "큐(10)")
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 버전은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setItems(versionArray) { dialog, which ->
                button1.text = versionArray[which] }
                dlg.setSingleChoiceItems(versionArray, 0 ){dialog,which ->
                    button1.text = versionArray[which]
                }
            dlg.setPositiveButton("닫기", null)
            dlg.show()
        }
    }
}