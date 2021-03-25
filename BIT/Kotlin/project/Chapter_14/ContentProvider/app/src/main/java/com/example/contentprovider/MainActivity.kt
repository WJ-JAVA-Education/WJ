package com.example.contentprovider

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import java.text.SimpleDateFormat
import java.util.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    lateinit var btnCall : Button
    lateinit var edtCall : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_CALL_LOG),Context.MODE_PRIVATE)

        btnCall = findViewById<Button>(R.id.btnCall)
        edtCall = findViewById(R.id.edtCall)

        btnCall.setOnClickListener {
           edtCall.setText(findCallHistory())
        }
    }

    fun findCallHistory() : String{
        var callset = arrayOf(CallLog.Calls.DATE , CallLog.Calls.TYPE , CallLog.Calls.NUMBER , CallLog.Calls.DURATION)
        var c = contentResolver.query(CallLog.Calls.CONTENT_URI , callset , null , null , null)

        if (c!!.count == 0) {
            return "통화기록 없음"
        }
        var callBuff = StringBuffer()
        callBuff.append("\n 날짜 : 구분 : 전화번호 : 통화시간\n\n")
        c.moveToFirst()
        do{
            var callDate = c.getLong(0)
            var datePattern = SimpleDateFormat("yyyy-MM-dd")
            var date_str = datePattern.format(Date(callDate))
            callBuff.append("$date_str")
            if (c.getInt(1) == CallLog.Calls.INCOMING_TYPE)
                callBuff.append("착신 : ")
            else
                callBuff.append(" 발신 : ")
            callBuff.append(c.getString(2) + " : ")
            callBuff.append(c.getString(3) + "초\n")
        } while (c.moveToNext())

        c.close()
        return callBuff.toString()
    }
}