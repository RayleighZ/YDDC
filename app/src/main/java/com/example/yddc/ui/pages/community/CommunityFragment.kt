package com.example.yddc.ui.pages.community

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yddc.R
import com.example.yddc.common.BaseFragment
import com.example.yddc.common.adapter.BaseBannerAdapter
import com.example.yddc.ui.pages.community.adapter.CommunityRvAdapter
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_community.*
import java.util.*


class CommunityFragment : BaseFragment<CommunityViewModel>(R.layout.fragment_community) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vp_community.adapter = BaseBannerAdapter()
        rv_community.adapter = CommunityRvAdapter()
        rv_community.layoutManager = LinearLayoutManager(requireContext())
        val mHandler = MyHandler(this)
        Thread{
            while (true){
                Thread.sleep(5000)
                mHandler.sendEmptyMessage(1)
            }
        }.start()
    }

    class MyHandler(val fragment: CommunityFragment) : Handler(Looper.myLooper()!!){

        var count = 0

        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            count ++
            fragment.vp_community.currentItem = count % 5
        }
    }
}