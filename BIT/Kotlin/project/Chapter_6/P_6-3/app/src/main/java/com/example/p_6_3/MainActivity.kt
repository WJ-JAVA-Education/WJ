package com.example.p_6_3

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost
import com.example.p_6_3.databinding.ActivityMainBinding
@Suppress("deprecation")
class MainActivity : TabActivity() {
    lateinit var vb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var DOG_SPEC = tabHost.newTabSpec("dog").setIndicator("강아지")
        DOG_SPEC.setContent(R.id.dogPic)
        tabHost.addTab(DOG_SPEC)
        
        var CAT_SPEC = tabHost.newTabSpec("cat").setIndicator("고양이")
        CAT_SPEC.setContent(R.id.catPic)
        tabHost.addTab(CAT_SPEC)
        
        var RABBIT_SPEC = tabHost.newTabSpec("rabbit").setIndicator("토끼")
        RABBIT_SPEC.setContent(R.id.rabbitPic)
        tabHost.addTab(RABBIT_SPEC)

        var HORSE_SPEC = tabHost.newTabSpec("horse").setIndicator("말")
        HORSE_SPEC.setContent(R.id.horsePic)
        tabHost.addTab(HORSE_SPEC)


        tabHost.currentTab = 0



    }
}