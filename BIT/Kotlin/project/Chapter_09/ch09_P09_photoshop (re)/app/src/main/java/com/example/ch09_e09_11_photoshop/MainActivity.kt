package com.example.ch09_e09_11_photoshop
import android.content.Context
import android.graphics.*
import android.graphics.BlurMaskFilter.*
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
    lateinit var ibBlur: ImageButton
    lateinit var ibEmboss: ImageButton
    lateinit var graphicView: MyGraphicView

    companion object {
        var sX = 1f
        var sY = 1f
        var angle = 0f
        var color = 1f
        var satur = 1f
        var blurNum = 0
        var embossNum = 0
    }

    private fun clickIcons() {
        ibZoomin = findViewById<ImageButton>(R.id.ibZoomin)
        ibZoomout = findViewById<ImageButton>(R.id.ibZoomout)
        ibRotate = findViewById<View>(R.id.ibRotate) as ImageButton
        ibBright = findViewById<View>(R.id.ibBright) as ImageButton
        ibDark = findViewById<View>(R.id.ibDark) as ImageButton
        ibBlur = findViewById<ImageButton>(R.id.ibBlur)
        ibEmboss = findViewById<ImageButton>(R.id.ibEmboss)


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
        ibBlur.setOnClickListener {
            if (blurNum == 0){
                blurNum = 1
            }else{
                blurNum = 0
            }
            graphicView.invalidate()
        }
        ibEmboss.setOnClickListener {
            if (embossNum == 0){
                embossNum = 1
            }else{
                embossNum = 0
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
            var cenX = this.width / 2f
            var cenY = this.height /2f
            /*밝기변경을 위함*/
            val paint = Paint()
            val array = floatArrayOf(
                color,0f,0f,0f,0f,
                0f, color,0f,0f,0f,
                0f,0f,color,0f,0f,
                0f,0f,0f,color,0f,
                0f,0f,0f,1f, 0f
            )
            val cm = ColorMatrix(array)
            var bMask: BlurMaskFilter
            var emboss : EmbossMaskFilter

            if (blurNum == 1) {
                bMask = BlurMaskFilter(100f,Blur.SOLID)
                paint.maskFilter = bMask
            }
            if (embossNum == 1){
                emboss = EmbossMaskFilter(floatArrayOf(0.4f,0.4f,0.4f),1f,5f,5f)
                paint.maskFilter = emboss
            }else{
                paint.maskFilter = null
            }




            paint.colorFilter = ColorMatrixColorFilter(cm)
            canvas!!.drawBitmap(picture,picX,picY,paint)
            canvas!!.scale(sX,sY,cenX,cenY)
            canvas!!.rotate(angle,cenX,cenY)
            if (satur == 0f){cm.setSaturation(satur)}
            picture.recycle()
        }
    }
}


