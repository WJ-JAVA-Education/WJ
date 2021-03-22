package com.example.example_6_8

import android.graphics.Color
import android.os.Bundle
import android.os.SystemClock
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDateTime
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    lateinit var chronometer1: Chronometer
    lateinit var sBtn: Button
    lateinit var rGroup: RadioGroup
    lateinit var dateSelect: RadioButton
    lateinit var timeSelect: RadioButton
    lateinit var calenderView1: CalendarView
    lateinit var timePicker1: TimePicker
    lateinit var btnCom: Button
    lateinit var tvYear: TextView
    lateinit var tvMonth: TextView
    lateinit var tvDay: TextView
    lateinit var tvHours: TextView
    lateinit var tvMin: TextView
    lateinit var tvSec: TextView
    lateinit var text1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chronometer1 = findViewById<Chronometer>(R.id.chronometer1)
        var sBtn = findViewById<Button>(R.id.sBtn)
        var rGroup = findViewById<RadioGroup>(R.id.rGroup)
        var dateSelect = findViewById<RadioButton>(R.id.dateSelect)
        var timeSelect = findViewById<RadioButton>(R.id.timeSelect)
        var calendarView1 = findViewById<CalendarView>(R.id.calenderView1)
        var timePicker1 = findViewById<TimePicker>(R.id.timePicker1)
        var btnCom = findViewById<Button>(R.id.btnCom)
        var tvYear = findViewById<TextView>(R.id.tvYear)
        var tvMonth = findViewById<TextView>(R.id.tvMonth)
        var tvDay = findViewById<TextView>(R.id.tvDay)
        var tvHours = findViewById<TextView>(R.id.tvHours)
        var tvMin = findViewById<TextView>(R.id.tvMin)
        var text1 = findViewById<TextView>(R.id.text1)
        var selectYear: Int = 0
        var selectMonth: Int = 0
        var selectDay: Int = 0
        var selectHousr : Int = 0
        var selectMin : Int = 0
        var btnAction : Int = 0
        // 변수 지정라인


        // 시간과 달력 숨기기


        timePicker1.visibility = View.INVISIBLE
        calendarView1.visibility = View.INVISIBLE
        rGroup.visibility = View.INVISIBLE

        sBtn.setOnClickListener {
            chronometer1.start()
            chronometer1.setTextColor(Color.RED)
            rGroup.visibility = View.VISIBLE
        }

            if(btnCom.isPressed){

                btnAction = 1
            }


            rGroup.setOnCheckedChangeListener { rGroup, i ->
                if (i == R.id.dateSelect) {
                    timePicker1.visibility = View.INVISIBLE
                    calendarView1.visibility = View.VISIBLE

                } else if (i == R.id.timeSelect) {
                    timePicker1.visibility = View.VISIBLE
                    calendarView1.visibility = View.INVISIBLE
                }
            }

            btnCom.setOnClickListener {
                tvYear.text = Integer.toString(selectYear) + " 년 "
                tvMonth.text = selectMonth.toString() + " 월 "
                tvDay.text = selectDay.toString() + " 일 "
                tvHours.text = selectHousr.toString() + " 시 "
                tvMin.text = selectMin.toString() + " 분 "
                chronometer1.stop()
                chronometer1.setTextColor(Color.BLUE)
            }

            calendarView1.setOnDateChangeListener { view, i, i2, i3 ->
                selectYear = i
                selectMonth = i2 + 1
                selectDay = i3
            }

            timePicker1.setOnTimeChangedListener { timePicker, i, i2 ->
                selectHousr = i
                selectMin = i2
            }





    }
}