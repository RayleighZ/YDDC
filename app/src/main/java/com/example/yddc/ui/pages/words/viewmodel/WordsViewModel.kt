package com.example.yddc.ui.pages.words.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.yddc.BaseApp
import com.example.yddc.common.toast
import com.example.yddc.model.bean.Word
import com.example.yddc.model.database.words.WordsModel
import com.example.yddc.util.insertEnter

/**
 * Author: RayleighZ
 * Time: 2021-05-25 1:38
 */
class WordsViewModel : ViewModel() {

    private var curWordIndex = 0
    private var rightAnswer = 0
    private var rightCount = Array(20){0}
    private var ifFavorite = Array(20){0}
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
        if(curWordIndex<19) {
            totalProcess.set(totalProcess.get()?.plus(1))
            masterLevelList[curWordIndex] = masterProcess.get()!!
            curWordIndex++
            showCurWords()
        }
    }

    fun showLast(){
        if(curWordIndex>0) {
            totalProcess.set(totalProcess.get()?.minus(1))
            masterLevelList[curWordIndex] = masterProcess.get()!!
            curWordIndex--
            showCurWords()
        }
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

    private val selMeaningList = listOf(
        selMeaning1,
        selMeaning2,
        selMeaning3,
        selMeaning4
    )

    //TODO: 实现真正的展示Meaning逻辑
    private fun loadMeaning(){
        rightAnswer = java.util.Random().nextInt(4)
        for (i in selMeaningList.indices){
            if (i == rightAnswer - 1){
                selMeaningList[rightAnswer - 1].set(words[curWordIndex].clearfix)
            } else {
                selMeaningList[i].set(words[java.util.Random().nextInt(19)].clearfix)
            }
        }
    }

    /**
     * 仍然经常全错
     */
    fun judgeAnswer(index: Int){
        if (index == rightAnswer){
            masterProcess.set(masterProcess.get()?.plus( 25))
            BaseApp.context.toast("正确!!")
            if(rightCount[curWordIndex]<5)
                rightCount[curWordIndex]++
        } else {
            BaseApp.context.toast("错误~")
            //以下两行仅供测试显示用，总是错误的问题改后删除
            if(rightCount[curWordIndex]<5)
                rightCount[curWordIndex]++
        }
    }

    fun favorite(): Int{
        if(ifFavorite[curWordIndex]==0){
            ifFavorite[curWordIndex]=1
        }else {
            ifFavorite[curWordIndex]=0
        }
        return ifFavorite[curWordIndex]
    }

    fun getStarNum():Int{
        return rightCount[curWordIndex]
    }
}