package com.example.ch08_e08_12_sdfileio_2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import androidx.core.app.ActivityCompat
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),Context.MODE_PRIVATE)

        var btnMkdir : Button
        var btnRmdir : Button
        btnMkdir = findViewById<Button>(R.id.btnMkdir)
        btnRmdir = findViewById<Button>(R.id.btnRmdir)

        var strSDpath = Environment.getExternalStorageDirectory().absolutePath
        var myDir = File("$strSDpath/myDir")

        btnMkdir.setOnClickListener {
            myDir.mkdir()
        }

        btnRmdir.setOnClickListener {
            myDir.delete()
        }

    }
}