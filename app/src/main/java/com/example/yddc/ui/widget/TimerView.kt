package com.example.yddc.ui.widget

import android.content.Context
import android.graphics.BlurMaskFilter
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

/**
 * Author: RayleighZ
 * Time: 2021-05-25 20:57
 */
class TimerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle) {
    private val blurPaint by lazy {
        Paint()
    }

    private val ringPaint by lazy {
        Paint()
    }

    private val xyList = listOf(
        Pair(210f, 187f),
        Pair(166f, 147f),
        Pair(206f, 185f),
        Pair(195f, 200f)
    )

    private val colorList = listOf(
        0xFFBB86FC,
        0xFF6200EE,
        0xFF3700B3,
        0x66ccff.toLong()
    )

    init {
        blurPaint.apply {
            isAntiAlias = true
            //背景颜色(光晕)
            color = 0xFF03DAC5.toInt()
            maskFilter = BlurMaskFilter(105f, BlurMaskFilter.Blur.OUTER)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        //绘制光晕
        val cx = width / 2
        val cy = height / 2
        canvas?.apply {
            drawCircle(cx.toFloat(), cy.toFloat(), 105f, blurPaint)

            //绘制外部圆环
            for (i in xyList.indices) {
                save()
                ringPaint.setColor(colorList[i])

            }
        }
    }

    private fun getRect(x: Float, y: Float): RectF {
        val paddingX = (width - x) / 2
        val paddingY = (height - y) / 2
        return RectF(paddingX, paddingY, width - paddingX, height - paddingY);
    }
}