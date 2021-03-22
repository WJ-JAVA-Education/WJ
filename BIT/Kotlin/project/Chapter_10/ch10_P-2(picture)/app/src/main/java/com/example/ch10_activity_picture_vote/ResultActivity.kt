package com.example.ch10_activity_picture_vote

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        title = "투표 결과"

        // 앞 화면에서 보낸 투표 결과 값을 받는다.
        var intent = intent
        var voteResult = intent.getIntArrayExtra("VoteCount")
        var imageName = intent.getStringArrayExtra("ImageName")

        // 9개의 TextView, RatingBar 객체배열
        var tv = arrayOfNulls<TextView>(imageName!!.size)
        var rbar = arrayOfNulls<RatingBar>(imageName!!.size)

        //객체 만들고, 바인딩
        val tvMax = findViewById<TextView>(R.id.tvMax);
        val ivMax = findViewById<ImageView>(R.id.ivMax);

        //최다 득표수의 그림명과 그림을 구하기 위해서, voteResult의 최다득표수 위치(인덱스)를 찾는다.
//방법1. max 변수를 사용
//        var max = 0;
//        var maxIndex = 0;
//        for( i in 0..voteResult!!.size-1)
//        {
//            if(voteResult[i] > max)
//            {
//                max = voteResult[i]
//                maxIndex = i
//            }
//        }

        //방법2. maxIndex만 사용

        var maxIndex = 0;
        for( i in 0..voteResult!!.size-1)
            if(voteResult[i] > voteResult[maxIndex])
                maxIndex = i

        var ImageField = arrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
                                 R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
                                 R.drawable.pic7, R.drawable.pic8, R.drawable.pic9)

        tvMax.text = imageName[maxIndex]
        ivMax.setImageResource(ImageField[maxIndex])


        // 9개의 TextView, RatingBar ID 배열
        var tvID = arrayOf(R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9)
        var rbarID = arrayOf(R.id.rbar1, R.id.rbar2, R.id.rbar3, R.id.rbar4, R.id.rbar5, R.id.rbar6, R.id.rbar7, R.id.rbar8, R.id.rbar9)

        // TextView, RatingBar 개체 찾기.
        for (i in voteResult!!.indices) {
            tv[i] = findViewById<TextView>(tvID[i])
            rbar[i] = findViewById<RatingBar>(rbarID[i])
        }

        // 각 TextVeiw 및 RatingBar에 넘겨 받은 값을 반영.
        for (i in voteResult.indices) {
            tv[i]!!.setText(imageName[i])
            rbar[i]!!.setRating(voteResult[i].toFloat())
        }

        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            finish()
        }

    }
}