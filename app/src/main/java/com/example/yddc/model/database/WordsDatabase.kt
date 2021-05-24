package com.example.yddc.model.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.yddc.BaseApp
import com.example.yddc.common.defaultSharedPreferences
import com.example.yddc.common.editor
import com.example.yddc.model.bean.Word

/**
 * Author: RayleighZ
 * Time: 2021-05-25 2:50
 */
@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class WordsDatabase : RoomDatabase() {
    abstract fun wordsDao(): WordsDao

    companion object{
        val INSTANCE by lazy {
            Room.databaseBuilder(BaseApp.context,
                WordsDatabase::class.java, "words_database")
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}