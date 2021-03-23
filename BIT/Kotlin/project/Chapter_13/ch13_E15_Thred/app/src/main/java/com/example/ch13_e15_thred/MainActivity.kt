package com.example.ch13_e15_thred

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.SystemClock
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.core.app.ActivityCompat
import java.io.File
import java.text.SimpleDateFormat
import java.util.ArrayList
import android.media.MediaPlayer.create as mediaPlayerCreate


class MainActivity : AppCompatActivity() {
    lateinit var startMusic : Button
    lateinit var stopMusic : Button
    lateinit var tvMP3 : TextView
    lateinit var tvTime : TextView
    lateinit var pbMP3 : ProgressBar
    lateinit var mPlayer : MediaPlayer
    lateinit var mp3List : ArrayList<String>
    lateinit var selectedMP3 : String

    var mp3path = Environment.getExternalStorageDirectory().path + "/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),Context.MODE_PRIVATE)

        mp3List = ArrayList()

        var listFiles = File(mp3path).listFiles()
        var fileName : String
        var extName : String
        for (file in listFiles!!){
            fileName = file.name
            extName = fileName.substring(fileName.length -3)
            if (extName == "mp3")
                mp3List.add(fileName)

        }

        var listViewMp3 = findViewById<ListView>(R.id.lv1)
        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,mp3List)
        listViewMp3.choiceMode = ListView.CHOICE_MODE_SINGLE
        listViewMp3.adapter = adapter
        listViewMp3.setItemChecked(0,true)

        listViewMp3.setOnItemClickListener { arg0, arg1, arg2, arg3 ->
            selectedMP3 = mp3List[arg2]
        }

        selectedMP3 = mp3List[0]

        startMusic = findViewById<Button>(R.id.startMusic)
        stopMusic = findViewById<Button>(R.id.stopMusic)
        tvMP3 = findViewById<TextView>(R.id.tvMP3)
        pbMP3 = findViewById<ProgressBar>(R.id.pbMP3)

        startMusic.setOnClickListener {
            mPlayer = MediaPlayer()
            mPlayer.setDataSource(mp3path + selectedMP3)
            mPlayer.prepare()
            mPlayer.start()
            startMusic.isClickable = true
            tvMP3.text = "실행중인 음악 : $selectedMP3"
            pbMP3.visibility = View.VISIBLE
        }

        stopMusic.setOnClickListener {
            mPlayer.stop()
            mPlayer.reset()
            stopMusic.isClickable = false
            tvMP3.text = "실행중인 음악 : "
            pbMP3.visibility = View.INVISIBLE
        }
        stopMusic.isClickable = false

        object : Thread(){
            var timeFormat = SimpleDateFormat("mm:ss")
            override fun run() {
                if (mPlayer == null)
                    return
                pbMP3.max = mPlayer.duration
                while (mPlayer.isPlaying) {
                    runOnUiThread{
                        pbMP3.progress = mPlayer.currentPosition
                        tvTime.text = "진행시간 : " + timeFormat.format(mPlayer.currentPosition)
                    }
                    SystemClock.sleep(200)
                }
            }
        }.start()
    }
}