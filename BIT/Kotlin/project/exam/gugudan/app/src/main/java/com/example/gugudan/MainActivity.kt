package com.example.gugudan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var btnRandom : Button
    lateinit var btnResult : Button
    lateinit var edt1 : EditText
    lateinit var edt2 : EditText
    lateinit var edt3 : EditText
    lateinit var lv : ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edt1 = findViewById<EditText>(R.id.edt1)
        edt2 = findViewById<EditText>(R.id.edt2)
        edt3 = findViewById<EditText>(R.id.edt3)
        btnRandom = findViewById<Button>(R.id.btnRandom)
        btnResult = findViewById<Button>(R.id.btnResult)

        lv = findViewById<ListView>(R.id.lvRs)

        var danResult = ArrayList<String>()
        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,danResult)
        lv.adapter = adapter




        btnRandom.setOnClickListener {

            var random1 = Random.nextInt(1,10)
            var str_rdn1 = random1.toString()
            var random2 = Random.nextInt(1,10)
            var str_rdn2 = random2.toString()
            danResult.clear()
            adapter.notifyDataSetChanged()

            edt1.setText(str_rdn1)
            edt2.setText(str_rdn2)

        }

        btnResult.setOnClickListener {
                danResult.clear()
                adapter.notifyDataSetChanged()

                var str_edt1 = edt1.text.toString()
                var str_edt2 = edt2.text.toString()
                var str_edt3 = edt3.text.toString()

                if (str_edt1 == "" || str_edt2 == "" || str_edt3 == "") {
                    Toast.makeText(this, "값을 입력 해 주세요", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                var i_Result= Integer.parseInt(edt3.text.toString())
                var i_edt1 = Integer.parseInt(edt1.text.toString())
                var i_edt2 = Integer.parseInt(edt2.text.toString())
                var i_edt3 = i_edt1*i_edt2

                if (i_edt1 >= 10 || i_edt2 >= 10) {
                    Toast.makeText(this, "9이하의 수를 입력 해 주세요.", Toast.LENGTH_SHORT).show()
                }else if (i_edt1 <= 0 || i_edt2 <= 0 || i_edt3 <= 0){
                    Toast.makeText(this, "0보다 큰 수 를 입력 해 주세요.",Toast.LENGTH_SHORT).show()
                }else if (i_Result === i_edt3){
                    Toast.makeText(this,"정답입니다!",Toast.LENGTH_SHORT).show()
                }else if (i_Result !== i_edt3) {
                    Toast.makeText(this, "틀렸습니다!", Toast.LENGTH_SHORT).show()
                    for (i in 1..9) {
                        danResult.add(i_edt1.toString() + " * " + i + " = " + i_edt1*i)
                        adapter.notifyDataSetChanged()
                    }
                }
            }
        }
    }