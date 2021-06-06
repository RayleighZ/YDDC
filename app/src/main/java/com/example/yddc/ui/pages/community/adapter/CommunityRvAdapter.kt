package com.example.yddc.ui.pages.community.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yddc.R
import com.example.yddc.util.fakeContent
import com.example.yddc.util.fakeData
import com.example.yddc.util.fakeImage
import com.example.yddc.util.fakeName
import kotlinx.android.synthetic.main.item_community.view.*
import kotlin.random.Random

/**
 * Author: RayleighZ
 * Time: 2021-06-06 22:37
 */
class CommunityRvAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val item =
                LayoutInflater.from(parent.context).inflate(R.layout.item_community, parent, false)
        return object : RecyclerView.ViewHolder(item) {}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.apply {
            val viewList = listOf(
                    iv_community1,
                    iv_community2,
                    iv_community3
            )
            tv_name.text = fakeName[position % 10]
            tv_content.text = fakeContent[position % 10]
            if (fakeData[position].needAdd) {
                for (iv in viewList) {
                    iv.visibility = View.VISIBLE
                }
                for (i in 0 until fakeData[position].count) {
                    viewList[i].apply {
                        setImageResource(fakeImage[fakeData[position].index[i]])
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int = 10


    class InnerViewHolder(itemView: View, val fakeData: FakeData) :
            RecyclerView.ViewHolder(itemView)

    data class FakeData(
            val needAdd: Boolean,
            val count: Int,
            val index: List<Int>
    )
}