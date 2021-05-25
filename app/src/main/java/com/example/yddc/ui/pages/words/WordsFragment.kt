package com.example.yddc.ui.pages.words

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.yddc.R
import com.example.yddc.common.BaseFragment
import com.example.yddc.databinding.FragmentWordsBinding
import com.example.yddc.ui.pages.words.viewmodel.WordsViewModel
import com.example.yddc.util.ViewType
import com.example.yddc.util.expandFromLeftConor
import kotlinx.android.synthetic.main.fragment_words.*


/**
 * Author: RayleighZ
 * Time: 2021-05-25 0:17
 */
class WordsFragment : BaseFragment<WordsViewModel>(R.layout.fragment_words) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentWordsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_words, container, false)
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initView()
    }

    private fun initData(){
        viewModel.getWords()
    }

    private fun initView(){
        tv_words_sentence.visibility = View.GONE
        tv_words_clearfix.visibility = View.GONE

        iv_sentence.setOnClickListener {
            if (tv_words_sentence.visibility == View.VISIBLE){
                layout_meaning_choose.expandFromLeftConor(200, ViewType.TYPE_SHOW)
                tv_words_sentence.expandFromLeftConor(200,ViewType.TYPE_HIDE){
                    tv_words_sentence.visibility = View.GONE
                }
            } else {
                layout_meaning_choose.expandFromLeftConor(200, ViewType.TYPE_HIDE)
                tv_words_sentence.visibility = View.VISIBLE
                tv_words_sentence.expandFromLeftConor(200,ViewType.TYPE_SHOW)
            }
        }

        iv_answer.setOnClickListener {
            tv_words_clearfix.isVisible = !tv_words_clearfix.isVisible
        }

        cv_answer1.setOnClickListener {
            viewModel.judgeAnswer(1)
        }
        cv_answer2.setOnClickListener {
            viewModel.judgeAnswer(2)
        }
        cv_answer3.setOnClickListener {
            viewModel.judgeAnswer(3)
        }
        cv_answer4.setOnClickListener {
            viewModel.judgeAnswer(4)
        }

        btn_next.setOnClickListener {
            viewModel.showNext()
        }
    }
}