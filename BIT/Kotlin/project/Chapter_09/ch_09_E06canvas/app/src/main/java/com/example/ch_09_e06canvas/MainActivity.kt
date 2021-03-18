package com.example.ch_09_e06canvas

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyGraphiceView(this))
    }

    private class MyGraphiceView(context: Context) : View(context){
        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)
            var picture = BitmapFactory.decodeResource(resources,R.drawable.jeju14)
            var cenX = this.width / 2f
            var cenY = this.height / 2f
            var picX = (this.width - picture.width) /2f
            var picY = (this.height - picture.height) /2f
            canvas!!.drawBitmap(picture,picX,picY,null)
            picture.recycle()

        }
    }

}