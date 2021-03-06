package com.example.ch09_canvas_draw_4_photoshop

import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BlurMaskFilter
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.EmbossMaskFilter
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout

@Suppress("deprecation")
class MainActivity : AppCompatActivity() {

    lateinit var ibZoomin: ImageButton
    lateinit var ibZoomout: ImageButton
    lateinit var ibRotate: ImageButton
    lateinit var ibBright: ImageButton
    lateinit var ibDark: ImageButton
    lateinit var ibBlur: ImageButton
    lateinit var ibEmbos: ImageButton
    lateinit var graphicView: MyGraphicView

    companion object {
        var sX = 1f
        var sY = 1f
        var angle = 0f
        var satur = 1f
        var blur = false
        var embos = false
    }

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "미니 포토샵 (개선)"

        val pictureLayout = findViewById<LinearLayout>(R.id.pictureLayout)
        graphicView = MyGraphicView(this)
        pictureLayout.addView(graphicView)

        clickIcons()
    }

    private fun clickIcons() {
        ibZoomin = findViewById<ImageButton>(R.id.ibZoomin)
        ibZoomin.setOnClickListener {
            sX = sX + 0.2f
            sY = sY + 0.2f
            graphicView.invalidate()
        }

        ibZoomout = findViewById<ImageButton>(R.id.ibZoomout)
        ibZoomout.setOnClickListener {
            sX = sX - 0.2f
            sY = sY - 0.2f
            graphicView.invalidate()
        }

        ibRotate = findViewById<ImageButton>(R.id.ibRotate)
        ibRotate.setOnClickListener {
            angle = angle + 20
            graphicView.invalidate()
        }

        ibBright = findViewById<ImageButton>(R.id.ibBright)
        ibBright.setOnClickListener {
            satur = satur + 0.2f
            graphicView.invalidate()
        }

        ibDark = findViewById<ImageButton>(R.id.ibDark)
        ibDark.setOnClickListener {
            satur = satur - 0.2f
            graphicView.invalidate()
        }

        ibBlur = findViewById<ImageButton>(R.id.ibBlur)
        ibBlur.setOnClickListener {
            if (blur == true)
                blur = false
            else
                blur = true
            graphicView.invalidate()
        }

        ibEmbos = findViewById<ImageButton>(R.id.ibEmbos)
        ibEmbos.setOnClickListener {
            if (embos == true)
                embos = false
            else
                embos = true
            graphicView.invalidate()
        }

    }

    public class MyGraphicView(context: Context) : View(context) {

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)

            val cenX = this.width / 2
            val cenY = this.height / 2
            canvas.scale(sX, sY, cenX.toFloat(), cenY.toFloat())
            canvas.rotate(angle, cenX.toFloat(), cenY.toFloat())

            val paint = Paint()
            val cm = ColorMatrix()
            cm.setSaturation(satur)

            paint.colorFilter = ColorMatrixColorFilter(cm)

            if (blur == true) {
                val bMask: BlurMaskFilter
                bMask = BlurMaskFilter(30f, BlurMaskFilter.Blur.NORMAL)
                paint.maskFilter = bMask
            }

            if (embos == true) {
                val eMask: EmbossMaskFilter
                eMask = EmbossMaskFilter(floatArrayOf(3f, 3f, 3f), 0.5f, 5f,30f)
                paint.maskFilter = eMask
            }

            val picture = BitmapFactory.decodeResource(resources,
                    R.drawable.lena256)
            val picX = (this.width - picture.width) / 2f
            val picY = (this.height - picture.height) / 2f
            canvas.drawBitmap(picture, picX, picY, paint)

            picture.recycle()
        }
    }
}
