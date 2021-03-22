package com.example.ch10_e16activity2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.ch10_e16activity2.R.id.btnHap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "메인 액티비티"

        var btnNewActivity = findViewById<Button>(R.id.btnNewActivity)
        btnNewActivity.setOnClickListener {
            var edtNum1 = findViewById<EditText>(R.id.edtNum1)
            var edtNum2 = findViewById<EditText>(R.id.edtNum2)

            var intent = Intent(applicationContext, second::class.java)
            intent.putExtra("Num1", Integer.parseInt(edtNum1.toString()))
            intent.putExtra("Num2", Integer.parseInt(edtNum2.toString()))
            startActivityForResult(intent, 0)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            var rGroup = findViewById<RadioGroup>(R.id.rGroup)
            rGroup.setOnCheckedChangeListener { group, checkedId ->
                when (group.checkedRadioButtonId) {
                    R.id.btnHap -> {
                        var hap = data!!.getIntExtra("HAP", 0)
                        Toast.makeText(applicationContext, "결과 : $hap", Toast.LENGTH_SHORT).show()
                    }
                    R.id.btnSub -> {
                        var sub = data!!.getIntExtra("SUB", 0)
                        Toast.makeText(applicationContext, "결과 : $sub", Toast.LENGTH_SHORT).show()
                    }
                    R.id.btnMul -> {
                        var mul = data!!.getIntExtra("MUL", 0)
                        Toast.makeText(applicationContext, "결과 : $mul", Toast.LENGTH_SHORT).show()
                    }
                    R.id.btnDiv -> {
                        var div = data!!.getIntExtra("DIV", 0)
                        Toast.makeText(applicationContext, "결과 : $div", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}