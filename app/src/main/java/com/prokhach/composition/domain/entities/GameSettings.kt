package com.prokhach.composition.domain.entities

import java.io.Serializable

data class GameSettings(

    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) : Serializable
