package com.example.yddc.model.database.words

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.yddc.model.bean.Word
import io.reactivex.Flowable

/**
 * Author: RayleighZ
 * Time: 2021-05-25 2:40
 */
@Dao
interface WordsDao {
    @Insert
    fun insertWords(words: List<Word>)

    @Query("DELETE FROM words")
    fun deleteAllWords()

    @Query("SELECT * FROM words")
    fun queryAllWords(): Flowable<List<Word>>
}