package com.example.yddc.model.bean

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Author: RayleighZ
 * Time: 2021-05-24 15:59
 */
@Entity(primaryKeys = ["id"], tableName = "words")
data class Word(
    @SerializedName("id")
    val id: Int,
    @SerializedName("spell")
    val spell: String,
    @SerializedName("clearfix")
    val clearfix: String,
    @SerializedName("sentence")
    val sentence: String,
    @SerializedName("tag")
    val tag: String,
    @SerializedName("word_deformation")
    val word_deformation: String = "",
    @SerializedName("href")
    val href: String = "",
    @SerializedName("audio")
    val audio: String = ""
): Serializable
