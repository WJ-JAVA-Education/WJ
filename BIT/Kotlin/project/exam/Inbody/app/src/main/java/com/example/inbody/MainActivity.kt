package com.example.inbody

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener {
    lateinit var edt_cm: EditText
    lateinit var edt_kg: EditText
    lateinit var rb_woman: RadioButton
    lateinit var rb_man: RadioButton
    lateinit var spinner1: Spinner
    lateinit var drinkBox: CheckBox
    lateinit var smokingBox: CheckBox
    lateinit var excerBox: CheckBox
    lateinit var btnRes: Button
    lateinit var tvG: TextView
    lateinit var tvBmi: TextView
    lateinit var gallery1: Gallery


    var rh = arrayOf("A", "B", "O", "AB")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "BMI 측정기"

        edt_cm = findViewById<EditText>(R.id.edt_cm)
        edt_kg = findViewById<EditText>(R.id.edt_kg)
        rb_woman = findViewById<RadioButton>(R.id.rb_woman)
        rb_man = findViewById<RadioButton>(R.id.rb_man)
        spinner1 = findViewById<Spinner>(R.id.spinner1)
        drinkBox = findViewById<CheckBox>(R.id.drinkBox)
        smokingBox = findViewById<CheckBox>(R.id.smokingBox)
        excerBox = findViewById<CheckBox>(R.id.excerBox)
        btnRes = findViewById<Button>(R.id.btnRes)
        tvG = findViewById<TextView>(R.id.tvG)
        tvBmi = findViewById<TextView>(R.id.tvBmi)
        gallery1 = findViewById<Gallery>(R.id.gallery1)
        var bmi: String



        var adapter_Spinner: ArrayAdapter<String>
        adapter_Spinner = ArrayAdapter(this, android.R.layout.simple_spinner_item, rh)
        spinner1.adapter = adapter_Spinner

        btnRes.setOnClickListener {
            edt_cm.text.toString()
        }




        var galAdapter = MygalleryAdapter(this)
        gallery1.adapter = galAdapter

    }

    inner class MygalleryAdapter(var context: Context) : BaseAdapter() {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var picId = arrayOf(2)

            if (drinkBox.isChecked){
                picId[0] = R.drawable.drinking
            }
            if (smokingBox.isChecked){
                picId[1] = R.drawable.ciga
            }
            if (excerBox.isChecked){
                picId[2] = R.drawable.running
            }


            var imageview = ImageView(context)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview.setPadding(5,5,5,5)
            imageview.setImageResource(picId[position])

            return imageview
        }

        override fun getItem(position: Int): Any {
            TODO("Not yet implemented")
        }

        override fun getItemId(position: Int): Long {
            TODO("Not yet implemented")
        }

        override fun getCount(): Int {
            return -1
        }

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        tvG = findViewById<TextView>(R.id.tvG)
        tvG.setText(position)
        return
    }
}