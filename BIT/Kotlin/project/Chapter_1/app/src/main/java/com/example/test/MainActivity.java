package com.example.test;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int num1 , num2;
    Integer result;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.example4_03);

        TextView textResult = findViewById(R.id.TextResult);{
        EditText edit1 = findViewById(R.id.Edit1);
        EditText edit2 = findViewById(R.id.Edit2);
        Button btnAdd = findViewById(R.id.BtnAdd);
        Button btnSub = findViewById(R.id.BtnSub);
        Button btnMul = findViewById(R.id.BtnMul);
        Button btnDiv = findViewById(R.id.BtnDiv);
        Button btnDiv2 = findViewById(R.id.BtnDiv2);

        setTitle("초간단 계산기");



        btnAdd.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = (num1) + (num2);
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = (num1) * (num2);
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = (num1) / (num2);
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnDiv2.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = (num1) % (num2);
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = (num1) - (num2);
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });





    }



}
