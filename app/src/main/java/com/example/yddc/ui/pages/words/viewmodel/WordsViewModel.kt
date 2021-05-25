package com.example.yddc.ui.pages.words.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.yddc.BaseApp
import com.example.yddc.common.toast
import com.example.yddc.model.bean.Word
import com.example.yddc.model.database.WordsModel
import com.example.yddc.util.insertEnter

/**
 * Author: RayleighZ
 * Time: 2021-05-25 1:38
 */
class WordsViewModel : ViewModel() {

    private var curWordIndex = 0
    private var rightAnswer = 0
    private val words by lazy { ArrayList<Word>() }
    lateinit var masterLevelList : Array<Int>

    val wordTitle by lazy { ObservableField<String>() }
    val masterProcess by lazy { ObservableField(0) }
    val wordsSentence by lazy { ObservableField<String>() }
    val meaning by lazy { ObservableField<String>() }
    val tagText by lazy { ObservableField<String>() }

    val selMeaning1 by lazy { ObservableField<String>() }
    val selMeaning2 by lazy { ObservableField<String>() }
    val selMeaning3 by lazy { ObservableField<String>() }
    val selMeaning4 by lazy { ObservableField<String>() }

    val totalProcess by lazy { ObservableField(0) }

    fun getWords() {
        WordsModel.INSTANCE.getWordsFormLocal { wordsLocal ->
            if (wordsLocal.isNullOrEmpty()) {
                //准备从网络获取词库
                WordsModel.INSTANCE.getWordsListFromNet { wordsNet ->
                    words.clear()
                    words.addAll(wordsNet)
                    showCurWords()
                }
            } else {
                words.clear()
                words.addAll(wordsLocal)
                masterLevelList = Array(words.size){ 0 }
                showCurWords()
            }
        }
    }

    fun showNext(){
        totalProcess.set(totalProcess.get()?.plus(1))
        masterLevelList[curWordIndex] = masterProcess.get()!!
        curWordIndex++
        showCurWords()
    }

    private fun showCurWords() {
        words[curWordIndex].apply {
            wordTitle.set(spell)
            wordsSentence.set(insertEnter(sentence))
            meaning.set(clearfix)
            tagText.set(tag)
        }
        masterProcess.set(masterLevelList[curWordIndex])
        loadMeaning()
    }

    //TODO: 实现真正的展示Meaning逻辑
    private fun loadMeaning(){
        //TODO: 必然会数组越界，只是为了模拟数据
        selMeaning1.set(words[curWordIndex + 0].clearfix)
        selMeaning2.set(words[curWordIndex + 1].clearfix)
        selMeaning3.set(words[curWordIndex + 2].clearfix)
        selMeaning4.set(words[curWordIndex + 3].clearfix)
        rightAnswer = 1
    }

    fun judgeAnswer(index: Int){
        if (index == rightAnswer){
            masterProcess.set(masterProcess.get()?.plus( 25))
            BaseApp.context.toast("正确!!")
        } else {
            BaseApp.context.toast("错误~")
        }
    }
}