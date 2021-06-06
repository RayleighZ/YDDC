package com.example.yddc.common.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.yddc.R
import kotlinx.android.synthetic.main.item_banner.view.*

/**
 * Author: RayleighZ
 * Time: 2021-06-06 22:17
 */
class BaseBannerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val resList by lazy {
        listOf(
            R.drawable.ic_banner1,
            R.drawable.ic_banner2,
            R.drawable.ic_banner3,
            R.drawable.ic_banner4,
            R.drawable.ic_banner5,
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val iv = LayoutInflater.from(parent.context).inflate(R.layout.item_banner, parent, false)
        return object : RecyclerView.ViewHolder(iv){ }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.iv_banner.setImageResource(resList[position % 5])
    }

    override fun getItemCount(): Int = 5
}