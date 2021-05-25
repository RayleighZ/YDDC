package com.example.yddc.ui.pages.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import com.example.yddc.BaseApp
import com.example.yddc.R
import com.example.yddc.common.getStatusBarHeight
import com.example.yddc.common.toast
import com.example.yddc.common.topPadding
import com.example.yddc.network.Api
import com.example.yddc.network.api_generator.ApiGenerator
import com.example.yddc.network.api_generator.safeSubscribeBy
import com.example.yddc.network.api_generator.setSchedulers
import com.example.yddc.ui.pages.main.adapter.ViewPagerAdapter
import com.example.yddc.ui.pages.words.StartRemFragment
import com.example.yddc.ui.pages.words.WordsFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_rem_words.*


/**
 * Author: RayleighZ
 * Time: 2021-05-25 1:34
 */
class MainActivity : FragmentActivity() {

    private val wordsFragment by lazy { WordsFragment() }
    private val startRemFragment by lazy { StartRemFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {

        ApiGenerator.getApiService(Api::class.java)
            .getWordById(166928)
            .setSchedulers()
            .safeSubscribeBy(
                onNext = {
                    Log.d("RayleighZ", it.toString())
                },
                onError = {
                    Log.d("RayleighZ", it.toString())
                }
            )

        vp_main.adapter = ViewPagerAdapter(this)
        vp_main.isUserInputEnabled = false

        bnv_main.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_main_bottom_calendar -> {
                    vp_main.currentItem = 0
                }
                R.id.menu_main_bottom_comment -> {
                    BaseApp.context.toast("此功能正在开发")
                }
                R.id.menu_main_bottom_mine -> {
                    vp_main.currentItem = 1
                }
            }
            true
        }

        supportFragmentManager.commit {
            replace(R.id.fcv_main_word_glance, startRemFragment, "startRem")
            show(startRemFragment)
        }
        val bottomSheetBehavior = BottomSheetBehavior.from(fcv_main_word_glance)

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                startRemFragment.cv_photo?.alpha = slideOffset
                wordsFragment.cv_photo?.alpha = slideOffset
            }

        })

        bottomSheetBehavior.peekHeight =
            bottomSheetBehavior.peekHeight + fcv_main_word_glance.topPadding
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    fun startRemWords() {
        supportFragmentManager.commit {
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            replace(R.id.fcv_main_word_glance, wordsFragment, "wordsFragment")
            addToBackStack("startRem")
            show(wordsFragment)
        }
    }
}