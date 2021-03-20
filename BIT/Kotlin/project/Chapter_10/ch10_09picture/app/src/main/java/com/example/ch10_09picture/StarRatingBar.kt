package com.example.ch10_09picture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import org.w3c.dom.Text

class StarRatingBar : AppCompatActivity() {
    lateinit var tv1: TextView
    lateinit var tv2: TextView
    lateinit var tv3: TextView
    lateinit var tv4: TextView
    lateinit var tv5: TextView
    lateinit var tv6: TextView
    lateinit var tv7: TextView
    lateinit var tv8: TextView
    lateinit var tv9: TextView

    lateinit var rbar1: RatingBar
    lateinit var rbar2: RatingBar
    lateinit var rbar3: RatingBar
    lateinit var rbar4: RatingBar
    lateinit var rbar5: RatingBar
    lateinit var rbar6: RatingBar
    lateinit var rbar7: RatingBar
    lateinit var rbar8: RatingBar
    lateinit var rbar9: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_star_rating_bar)
        title = "투표 결과"


        var intent = intent
        var voteResult = intent.getIntArrayExtra("VoteCount")
        var imageName = intent.getStringArrayExtra("ImageName")

        var tv = arrayOfNulls<TextView>(imageName!!.size)
        var rbar = arrayOfNulls<RatingBar>(imageName!!.size)


        var tvID = arrayOf(
            R.id.tv1,
            R.id.tv2,
            R.id.tv3,
            R.id.tv4,
            R.id.tv5,
            R.id.tv6,
            R.id.tv7,
            R.id.tv8,
            R.id.tv9
        )
        var rbarID = arrayOf(
            R.id.rbar1,
            R.id.rbar2,
            R.id.rbar3,
            R.id.rbar4,
            R.id.rbar5,
            R.id.rbar6,
            R.id.rbar7,
            R.id.rbar8,
            R.id.rbar9
        )

        for (i in voteResult!!.indices){
            tv[i] =  findViewById<TextView>(tvID[i])
            rbar[i] = findViewById<RatingBar>(rbarID[i])
        }

        for (i in voteResult.indices){
            tv[i]!!.setText(imageName[i])
            rbar[i]!!.rating = (voteResult[i].toFloat())
        }

        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            finish()
        }

    }
}