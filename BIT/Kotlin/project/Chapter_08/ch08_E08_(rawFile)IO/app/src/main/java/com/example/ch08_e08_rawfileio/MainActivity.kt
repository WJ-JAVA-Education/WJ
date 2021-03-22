package com.example.ch08_e08_rawfileio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var btnRead : Button
        lateinit var edtRaw : EditText

        btnRead.findViewById<Button>(R.id.btnRead)
        edtRaw.findViewById<EditText>(R.id.edtRaw)

        btnRead.setOnClickListener {
            var inputS = resources.openRawResource(R.raw.raw_test)
            var txt = ByteArray(inputS.available())
            inputS.read(txt)
            edtRaw.setText(txt.toString(Charsets.UTF_8))
            inputS.close()
        }
    }
}