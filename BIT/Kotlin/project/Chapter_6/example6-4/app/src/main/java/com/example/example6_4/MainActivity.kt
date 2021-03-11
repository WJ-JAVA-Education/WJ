package com.example.example6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var chronometer1 : Chronometer
    lateinit var btnStart : Button
    lateinit var btnEnd : Button
    lateinit var rdoCal : RadioButton
    lateinit var rdoTime : RadioButton
    lateinit var calView : CalendarView
    lateinit var tPicker : TimePicker
    lateinit var tvYear : TextView
    lateinit var tvMonth : TextView
    lateinit var tvDay : TextView
    lateinit var tvHour : TextView
    lateinit var tvMinute : TextView
    var selectYear : Int = 0
    var selectMonth : Int = 0
    var selectDay : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "시간 예약"


        var chrono = findViewById<Chronometer>(R.id.chronometer1)
        var btnStart = findViewById<Button>(R.id.rBtn1)
        var btnEnd = findViewById<Button>(R.id.rBtn2)
        var rdoCal = findViewById<RadioButton>(R.id.rBtn1)
        var rdoTime = findViewById<RadioButton>(R.id.rBtn2)
        var calView = findViewById<CalendarView>(R.id.calenderView)
        var tPicker = findViewById<DatePicker>(R.id.datePicker)

    }
}