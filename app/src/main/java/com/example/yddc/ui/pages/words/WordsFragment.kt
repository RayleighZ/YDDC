package com.example.yddc.ui.pages.words

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yddc.R
import com.example.yddc.common.BaseFragment
import com.example.yddc.model.database.WordsDatabase
import com.example.yddc.network.api_generator.setSchedulers
import com.example.yddc.ui.pages.words.viewmodel.WordsViewModel

/**
 * Author: RayleighZ
 * Time: 2021-05-25 0:17
 */
class WordsFragment : BaseFragment<WordsViewModel>(R.layout.fragment_words) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}