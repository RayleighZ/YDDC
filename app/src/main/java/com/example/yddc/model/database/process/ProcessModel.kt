package com.example.yddc.model.database.process

import com.example.yddc.model.bean.WeekProcess
import com.example.yddc.util.fakeWeekProcess

/**
 * Author: RayleighZ
 * Time: 2021-06-10 20:58
 * 用户历史信息统计
 */
object ProcessModel {
    //获取用户的本周目标
    fun getWeekProcess(weekNum: Int): WeekProcess{
        return fakeWeekProcess
    }
}