package com.example.ch07_e_07_18_toastlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById<Button>(R.id.button1)
        tv1 = findViewById<TextView>(R.id.tv1)

        button1.setOnClickListener {
            var versionArray = arrayOf("오레오", "파이", "큐(10)")
            var checkArray = booleanArrayOf(true, false, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 버전은?")
            dlg.setIcon(R.mipmap.ic_launcher)

            var str = "";
            var cnt = 0;

            dlg.setMultiChoiceItems(versionArray, checkArray) { dialog, which, ischecked ->
                for (i in 0 .. versionArray.size-1){
                    if (checkArray[i])
                        str += "," + versionArray[i]
                }
                button1.text = str
            }
            dlg.setPositiveButton("닫기", null)
            dlg.show()
            }
        }
    }

