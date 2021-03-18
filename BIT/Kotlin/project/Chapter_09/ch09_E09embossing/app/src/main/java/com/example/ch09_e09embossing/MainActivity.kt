package com.example.ch09_e09embossing

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.graphics.EmbossMaskFilter as EmbossMaskFilter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyGraphicView(this))
    }

    private class MyGraphicView(context: Context) : View(context) {

        @SuppressLint("DrawAllocation")
        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            var cenX = this.width /2f
            var cenY = this.height/2f

            var paint = Paint()
            paint.color = Color.GRAY

            var eMask : EmbossMaskFilter = EmbossMaskFilter(floatArrayOf(3f,8f,1f),0.9f,6f,10f)
            paint.maskFilter = eMask
            canvas.drawCircle(cenX+300,cenY+300,150f,paint)

//            eMask = EmbossMaskFilter(floatArrayOf(10f,3f,3f),0.5f,5f,10f)
//            paint.maskFilter = eMask
//            canvas.drawCircle(cenX,cenY+300,150f,paint)

//            eMask = EmbossMaskFilter(floatArrayOf(3f,10f,3f),1f,8f,10f)
//            paint.maskFilter = eMask
//            canvas.drawCircle(cenX+300,cenY,150f,paint)

//            eMask = EmbossMaskFilter(floatArrayOf(3f,3f,10f),3f,3f,10f)
//            paint.maskFilter = eMask
//            canvas.drawCircle(cenX,cenY,150f,paint)





        }
}
}