package com.example.yddc.util

import android.animation.ValueAnimator
import android.view.View
import android.view.animation.DecelerateInterpolator
import androidx.core.animation.doOnEnd

/**
 * Author: RayleighZ
 * Time: 2021-05-25 1:20
 * Describe: 拓展式的View动画
 * 可以进一步封装，可惜时间不够了
 */

enum class ViewType {
    TYPE_HIDE,
    TYPE_SHOW
}

//一个自左上角慢慢展开或者收起的动画
fun View.expandFromLeftConor(duration: Long, finalType: ViewType, onEnd: (()->Unit)? = null) {
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
        this.scaleX = va.animatedValue as Float
    }
    animator.doOnEnd {
        onEnd?.invoke()
    }
    animator.start()
}

fun View.fadedTurn(duration: Long, finalType: ViewType, onEnd: (()->Unit)? = null){
    val animator =
        when (finalType){
            ViewType.TYPE_HIDE -> ValueAnimator.ofFloat(1f, 0f)
            ViewType.TYPE_SHOW -> ValueAnimator.ofFloat(0f, 1f)
        }
    animator.duration = duration
    animator.interpolator = DecelerateInterpolator()
    animator.addUpdateListener { va ->
        this.alpha = va.animatedValue as Float
    }
    animator.doOnEnd {
        onEnd?.invoke()
    }
    animator.start()
}

fun View.verExpand(duration: Long, finalType: ViewType) {
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
    }
    animator.start()
}