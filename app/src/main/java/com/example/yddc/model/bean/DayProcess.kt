package com.example.yddc.model.bean

/**
 * Author: RayleighZ
 * Time: 2021-06-10 21:06
 */
data class DayProcess(
    //标识用户这一天每一个时间段的单词进度
    //参数1为0~11五个整数, 分别表示0~2, 2~4, 4~6.....22~24这12个时间段
    //参数2为此时间段对应的单词个数
    var hourProcessArrayList: ArrayList<Int>,
    var dayTotalProcess: Int,//用户此天的总单词个数
    var dayTotalGoal: Int,//用户此天的总目标个数
    var dayStuTimeByMin: Int,//用户此天的学习时长, 单位为分钟
)
