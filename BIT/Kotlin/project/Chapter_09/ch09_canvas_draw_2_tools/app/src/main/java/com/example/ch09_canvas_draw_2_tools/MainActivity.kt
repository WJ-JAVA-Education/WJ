package com.example.ch09_canvas_draw_2_tools

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    companion object {
        const val LINE = 1
        const val CIRCLE = 2
        var curShape = LINE

        const val RECTANGLE = 3//모드추가
        var curColor = Color.DKGRAY//색상 변수 추가
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyGraphicView(this))
        title = "간단 그림판"
    }

    override fun onCreateOptionsMenu(menu: Menu?) : Boolean {
        super.onCreateOptionsMenu(menu)
        menu!!.add(0, 1, 0, "선 그리기")
        menu!!.add(0, 2, 0, "원 그리기")

        menu.add(0, 3, 0, "사각형 그리기")
        val sMenu = menu.addSubMenu("색상 변경 >>")
        sMenu.add(0, 4, 0, "빨강")
        sMenu.add(0, 5, 0, "초록")
        sMenu.add(0, 6, 0, "파랑")

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        when (item.itemId) {
            1 -> {
                curShape = LINE // 선
                return true
            }
            2 -> {
                curShape = CIRCLE // 원
                return true
            }

            3 -> {
                curShape = RECTANGLE // 사각형
                return true
            }
            4 -> {
                curColor = Color.RED
                return true
            }
            5 -> {
                curColor = Color.GREEN
                return true
            }
            6 -> {
                curColor = Color.BLUE
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private class MyGraphicView(context: Context) : View(context) {
        var startX = -1f
        var startY = -1f
        var stopX = -1f
        var stopY = -1f
        override fun onTouchEvent(event: MotionEvent?) : Boolean {
            when (event!!.action) {
                MotionEvent.ACTION_DOWN -> {
                    startX = event.x
                    startY = event.y
                }
                MotionEvent.ACTION_MOVE, MotionEvent.ACTION_UP -> {
                    stopX = event.x
                    stopY = event.y
                    this.invalidate()
                }
            }
            return true
        }

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val paint = Paint()
            paint.isAntiAlias = true
            paint.strokeWidth = 5f
            paint.style = Paint.Style.STROKE
//            paint.color = Color.RED
            paint.color = curColor

            when (curShape) {
                LINE -> canvas.drawLine(startX, startY, stopX, stopY, paint)
                CIRCLE -> {
                    var radius = Math.sqrt(Math.pow((stopX - startX).toDouble(), 2.0) + Math.pow((stopY - startY).toDouble(), 2.0))
                    canvas.drawCircle(startX, startY, radius.toFloat(), paint)
                }

                RECTANGLE -> {
                    var rect = RectF(startX, startY, stopX, stopY)
                    canvas.drawRect(rect, paint)
                }
            }
            invalidate()
        }

    }
}
