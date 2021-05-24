package com.example.yddc.util

/**
 * Author: RayleighZ
 * Time: 2021-05-25 0:52
 * 正则匹配 ;|: -> /n
 */

fun insertEnter(raw: String): String = "[;|:]".toRegex().replace(raw, "\n")