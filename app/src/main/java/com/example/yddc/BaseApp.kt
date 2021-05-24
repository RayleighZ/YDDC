package com.example.yddc

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Author: RayleighZ
 * Time: 2021-05-25 2:13
 */
class BaseApp: Application() {
    companion object{
        @SuppressLint("StaticFieldLeak", "CI_StaticFieldLeak")
        lateinit var context: Context
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        context = base
    }
}