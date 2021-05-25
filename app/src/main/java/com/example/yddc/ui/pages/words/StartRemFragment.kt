package com.example.yddc.ui.pages.words

import android.os.Bundle
import android.view.View
import com.example.yddc.R
import com.example.yddc.common.BaseFragment
import com.example.yddc.ui.pages.main.MainActivity
import com.example.yddc.ui.pages.words.viewmodel.StartRemViewModel
import kotlinx.android.synthetic.main.fragment_rem_words.*
import kotlinx.android.synthetic.main.fragment_rem_words.cv_photo
import kotlinx.android.synthetic.main.fragment_words.*

/**
 * Author: RayleighZ
 * Time: 2021-05-25 20:43
 */
class StartRemFragment: BaseFragment<StartRemViewModel>(R.layout.fragment_rem_words) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_start_rem.setOnClickListener {
            (activity as MainActivity).startRemWords()
        }
        cv_photo.alpha = 0f
    }
}