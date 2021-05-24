package com.example.yddc.model.database

import com.example.yddc.BaseApp
import com.example.yddc.common.defaultSharedPreferences
import com.example.yddc.common.editor
import com.example.yddc.common.toast
import com.example.yddc.model.bean.Word
import com.example.yddc.network.Api
import com.example.yddc.network.api_generator.ApiGenerator
import com.example.yddc.network.api_generator.safeSubscribeBy
import com.example.yddc.network.api_generator.setSchedulers

/**
 * Author: RayleighZ
 * Time: 2021-05-25 3:10
 */
class WordsModel {

    companion object{
        val INSTANCE by lazy {
            WordsModel()
        }
    }

    fun getCurTag(): String? = BaseApp.context.defaultSharedPreferences.getString("words_tag", "")

    fun setCurTag(tag: String) = BaseApp.context.defaultSharedPreferences.editor {
        putString("words_tag", tag)
    }

    //通过tag在线获取单词词库
    fun getWordsListFromNet(tag: String? = getCurTag(), onSuccess: ((words: List<Word>)->Unit)? = null) {
        if (tag == null || tag == "" ){
            BaseApp.context.toast("暂时还没有载入词库哦")
            return
        }
        ApiGenerator.getApiService(Api::class.java)
            .getWordByTAG(
                tag
            )
            .safeSubscribeBy {
                restoreWords(tag, it)
                onSuccess?.invoke(it)
            }
    }

    //本地加载词库
    fun getWordsFormLocal(onSuccess: ((words: List<Word>) -> Unit)? = null){
        WordsDatabase.INSTANCE.wordsDao()
            .queryAllWords()
            .toObservable()
            .setSchedulers()
            .safeSubscribeBy {
                onSuccess?.invoke(it)
            }
    }

    //缓存本地Words
    private fun restoreWords(tag: String, words: List<Word>){
        WordsDatabase.INSTANCE
            .wordsDao()
            .apply {
                deleteAllWords()
                insertWords(words)
            }
        setCurTag(tag)
    }
}