package com.example.yddc.model.bean

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Author: RayleighZ
 * Time: 2021-05-24 15:56
 */
data class UserInfo(
    @SerializedName("id")
    val id: Int,
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("email")
    val email: String
): Serializable
