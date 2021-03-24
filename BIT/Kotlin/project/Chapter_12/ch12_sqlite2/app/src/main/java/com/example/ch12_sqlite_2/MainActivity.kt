package com.example.ch12_sqlite_2

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var myHelper: myDBHelper
    lateinit var edtName : EditText
    lateinit var edtCount : EditText
    lateinit var edtNameResult: EditText
    lateinit var edtCountResult: EditText
    lateinit var btnInit : Button
    lateinit var btnInput : Button
    lateinit var btnSelect : Button
    lateinit var btnUdt : Button
    lateinit var btnDel : Button
    lateinit var sqlDB : SQLiteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "가수 그룹 관리 DB"

        edtName = findViewById<EditText>(R.id.edtName)
        edtCount = findViewById<EditText>(R.id.edtCount)
        edtNameResult = findViewById<EditText>(R.id.edtResultName)
        edtCountResult = findViewById<EditText>(R.id.edtResultCount)
        btnInit = findViewById<Button>(R.id.btnInit)
        btnInput = findViewById<Button>(R.id.btnInput)
        btnSelect = findViewById<Button>(R.id.btnSelect)
        btnUdt = findViewById<Button>(R.id.btnUdt)
        btnDel = findViewById<Button>(R.id.btnDel)

        myHelper = myDBHelper(this)

        btnInit.setOnClickListener {
             sqlDB = myHelper.writableDatabase
             myHelper.onUpgrade(sqlDB, 1 , 2)
            sqlDB.close()
        }

        btnInput.setOnClickListener {
            sqlDB = myHelper.writableDatabase
            sqlDB.execSQL("insert into groupTBL values ('"+edtName.text.toString() + "',"+ edtCount.text.toString() + ");")
            sqlDB.close()
            Toast.makeText(this,"입력됨",Toast.LENGTH_SHORT).show()
        }
        btnSelect.setOnClickListener {
            sqlDB = myHelper.readableDatabase
            var cursor : Cursor
            cursor = sqlDB.rawQuery("select * from groupTBL;", null)

            var strNames = "그룹이름" + "\r\n" + "________" + "\r\n"
            var strCount = "인원" + "\r\n" + "________" + "\r\n"

            while (cursor.moveToNext()){
                strNames += cursor.getString(0) + "\r\n"
                strCount += cursor.getString(1) + "\r\n"
            }

            edtNameResult.setText(strNames)
            edtCountResult.setText(strCount)


            cursor.close()
            sqlDB.close()

            Toast.makeText(this,"조회완료",Toast.LENGTH_SHORT).show()
        }

        btnUdt.setOnClickListener {
           var udtName = edtName.text.toString()
           var udtCount = edtCount.text.toString()

            sqlDB = myHelper.writableDatabase
            sqlDB.execSQL("update groupTBL set gNumber = $udtCount where gName = $udtName;")

            var cursor : Cursor
            cursor = sqlDB.rawQuery("select * from groupTBL;", null)

            var strNames = "그룹이름" + "\r\n" + "________" + "\r\n"
            var strCount = "인원" + "\r\n" + "________" + "\r\n"

            if (cursor.moveToNext()){
                strNames += cursor.getString(0) + "\r\n"
                strCount += cursor.getString(1) + "\r\n"
            }

            edtNameResult.setText(strNames)
            edtCountResult.setText(strCount)

            cursor.close()
            sqlDB.close()

            Toast.makeText(this,"수정됨",Toast.LENGTH_SHORT).show()
        }

        btnDel.setOnClickListener {
            var udtName = edtName.text.toString()
            var udtCount = edtCount.text.toString()
            sqlDB = myHelper.writableDatabase
            if (udtName !== "") {
                sqlDB.execSQL("delete from groupTBL where gName = $udtName;")
            }
            var cursor : Cursor
            cursor = sqlDB.rawQuery("select * from groupTBL;", null)

            var strNames = "그룹이름" + "\r\n" + "________" + "\r\n"
            var strCount = "인원" + "\r\n" + "________" + "\r\n"

            if (cursor.moveToNext()){
                strNames += cursor.getString(0) + "\r\n"
                strCount += cursor.getString(1) + "\r\n"
            }
            edtNameResult.setText(strNames)
            edtCountResult.setText(strCount)
            cursor.close()
            sqlDB.close()
            Toast.makeText(this,"삭제됨",Toast.LENGTH_SHORT).show()
        }
    }

    inner class myDBHelper(context: Context) : SQLiteOpenHelper(context,"groupDB",null,1){
        override fun onCreate(db: SQLiteDatabase?) {
            db!!.execSQL("create table groupTBL(gName char(20) PRIMARY KEY, gNumber INTEGER);")
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            db!!.execSQL("DROP TABLE IF EXISTS groupTBL")
            onCreate(db)
        }

    }
}