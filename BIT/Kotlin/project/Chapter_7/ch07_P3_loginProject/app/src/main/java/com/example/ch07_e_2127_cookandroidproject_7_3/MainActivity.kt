package com.example.ch07_e_2127_cookandroidproject_7_3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var tvName : TextView
    lateinit var tvEmail : TextView
    lateinit var button1 : Button
    lateinit var dlgEdtName : EditText
    lateinit var dlgEdtEmail : EditText
    lateinit var toastText : TextView
    lateinit var dialogView : View
    lateinit var toastView : View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "사용자 정보 입력(수정)"

        tvName = findViewById<TextView>(R.id.tvName)
        tvEmail = findViewById<TextView>(R.id.tvEmail)
        button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            dialogView = View.inflate(this,R.layout.dialog1,null)
            var dlg = AlertDialog.Builder(this)
            dlg.setTitle("사용자 정보 입력")
            dlg.setIcon(R.drawable.ic_menu_allfriends)
            dlg.setView(dialogView)
            dlg.setPositiveButton("확인") { dialog, which ->

                dlgEdtName = dialogView.findViewById<EditText>(R.id.dlgEdt1)
                dlgEdtEmail = dialogView.findViewById<EditText>(R.id.dlgEdt2)

                tvName.text = dlgEdtName.text.toString()
                tvEmail.text = dlgEdtEmail.text.toString()

            }

            dlg.setNegativeButton("취소") { dialog, which ->
                var toast = Toast(this)
                toastView = View.inflate(this,R.layout.toast1,null)
                toastText = toastView.findViewById<TextView>(R.id.toastText1)
                toast.view = toastView
                var display = (getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay
                var xOffset = (Math.random() * display.width).toInt()
                var yOffset = (Math.random() * display.width).toInt()
                toast.setGravity(Gravity.TOP or Gravity.LEFT , xOffset, yOffset)
                toast.show()
            }
            dlg.show()
        }

    }



}