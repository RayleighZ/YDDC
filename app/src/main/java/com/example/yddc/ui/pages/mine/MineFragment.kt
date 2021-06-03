package com.example.yddc.ui.pages.mine

import android.os.Bundle
import android.view.View
import com.example.yddc.R
import com.example.yddc.common.BaseFragment
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 * Author: RayleighZ
 * Time: 2021-05-26 2:59
 */
class MineFragment : BaseFragment<MineViewModel>(R.layout.fragment_mine) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("每日时间统计")
            .xAxisVisible(false)
            .yAxisTitle("单词个数")
            .subtitle("")
            .backgroundColor("#ffffff")
            .dataLabelsEnabled(true)
            .series(
                arrayOf(
                    AASeriesElement()
                        .name("单词个数")
                        .data(
                            arrayOf(
                                0,
                                0,
                                3,
                                0,
                                2,
                                21,
                                25,
                                2.5,
                                2,
                                18,
                                13,
                                9
                            )
                        )
                )
            )
        aa_1.aa_drawChartWithChartModel(aaChartModel)

        val aaChartModel2: AAChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("近期背词趋势变化")
            .subtitle("")
            .xAxisVisible(false)
            .yAxisTitle("单词个数")
            .backgroundColor("#ffffff")
            .dataLabelsEnabled(true)
            .series(
                arrayOf(
                    AASeriesElement()
                        .name("按周变化")
                        .data(
                            arrayOf(
                                45,
                                90,
                                34,
                                12,
                                124,
                                42,
                                12,
                                25,
                                24,
                                18,
                                13,
                                9
                            )
                        )
                )
            )
        aa_1.aa_drawChartWithChartModel(aaChartModel)

        aa_2.aa_drawChartWithChartModel(aaChartModel2)
    }
}