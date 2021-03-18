package com.example.ch09_canvas_draw_1

import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Rect
import android.graphics.RectF
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity()
{

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var view1 = MyGraphicView(this)
        setContentView(view1)//xml을 안쓰겠다. 내가 만든 뷰를 쓰겠다
    }

    private class MyGraphicView(context: Context) : View(context) {

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            var paint = Paint()
            paint.isAntiAlias = true
            paint.color = Color.GREEN
            canvas.drawLine(10f, 10f, 300f, 10f, paint)

            paint.color = Color.BLUE
            paint.strokeWidth = 5f
            canvas.drawLine(10f, 30f, 300f, 30f, paint)

            paint.color = Color.RED
            paint.strokeWidth = 0f

            paint.style = Paint.Style.FILL
            var rect1 = Rect(10, 50, 10 + 100, 50 + 100)
            canvas.drawRect(rect1, paint)

            paint.style = Paint.Style.STROKE
            var rect2 = Rect(130, 50, 130 + 100, 50 + 100)
            canvas.drawRect(rect2, paint)

            var rect3 = RectF(250f, 50f, 250f + 100f, 50f + 100f)
            canvas.drawRoundRect(rect3, 20f, 20f, paint)

            canvas.drawCircle(60f, 220f, 50f, paint)

            paint.strokeWidth = 5f
            var path1 = Path()
            path1.moveTo(10f, 290f)
            path1.lineTo(10f + 50f, 290f + 50f)
            path1.lineTo(10f + 100f, 290f)
            path1.lineTo(10f + 150f, 290f + 50f)
            path1.lineTo(10f + 200f, 290f)
            canvas.drawPath(path1, paint)

            paint.strokeWidth = 0f
            paint.textSize = 30f

            canvas.drawText("안드로이드", 10f, 390f, paint)

            //직접풀어보기 1번
            var y = 350f
            paint.strokeWidth = 30f
            canvas.drawLine(30f, y+30f, 300f, y+30f, paint)

            paint.strokeCap = Paint.Cap.ROUND
            canvas.drawLine(30f, y+100f, 300f, y+100f, paint)

            val rectF = RectF()

            rectF.set(60f, y+120f, (60 + y+200).toFloat(), (100 + y+100).toFloat())
            canvas.drawOval(rectF, paint)

            rectF.set(60f, y+170f, (60 + y+100).toFloat(), (170 + y+100).toFloat())
            canvas.drawArc(rectF, 40f, 110f, true, paint)

            paint.color = Color.BLUE
            rectF.set(60f, y+280f, (60 + y+100).toFloat(), (280 + y+100).toFloat())
            canvas.drawRect(rectF, paint)

            paint.color = Color.argb(0x88, 0xff, 0x00, 0x00)
            rectF.set(90f, y+310f, (90 + y+100).toFloat(), (310 + y+100).toFloat())
            canvas.drawRect(rectF, paint)



        }
    }
}