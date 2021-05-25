package com.example.yddc.ui.pages.process

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yddc.BaseApp
import com.example.yddc.R
import com.example.yddc.common.BaseFragment
import com.example.yddc.common.toast
import com.example.yddc.model.database.WordsModel
import com.example.yddc.network.Api
import com.example.yddc.network.api_generator.ApiGenerator
import com.example.yddc.network.api_generator.safeSubscribeBy
import com.example.yddc.network.api_generator.setSchedulers
import com.example.yddc.ui.pages.process.adapter.ProcessRvAdapter
import kotlinx.android.synthetic.main.fragment_process.*

/**
 * Author: RayleighZ
 * Time: 2021-05-26 3:15
 */
class ProcessFragment : BaseFragment<ProcessViewModel>(R.layout.fragment_process) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_process.adapter = ProcessRvAdapter()
        rv_process.layoutManager = LinearLayoutManager(requireContext())
        tv_reload.setOnClickListener {
            WordsModel.INSTANCE.apply {
                setCurTag("CET6")
                getWordsListFromNet()
            }
        }
    }
}