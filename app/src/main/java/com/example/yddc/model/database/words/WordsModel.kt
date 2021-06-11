package com.example.yddc.model.database.words

import com.example.yddc.BaseApp
import com.example.yddc.common.defaultSharedPreferences
import com.example.yddc.common.editor
import com.example.yddc.common.sharedPreferences
import com.example.yddc.common.toast
import com.example.yddc.model.bean.Word
import com.example.yddc.network.Api
import com.example.yddc.network.api_generator.ApiGenerator
import com.example.yddc.network.api_generator.safeSubscribeBy
import com.example.yddc.util.fakeWords
import com.google.gson.Gson

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

    fun getCurTag(): String? = BaseApp.context.defaultSharedPreferences.getString("words_tag", null)

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
            .safeSubscribeBy(
                onError = {
                    BaseApp.context.toast("服务器状态异常")
                },
                onNext = {
                    BaseApp.context.toast("导入成功!")
                    restoreWords(tag, it)
                    onSuccess?.invoke(it)
                }
            )
    }

    //本地加载词库
    fun getWordsFormLocal(onSuccess: ((words: List<Word>) -> Unit)? = null){
//        WordsDatabase.getInstance().wordsDao()
//            .queryAllWords()
//            .toObservable()
//            .setSchedulers()
//            .safeSubscribeBy {
//                onSuccess?.invoke(it)
//            }
//        getCurTag()?.let {
//            val json = BaseApp.context.sharedPreferences(it).getString("words","[]")
//            val list: List<Word> = Gson().fromJson(json, object : TypeToken<List<Word>>() {}.type)
//            onSuccess?.invoke(list)
//        }
        onSuccess?.invoke(fakeWords)
    }

    //缓存本地Words
    private fun restoreWords(tag: String, words: List<Word>){
//        WordsDatabase.getInstance()
//            .wordsDao()
//            .apply {
//                deleteAllWords()
//                insertWords(words)
//            }
        //因为混编的原因，Room无法使用，暂时不能解决，先用SP紧急处理一下
        BaseApp.context.sharedPreferences(tag).editor {
            putString("words", Gson().toJson(words))
        }
        setCurTag(tag)
    }
}