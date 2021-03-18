package com.example.ch09_e09_11_photoshop
import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var ibZoomin: ImageButton
    lateinit var ibZoomout: ImageButton
    lateinit var ibRotate: ImageButton
    lateinit var ibBright: ImageButton
    lateinit var ibDark: ImageButton
    lateinit var ibGray: ImageButton
    lateinit var graphicView: MyGraphicView
    companion object {
        var sX = 1f
        var sY = 1f
        var angle = 0f
        var color = 1f
        var satur = 1f
    }

    private fun clickIcons() {
        ibZoomin = findViewById<ImageButton>(R.id.ibZoomin)
        ibZoomout = findViewById<ImageButton>(R.id.ibZoomout)
        ibRotate = findViewById<View>(R.id.ibRotate) as ImageButton
        ibBright = findViewById<View>(R.id.ibBright) as ImageButton
        ibDark = findViewById<View>(R.id.ibDark) as ImageButton
        ibGray = findViewById<ImageButton>(R.id.ibGray)

        ibZoomin.setOnClickListener {
            sX += 0.2f
            sY += 0.2f
            graphicView.invalidate()
        }
        ibZoomout.setOnClickListener {
            sX -= 0.2f
            sY -= 0.2f
            graphicView.invalidate()
        }
        ibRotate.setOnClickListener {
            angle += 20
            graphicView.invalidate()
        }
        ibBright.setOnClickListener {
            color += 0.2f
            graphicView.invalidate()
        }
        ibDark.setOnClickListener {
            color -= 0.2f
            graphicView.invalidate()
        }
        ibGray.setOnClickListener {
            if (satur == 0f)
                satur = 1f
            else
                satur = 0f
            graphicView.invalidate()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "미니 포토샵"
        var pictureLayout = findViewById<LinearLayout>(R.id.pictureLayout)
        graphicView = MyGraphicView(this)
        pictureLayout.addView(graphicView)
        clickIcons()
    }


    class MyGraphicView(context: Context) : View(context) {
        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)

            var picture = BitmapFactory.decodeResource(resources, R.drawable.lena256)
            var picX = (this.width - picture.width) / 2f
            var picY = (this.height - picture.height) / 2f
            canvas!!.drawBitmap(picture, picX, picY, null)
            var cenX = this.width / 2f
            var cenY = this.height /2f
            /*밝기변경을 위함*/
            val paint = Paint()
            val array = floatArrayOf(
                color,0f,0f,0f,0f,
                0f, color,0f,0f,0f,
                0f,0f,color,0f,0f,
                0f,0f,0f,color,0f,
                0f,0f,0f,0f, color
            )
            val cm = ColorMatrix(array)
            paint.colorFilter = ColorMatrixColorFilter(cm)

            canvas.scale(sX,sY,cenX,cenY)
            canvas.rotate(angle,cenX,cenY)
            canvas.drawBitmap(picture,picX,picY,paint)
            if (satur == 0f){ cm.setSaturation(satur) }
            picture.recycle()
        }
    }
}


