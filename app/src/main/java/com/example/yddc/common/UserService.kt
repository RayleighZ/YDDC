package com.example.yddc.common

import com.example.yddc.BaseApp
import com.example.yddc.model.bean.UserInfo
import com.google.gson.Gson

/**
 * Author: RayleighZ
 * Time: 2021-05-25 2:05
 * Describe: 用户中心，缓存用户的个人信息
 */
object UserService {
    private val USER_INFO_KEY = "user_info"

    val userInfo by lazy {

    }

    fun getUserInfo(): UserInfo? = Gson().fromJson(
        BaseApp.context.defaultSharedPreferences.getString(USER_INFO_KEY, ""),
        UserInfo::class.java
    )

    fun setUserInfo(info: UserInfo) {
        BaseApp.context.defaultSharedPreferences.editor {
            putString(USER_INFO_KEY, Gson().toJson(info))
        }
    }
}