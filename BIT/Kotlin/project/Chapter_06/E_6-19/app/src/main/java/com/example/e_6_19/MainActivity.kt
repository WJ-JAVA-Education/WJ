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
class MainActivity : AppCompatActivity() , ActionBar.TabListener { // TabListener 을 장착 -> 나 (= MainActivity ) 자체가 리스너를 가진다.
    // 6-19

    // 1. 멤버변수로 탭 ( = 메뉴 )
    lateinit var tabSong: ActionBar.Tab
    lateinit var tabArtists: ActionBar.Tab
    lateinit var tabAlbum: ActionBar.Tab

    // 프래그먼트 객체를 만든다 . 3개니까 배열로~! 정확히 말해서 ,객체배열로~
    var myFrags = arrayOfNulls<MyTabFregment>(3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. 액션바 변수를 만든다 (연결한다) . ( 새로만드는게 아니고 , 액티비티에 있는것을 불러온다.)

        var bar = this.supportActionBar
        bar!!.navigationMode = ActionBar.NAVIGATION_MODE_TABS

        // 2. 액션바에 탭을 장착한다. (3개의 탭을 액션바에)

        //  6-19
        tabSong = bar.newTab()
        tabSong.text = "음악별"
        tabSong.setTabListener(this) // 이벤트를 추가
        bar.addTab(tabSong)

        tabArtists = bar.newTab()
        tabArtists.text = "가수별"
        tabArtists.setTabListener(this) // 이벤트를 추가
        bar.addTab(tabArtists)

        tabAlbum = bar.newTab()
        tabAlbum.text = "앨범별"
        tabAlbum.setTabListener(this) // 이벤트를 추가
        bar.addTab(tabAlbum)
    }


    // 6-21 myFrags 생성



    //  6-19 3개의 오버라이드 한 함수 생성
    override fun onTabSelected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
        // 탭을 클릭 했을때....
        // 사전작업으로 프래그먼트를 준비한다. (미리 프래그먼트의 객체를 만들어 놓는다)
        // 1)액티비티 안에 ).프레그먼트 안에 3)리니어레이아웃(뷰) 설정
        
        // 프래그먼트배열(myFrags[])에 넣을 , 1개짜리 프래그먼트 객체 (myTabFrg) 만들기
        
        var myTabFreg: MyTabFregment? = null

        if (myFrags[tab!!.position] == null) {
            // 프래그먼트 배열 안에 해당위치 (인덱스) 아무것도 없으면 (프레그먼트객체)가 없으면 , 객체 만들어서 넣는다.
            // 반대로 있으면 , 배열 안에 있는 객체를 꺼낸다.
            myTabFreg = MyTabFregment()
            val data = Bundle()
            data.putString("tabName", tab.text.toString())
            myTabFreg.arguments = data
            myFrags[tab!!.position] = myTabFreg

            // frags 배열에 넣는다 , 재사용을 위해서
        } else  // frags 배열이 null 이 아니면 , 이미 한번 사용을 했다면 ,  탭을 눌렀다면 .
            // frags 배열에 있는거를 꺼내서 사용한다.
            myTabFreg = myFrags[tab.position]

        ft!!.replace(android.R.id.content, myTabFreg!!)
    }

    override fun onTabUnselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
    }


    override fun onTabReselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
    }
}

// 내부 (inner) 클래스 자리에 프레그먼트를 만든다.
    class MyTabFregment : androidx.fragment.app.Fragment() {
        // 6-20
        var tabName: String? = null

        // 2가지 메소드를 재정의 (odverride) 1)_onCreate() 와 2)_onCreateView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            var data = arguments  // 부모인 Fragment 클래스의 멤버
            // data를 통해서 os로 부터 탭의 이름을 알아낸다.
            tabName = data!!.getString("tabName")

        }
        // 프레그먼트 안의 View 를 만든다 , 다시말해서 프레그먼트 소속 "레이아웃"을 만든다.
        override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
            var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                    LinearLayout.LayoutParams.MATCH_PARENT)

            var baseLayout = LinearLayout(super.getActivity())
            baseLayout.orientation = LinearLayout.VERTICAL
            baseLayout.layoutParams = params

            if (tabName === "음악별") baseLayout.setBackgroundColor(Color.RED)
            if (tabName === "가수별") baseLayout.setBackgroundColor(Color.GREEN)
            if (tabName === "앨범별") baseLayout.setBackgroundColor(Color.BLUE)

            // 리턴값으로 내가만든 레이아웃을 리턴한다.
            return baseLayout
        }
    }














