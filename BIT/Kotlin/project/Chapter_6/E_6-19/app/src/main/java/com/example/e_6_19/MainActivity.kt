package com.example.e_6_19

import android.app.Notification
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout

@Suppress("deprecation")
class MainActivity : AppCompatActivity() , ActionBar.TabListener {
    // 6-19
    lateinit var tabSong: ActionBar.Tab
    lateinit var tabArtists: ActionBar.Tab
    lateinit var tabAlbum: ActionBar.Tab

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var bar = this.supportActionBar
        bar!!.navigationMode = ActionBar.NAVIGATION_MODE_TABS

        //  6-19
        tabSong = bar.newTab()
        tabSong.text = "음악별"
        tabSong.setTabListener(this)
        bar.addTab(tabSong)

        tabArtists = bar.newTab()
        tabArtists.text = "가수별"
        tabArtists.setTabListener(this)
        bar.addTab(tabArtists)

        tabAlbum = bar.newTab()
        tabAlbum.text = "앨범별"
        tabAlbum.setTabListener(this)
        bar.addTab(tabAlbum)
    }

    // 6-21 myFrags 생성
    var myFrags = arrayOfNulls<MyTabFregMent>(3)

    //  6-19 3개의 오버라이드 한 함수 생성
    override fun onTabSelected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
        var myTabFreg : MyTabFregMent? = null

        if (myFrags[tab.position] == null){
            myTabFreg = MyTabFregMent()
            val data = Bundle()
            data.putString("tabName", tab.text.toString())
            myTabFreg.arguments = data
            myFrags[tab.position] = myTabFreg
        }else
            myTabFreg = myFrags[tab.position]
        ft.replace(android.R.id.content, myTabFreg!!)
    }

    override fun onTabUnselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
        TODO("Not yet implemented")
    }

    override fun onTabReselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
        TODO("Not yet implemented")
    }
}

    class MyTabFregment : androidx.fragment.app.Fragment() {
        // 6-20
        var tabName: String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            var data = arguments
            tabName = data!!.getString("tabName")

        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            var params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )

            var baseLayout = LinearLayout(super.getActivity())
            baseLayout.orientation = LinearLayout.VERTICAL
            baseLayout.layoutParams = params

            if (tabName === "음악별") baseLayout.setBackgroundColor(Color.RED)
            if (tabName === "가수별") baseLayout.setBackgroundColor(Color.GREEN)
            if (tabName === "앨범별") baseLayout.setBackgroundColor(Color.BLUE)


            return baseLayout
        }
    }














