package com.example.calcurlator_kt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example4_03)
        // 1단계 : 코틀린 객체를 만든다
        lateinit var edit1: EditText
        lateinit var edit2: EditText
        lateinit var btnAdd: Button
        lateinit var btnSub: Button
        lateinit var btnMul: Button
        lateinit var btnDiv: Button
        lateinit var btnDiv2: Button
        lateinit var textResult: TextView


        // 2단계 : xml 객체를 코틀린 객체에 바인딩(연결) 한다.

        // 3단계 : 연결된 코틀린 객체 (예:버튼) 에 이벤트 처리를 한다.
        title = "초간단 계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        btnDiv2 = findViewById<Button>(R.id.BtnDiv2)
        textResult = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnTouchListener { view, motionEvent ->
            var str1 : String = edit1.text.toString()
            var str2 = edit2.text.toString()
            var num1 = str1.toDouble()
            var num2 = str2.toDouble()
            var result = num1 + num2
            textResult.setText(""+result)
            false
        }
        btnSub.setOnTouchListener { view, motionEvent ->

            var str1 : String = edit1.text.toString()
            var str2 = edit2.text.toString()
            var num1 = str1.toDouble()
            var num2 = str2.toDouble()
            var result = num1 - num2
            textResult.setText(""+result)
            false
        }
        btnMul.setOnTouchListener { view, motionEvent ->

            var str1 : String = edit1.text.toString()
            var str2 = edit2.text.toString()
            var num1 = str1.toDouble()
            var num2 = str2.toDouble()
            var result = num1 * num2
            textResult.setText(""+result)
            false
        }
        btnDiv.setOnTouchListener { view, motionEvent ->
            var str1: String = edit1.text.toString()
            var str2 = edit2.text.toString()
            if(str1 == "" || str2 == "")
            {
                Toast.makeText(this,"값을 입력 해 주세요!",Toast.LENGTH_SHORT).show()
            }
            else {
                if(str1 == "0"|| str2 == "0"){
                    Toast.makeText(this,"0으로 나눌수 없습니다!",Toast.LENGTH_SHORT).show()
                }
                var num1 = str1.toDouble()
                var num2 = str2.toDouble()
                var result = num1 / num2
                result = (result * 100).toInt()/100.0
                textResult.setText("" + result)
            }
            false
        }


        btnDiv2.setOnClickListener {
            var str1 : String = edit1.text.toString()
            var str2 = edit2.text.toString()

            if(str1 == "" || str2 == "")
            {
                Toast.makeText(this,"값을 입력 해 주세요!",Toast.LENGTH_SHORT).show()
            }
            else {
                if(str1 == "0"|| str2 == "0"){
                    Toast.makeText(this,"0으로 나눌수 없습니다!",Toast.LENGTH_SHORT).show()
                }
                var num1 = str1.toInt()
                var num2 = str2.toInt()
                var result = num1 % num2
                textResult.setText(result.toString())
            }
        }




    }
}
