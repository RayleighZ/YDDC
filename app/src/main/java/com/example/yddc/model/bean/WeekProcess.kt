package com.example.yddc.model.bean

/**
 * Author: RayleighZ
 * Time: 2021-06-10 21:03
 */
data class WeekProcess(
    var newWordsNum: Int,//要背的新词个数
    var reviewWordsNum: Int,//要复习的单词的个数
    var curNewProcess: Int,//已经背诵的新词的个数
    var curReviewProcess: Int,//已经复习的单词的个数
    //本周
    val dayProcessArrayList: ArrayList<DayProcess>
)
