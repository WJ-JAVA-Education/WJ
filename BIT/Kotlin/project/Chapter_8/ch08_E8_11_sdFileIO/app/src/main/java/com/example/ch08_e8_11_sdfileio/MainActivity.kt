package com.example.ch08_e8_11_sdfileio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.FileInputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRead : Button
        var edtSD : EditText
        btnRead = findViewById<Button>(R.id.btnRead)
        edtSD = findViewById<EditText>(R.id.edtSD)

        btnRead.setOnClickListener {
            var inFs = FileInputStream("/storage/emulated/0/sd_test.txt")
            var txt = ByteArray(inFs.available())
            inFs.read(txt)
            edtSD.setText(txt.toString(Charsets.UTF_8))
            inFs.close()
        }
    }
}