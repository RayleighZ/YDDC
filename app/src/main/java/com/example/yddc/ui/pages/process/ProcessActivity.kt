package com.example.yddc.ui.pages.process

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yddc.R
import com.example.yddc.ui.pages.process.adapter.ProcessRvAdapter
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import kotlinx.android.synthetic.main.activity_process.*

class ProcessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process)
//        val aaChartModel: AAChartModel = AAChartModel()
//            .chartType(AAChartType.Areaspline)
//            .title("每日数据")
//            .yAxisTitle("单词个数")
//            .categories(
//                arrayOf(
//                    "0-2", "2-4", "4-6", "6-8", "8-10", "10-12",
//                    "12-14", "14-16", "16-18", "18-20", "20-22", "22-24"
//                )
//            )
//            .subtitle("")
//            .backgroundColor("#ffffff")
//            .dataLabelsEnabled(true)
//            .series(
//                arrayOf(
//                    AASeriesElement()
//                        .name("单词个数")
//                        .data(
//                            arrayOf(
//                                1,
//                                1,
//                                3,
//                                4,
//                                10,
//                                25,
//                                22,
//                                13,
//                                1,
//                                10,
//                                5,
//                                9
//                            )
//                        )
//                )
//            )
//
//        rv_process.adapter = ProcessRvAdapter()
//        rv_process.layoutManager = LinearLayoutManager(this)
//        process_day_process.aa_drawChartWithChartModel(aaChartModel)
    }
}