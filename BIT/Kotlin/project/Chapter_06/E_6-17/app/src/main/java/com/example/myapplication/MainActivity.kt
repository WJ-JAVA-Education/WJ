package com.example.myapplication

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
@Suppress("deprecation")
class MainActivity : TabActivity() {
    lateinit var vb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        var tabhost1 = this.tabHost




        var tabSpecsong = tabhost1.newTabSpec("SONG").setIndicator("음악별")
        tabSpecsong.setContent(R.id.tabSong)
        tabhost1.addTab(tabSpecsong)

        var tabSpecArtist = tabhost1.newTabSpec("ARTIST").setIndicator("가수별")
        tabSpecArtist.setContent(R.id.tabArtist)
        tabhost1.addTab(tabSpecArtist)

        var tabSpecAlbum = tabhost1.newTabSpec("ALBUM").setIndicator("앨범별")
        tabSpecAlbum.setContent(R.id.tabAlbum)
        tabhost1.addTab(tabSpecAlbum)


        tabhost1.currentTab = 0




    }
}