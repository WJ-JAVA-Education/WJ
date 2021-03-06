package com.example.ch08_e08_14_listfiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.EditText
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnFilelist : Button
        var edtFilelist : EditText
        btnFilelist = findViewById<Button>(R.id.btnFilelist)
        edtFilelist = findViewById<EditText>(R.id.edtFilelist)

        btnFilelist.setOnClickListener {
            var sysDir = Environment.getRootDirectory().absolutePath
            var sysFiles = File(sysDir).listFiles()

            var strFname : String
            for (i in sysFiles.indices){
                if (sysFiles[i].isDirectory == true)
                    strFname = "<폴더> " + sysFiles[i].toString()
                else
                    strFname = "<파일> " + sysFiles[i].toString()

                edtFilelist.setText(edtFilelist.text.toString() + "\n" + strFname)
            }
        }
    }
}