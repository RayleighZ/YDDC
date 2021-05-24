package com.example.yddc.util

import android.animation.ValueAnimator
import android.view.View
import android.view.animation.DecelerateInterpolator

/**
 * Author: RayleighZ
 * Time: 2021-05-25 1:20
 * Describe: 拓展式的View动画
 */

enum class ViewType {
    TYPE_HIDE,
    TYPE_SHOW
}

//一个自左上角慢慢展开或者收起的动画
fun View.changeState(duration: Long, finalType: ViewType) {
    val animator =
        when (finalType){
            ViewType.TYPE_HIDE -> ValueAnimator.ofFloat(1f, 0f)
            ViewType.TYPE_SHOW -> ValueAnimator.ofFloat(0f, 1f)
        }
    animator.duration = duration
    animator.interpolator = DecelerateInterpolator()
    //设置缩放锚点
    this.apply {
        pivotX = 0f
        pivotY = 0f
    }
    animator.addUpdateListener { va ->
        this.scaleY = va.animatedValue as Float
        this.scaleY = va.animatedValue as Float
    }
    animator.start()
}