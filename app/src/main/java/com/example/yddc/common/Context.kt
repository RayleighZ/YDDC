package com.example.yddc.common

import android.content.Context
import android.content.SharedPreferences
import android.widget.BaseAdapter
import android.widget.Toast
import com.example.yddc.BaseApp
import com.example.yddc.config.Config.DEFAULT_SP_NAME

/**
 * Author: RayleighZ
 * Time: 2021-05-25 2:07
 */

val Context.defaultSharedPreferences get() = sharedPreferences(DEFAULT_SP_NAME)
fun Context.sharedPreferences(name: String): SharedPreferences = getSharedPreferences(name, Context.MODE_PRIVATE)
fun SharedPreferences.editor(editorBuilder: SharedPreferences.Editor.() -> Unit) = edit().apply(editorBuilder).apply()
fun Context.toast(text: String) = Toast.makeText(BaseApp.context, text, Toast.LENGTH_SHORT).show()