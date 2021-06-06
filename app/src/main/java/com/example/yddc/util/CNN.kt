package com.example.yddc.util

import com.example.yddc.R
import com.example.yddc.model.bean.Word
import com.example.yddc.ui.pages.community.adapter.CommunityRvAdapter
import java.util.*
import kotlin.random.Random.Default.nextBoolean
import kotlin.random.Random.Default.nextInt

/**
 * Author: RayleighZ
 * Time: 2021-05-26 0:16
 */
val fakeWords = listOf(
    Word(
        1,
        "Die",
        "n: 死亡,1. 死 2. 冲模",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        2,
        "From",
        "n: 来自,从；来自；由；表示时间",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        3,
        "Sorrow",
        "n: 悲伤",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        4,
        "life",
        "n: 生命",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        1,
        "intensity",
        "n.强烈; （感情的）强烈程度; 强度; 烈度",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        2,
        "From",
        "n.可能性; 几率，概率; 或然性",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        3,
        "signet",
        "n.图章，印;vt.盖章于",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        4,
        "Hey",
        "n: 闪电",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        1,
        "Die",
        "n: 有机化合物",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        2,
        "From",
        "n: 碳水化合物",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        3,
        "Sorrow",
        "n: 生活",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        4,
        "Hey",
        "n: 热爱",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        1,
        "Die",
        "n: 飞升",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        2,
        "From",
        "n: 晕眩",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        3,
        "Sorrow",
        "n: 倒地",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        4,
        "Hey",
        "n: 自杀",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        1,
        "Die",
        "n: 无尽",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        2,
        "From",
        "n: 折磨",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        3,
        "Sorrow",
        "n: 摇滚",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    ),
    Word(
        4,
        "Hey",
        "n: 死亡，死亡死亡死亡死亡死亡",
        "It is expected that the Asian market exchange rate went down probability.:预计亚洲市场汇价冲高回落的可能性较大.;A measure of the probability of destroying a target.:指摧毁一个目标的可能性的评估标准.;For the next real estate industry's loose policy is the probability of large events.:预计未来针对房地产行业的政策松动是大概率事件.;It discuses the relation of risk, invalidation probability and reliability.:概述了可靠度 、 失效概率及其与风险(不确定性)的关系.;This skill will have infinite probability.:此技能没有使用限制.",
        "CET6"
    )
)

val fakeName = listOf(
    "RayleighZ",
    "HuYuan",
    "The Shy",
    "SpreadWater",
    "Override DNA",
    "Rookie",
    "Axl Rose",
    "Slash",
    "Pink Floyd",
    "Radio Gaga"
)

val fakeContent = listOf(
    "如何在3天之内背完6级词汇",
    "关于准备阶段，还有两个容易产生混淆的概念笔者需要着重强调，首先是这时候进行内存分配的\n" +
            "仅包括类变量，而不包括实例变量，实例变量将会在对象实例化时随着对象一起分配在Java堆中。其\n" +
            "次是这里所说的初始值“通常情况”下是数据类型的零值，假设一",
    "如何评价java借助ClassLoader实现一定程度上的动态性",
    "Kotlin这门语言真的可以实现跨端开发吗",
    "JS和java是啥关系",
    "Trump fake news",
    "如何在3天之内背完6级词汇",
    "关于准备阶段，还有两个容易产生混淆的概念笔者需要着重强调，首先是这时候进行内存分配的\n" +
            "仅包括类变量，而不包括实例变量，实例变量将会在对象实例化时随着对象一起分配在Java堆中。其\n" +
            "次是这里所说的初始值“通常情况”下是数据类型的零值，假设一",
    "如何评价java借助ClassLoader实现一定程度上的动态性",
    "Kotlin这门语言真的可以实现跨端开发吗",
    "JS和java是啥关系",
    "Trump fake news","如何在3天之内背完6级词汇",
    "关于准备阶段，还有两个容易产生混淆的概念笔者需要着重强调，首先是这时候进行内存分配的\n" +
            "仅包括类变量，而不包括实例变量，实例变量将会在对象实例化时随着对象一起分配在Java堆中。其\n" +
            "次是这里所说的初始值“通常情况”下是数据类型的零值，假设一",
    "如何评价java借助ClassLoader实现一定程度上的动态性",
    "Kotlin这门语言真的可以实现跨端开发吗",
    "JS和java是啥关系",
    "Trump fake news"
)

val fakeImage = listOf(
    R.drawable.bac1,
    R.drawable.bac2,
    R.drawable.bac3,
    R.drawable.bac4,
    R.drawable.gaokao,
    R.drawable.liuji,
    R.drawable.siji,
)

val fakeData = listOf(
        CommunityRvAdapter.FakeData(
                true,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                true,
                2,
                listOf(
                        6,2
                )
        ),
        CommunityRvAdapter.FakeData(
                true,
                3,
                listOf(
                        5,2,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        ),
        CommunityRvAdapter.FakeData(
                false,
                2,
                listOf(
                        0,1
                )
        )
)
