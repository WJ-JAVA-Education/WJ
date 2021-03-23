package com.example.ch11_e_16spinner

import android.content.Context
import android.graphics.Movie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.sql.Array
import android.widget.AdapterView.OnItemClickListener as AdapterViewOnItemClickListener
import android.widget.AdapterView.OnItemClickListener as OnItemClickListener
import android.widget.AdapterView.OnItemSelectedListener as AdapterViewOnItemSelectedListener

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener {
    lateinit var spinner: Spinner
    lateinit var iv1: ImageView

    var posterID = arrayOf(
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09, R.drawable.mov10,
            R.drawable.mov11, R.drawable.mov12, R.drawable.mov13, R.drawable.mov14, R.drawable.mov15,
            R.drawable.mov16, R.drawable.mov17, R.drawable.mov18, R.drawable.mov19, R.drawable.mov20,
            R.drawable.mov21, R.drawable.mov22, R.drawable.mov23, R.drawable.mov24, R.drawable.mov25,
            R.drawable.mov26, R.drawable.mov27, R.drawable.mov28, R.drawable.mov29, R.drawable.mov30,
            R.drawable.mov31, R.drawable.mov32, R.drawable.mov33, R.drawable.mov34, R.drawable.mov35,
            R.drawable.mov36, R.drawable.mov37, R.drawable.mov38, R.drawable.mov39, R.drawable.mov40,
            R.drawable.mov41, R.drawable.mov42, R.drawable.mov43, R.drawable.mov44, R.drawable.mov45,
            R.drawable.mov46, R.drawable.mov47, R.drawable.mov48, R.drawable.mov49, R.drawable.mov50,
            R.drawable.mov51, R.drawable.mov52, R.drawable.mov53, R.drawable.mov54, R.drawable.mov55,
            R.drawable.mov56, R.drawable.mov57, R.drawable.mov58, R.drawable.mov59, R.drawable.mov60,
            R.drawable.mov61)

    var movieName = arrayOf(
            "써니", "완득이", "괴물", "라디오 스타", "비열한 거리", "왕의 남자", "아일랜드", "웰컴 투 동막골",
            "헬보이", "빽 투더 퓨처", "여인의 향기", "쥬라기 공원", "톰 행크스 포레스트 캠프", "Groundhog Day", "혹성탈출 진화의 시작",
            "아름다운 비행", "내이름은 칸", "해리포터", "마더", "킹콩을 들다", "쿵푸팬더2", "짱구는못말려", "아저씨", "아바타", "대부",
            "국가대표", "토이스토리3", "마당을 나온 암탉", "죽은 시인의 사회", "서유쌍기", "킹콩", "반지의 제왕", "8월의 크리스마스",
            "미녀는 괴로워", "나홀로집에", "파이란", "더록", "옛날영화", "매트릭스", "가위손", "외국영화", "에이아이", "집으로", "글래디에이터",
            "쇼생크탈출", "인생은 아름다워", "피아니스트", "더 사운드 오브 뮤직", "ET", "나비효과", "레옹", "바람과 함께 사라지다", "아마데우스",
            "라스트 모히칸", "센과 치히로의 행방불명", "알", "터미네이터2 심판의날", "테이큰", "브레이브하트", "시네마 파라다이소", "월-E"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "스피너 테스트"

        spinner = findViewById<Spinner>(R.id.spinner1)
        var adapter: ArrayAdapter<String>
        adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, movieName)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        iv1 = findViewById<ImageView>(R.id.iv1)
        iv1.setImageResource(posterID[position])
        return
    }
}





