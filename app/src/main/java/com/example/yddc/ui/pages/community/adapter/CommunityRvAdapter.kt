package com.example.yddc.ui.pages.community.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yddc.R
import com.example.yddc.util.fakeContent
import com.example.yddc.util.fakeImage
import com.example.yddc.util.fakeName
import kotlinx.android.synthetic.main.item_community.view.*
import kotlin.random.Random

/**
 * Author: RayleighZ
 * Time: 2021-06-06 22:37
 */
class CommunityRvAdapter : RecyclerView.Adapter<CommunityRvAdapter.InnerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.item_community, parent, false)
        val count = Random.nextInt(3) % 3
        val list = List(count){
            0
        }.toMutableList()
        for (i in 0 until count){
            list[i] = Random.nextInt(3) % 3
        }
        return InnerViewHolder(
            item, FakeData(
                Random.nextBoolean(),
                Random.nextInt(3) % 3,
                list
            )
        )
    }


    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.itemView.apply {
            val viewList = listOf(
                iv_community1,
                iv_community2,
                iv_community3
            )
            tv_name.text = fakeName[position % 10]
            tv_content.text = fakeContent[position % 10]
            if (holder.fakeData.needAdd){
                for (iv in viewList) {
                    iv.visibility = View.VISIBLE
                }
                for (i in 0 until holder.fakeData.count) {
                    viewList[i].apply {
                        setImageResource(fakeImage[holder.fakeData.index[i]])
                    }
                }
            }
            tag = "SET"
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