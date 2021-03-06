package com.example.ch_09_e08blerring

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.BlurMaskFilter
import android.graphics.Canvas
import android.graphics.Paint
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
            var picture = BitmapFactory.decodeResource(resources,R.drawable.lena256)

            var picX = (this.width - picture.width) /2f
            var picY = (this.height - picture.height) /2f

            var paint = Paint()
            var bMask : BlurMaskFilter

            bMask = BlurMaskFilter(30f,BlurMaskFilter.Blur.NORMAL)
            paint.maskFilter = bMask

//            BlurMaskFilter.Blur.NORMAL
//            BlurMaskFilter.Blur.INNER
            BlurMaskFilter.Blur.OUTER
//            BlurMaskFilter.Blur.SOLID

            canvas!!.drawBitmap(picture,picX,picY,paint)
            picture.recycle()



        }
    }
}