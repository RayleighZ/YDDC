package com.example.yddc.ui.widget

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/**
 * Author: RayleighZ
 * Time: 2021-06-12 20:33
 */
class DoubleColorProcessBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle) {
    private val paint by lazy {
        Paint()
    }

    private val linearGradientBlue by lazy {
        LinearGradient(
            0f,
            height.toFloat(),
            width.toFloat(),
            height.toFloat(),
            Color.parseColor("#00000000"),
            Color.parseColor("#66FFCC"),
            Shader.TileMode.REPEAT
        )
    }

    private val linearGradientPink by lazy {
        LinearGradient(
            0f,
            height.toFloat(),
            width.toFloat(),
            height.toFloat(),
            Color.parseColor("#00000000"),
            Color.parseColor("#FF69B4"),
            Shader.TileMode.REPEAT
        )
    }

    var totalProcess = 100f
    var processOne = 45f
    var processTwo = 25f

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val lengthOne = width * processOne / totalProcess
        val lengthTwo = lengthOne + width * processTwo / totalProcess

        paint.color = Color.parseColor("#2D2D2D2D")// = linearGradientPink

        canvas?.drawRoundRect(
            0f,
            0f,
            width.toFloat(),
            height.toFloat(),
            width / 2f,
            width / 2f,
            paint
        )

        paint.color = Color.parseColor("#FF69B4")// = linearGradientPink

        canvas?.drawRoundRect(0f, 0f, lengthTwo, height.toFloat(), width / 2f, width / 2f, paint)

        paint.color = Color.parseColor("#66CCFF")// = linearGradientBlue

        canvas?.drawRoundRect(0f, 0f, lengthOne, height.toFloat(), width / 2f, width / 2f, paint)
    }
}