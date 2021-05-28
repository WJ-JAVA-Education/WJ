package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lotteryNumbers = arrayListOf(number1, number2, number3, number4, number5, number6, number7)

        val countDownTimer = object: CountDownTimer(3000, 100){
            override fun onTick(millisUntilFinished: Long) {
                lotteryNumbers.forEach{
                    val randomNumber = (Math.random() * 45 + 1).toInt()
                    it.text = "$randomNumber"
                }
            }

            override fun onFinish() {}
        }

        lotteryButton.setOnClickListener {
            if (lotteryButton.isAnimating){
              lotteryButton.cancelAnimation()
                countDownTimer.cancel()
                } else {
                    lotteryButton.playAnimation()
                    countDownTimer.start()
                }
            }
         }
}