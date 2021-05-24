package com.example.yddc.ui.pages.words.viewmodel

import androidx.lifecycle.ViewModel
import com.example.yddc.model.bean.Word
import com.example.yddc.model.database.WordsModel

/**
 * Author: RayleighZ
 * Time: 2021-05-25 1:38
 */
class WordsViewModel : ViewModel() {

    private var curWordIndex = 0
    private val words by lazy { ArrayList<Word>() }

    fun getWords(){
        WordsModel.INSTANCE.getWordsFormLocal { wordsLocal ->
            if (wordsLocal.isNullOrEmpty()){
                //准备从网络获取词库
                WordsModel.INSTANCE.getWordsListFromNet { wordsNet ->
                    words.clear()
                    words.addAll(wordsNet)
                }
            } else {
                words.clear()
                words.addAll(wordsLocal)
            }
        }
    }

    fun showCurWords(){

    }
}