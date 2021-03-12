package com.example.p_6_1

import android.graphics.Color
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.text.format.Time
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.p_6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vb: ActivityMainBinding
    var setYear : Int = 0
    var setMonth : Int = 0
    var setDay : Int = 0
    var setHours : Int = 0
    var setMin : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        val view = vb.root
        setContentView(view)

        title = "시간 예약 (수정)"

        vb.rGroup.visibility = View.INVISIBLE
        vb.sBtn.setOnClickListener {
            vb.chronometer1.base = SystemClock.elapsedRealtime()
            vb.chronometer1.start()
            vb.chronometer1.setTextColor(Color.RED)
            vb.rGroup.visibility = View.VISIBLE
        }

    vb.rGroup.setOnCheckedChangeListener { group, checkedId ->
        if (checkedId == R.id.rBtn1){
            vb.datePicker1.visibility = View.VISIBLE
            vb.timePicker1.visibility = View.INVISIBLE
        }else{
            vb.timePicker1.visibility = View.VISIBLE
            vb.datePicker1.visibility = View.INVISIBLE
        }
    }


        vb.datePicker1.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
            setYear = year
            setMonth = monthOfYear
            setDay = dayOfMonth
        }
        vb.timePicker1.setOnTimeChangedListener { view, hourOfDay, minute ->
            setHours = hourOfDay
            setMin = minute
        }
            // DatePicker 는 vb.datePicker1.year / vb.datePicker1.monthOfYear+1 / vb.datePicker.dayofMonth 로 불러올수있다.
        vb.endBtn.setOnLongClickListener {
            vb.tYear.setText(setYear.toString()+"년 ")
            vb.tMonth.setText(setMonth.toString()+"월 ")
            vb.tDay.setText(setDay.toString()+"일 ")
            vb.tHours.setText(setHours.toString()+"시 ")
            vb.tMin.setText(setMin.toString()+"분 예약됨")
            vb.rGroup.visibility = View.INVISIBLE
            vb.timePicker1.visibility = View.INVISIBLE
            vb.datePicker1.visibility = View.INVISIBLE
            true
        }

    }
}