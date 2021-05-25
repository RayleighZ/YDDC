package com.example.yddc.ui.pages.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.yddc.ui.pages.mine.MineFragment
import com.example.yddc.ui.pages.process.ProcessFragment

/**
 * Author: RayleighZ
 * Time: 2021-05-26 4:00
 */
class ViewPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    private val processFragment by lazy { ProcessFragment() }
    private val mineFragment by lazy { MineFragment() }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> processFragment
            1 -> mineFragment
            else ->processFragment
        }
    }
}