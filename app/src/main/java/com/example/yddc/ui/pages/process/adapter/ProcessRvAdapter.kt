package com.example.yddc.ui.pages.process.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yddc.R
import kotlinx.android.synthetic.main.item_process.view.*
import kotlin.math.absoluteValue
import kotlin.math.sin

/**
 * Author: RayleighZ
 * Time: 2021-05-26 5:02
 */
class ProcessRvAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_process, parent, false)
        return object : RecyclerView.ViewHolder(itemView) {}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.tv_week_num.text = "第${position + 1}周   完成度${(sin(position.toDouble()).absoluteValue * 100).toInt()}%"
        holder.itemView.pb_process.progress = (sin(position.toDouble()) * 100).absoluteValue.toInt()
    }

    override fun getItemCount(): Int {
        return 64
    }
}