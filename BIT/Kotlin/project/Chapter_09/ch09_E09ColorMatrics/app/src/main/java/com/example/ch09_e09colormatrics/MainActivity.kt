package com.example.ch09_e09colormatrics

import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyGraphicView(this))
    }

    private class MyGraphicView(context: Context) : View(context) {
        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)

            var picture = BitmapFactory.decodeResource(resources, R.drawable.lena256)

            var picX = (this.width - picture.width) /2f
            var picY = (this.height - picture.height) /2f

            var paint = Paint()
            var array = floatArrayOf(
                    2f,0f,0f,0f,-25f,
                    0f,2f,0f,0f,-25f,
                    0f,0f,2f,0f,-25f,
                    0f,0f,0f,1f,0f)
            var cm = ColorMatrix(array)
            paint.colorFilter = ColorMatrixColorFilter(cm)
            canvas!!.drawBitmap(picture,picX,picY,paint)
            picture.recycle()
        }
    }
}