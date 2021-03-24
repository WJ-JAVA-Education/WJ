package com.example.musicservice

import android.app.Activity
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MyService : android.app.Service() {
    lateinit var mp : MediaPlayer

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        android.util.Log.i("서비스 테스트","onStartCommand()")
        mp = MediaPlayer.create(this,R.raw.song1)
        mp.isLooping = true
        mp.start()
        Toast.makeText(this,"stopService()",Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        super.onCreate()
        android.util.Log.i("서비스 테스트","onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        android.util.Log.i("서비스 테스트","onDestroy()")
        mp.stop()
    }

}