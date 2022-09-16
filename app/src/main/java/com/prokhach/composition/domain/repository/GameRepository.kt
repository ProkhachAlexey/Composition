package com.prokhach.composition.domain.repository

import com.prokhach.composition.domain.entities.GameSettings
import com.prokhach.composition.domain.entities.Level
import com.prokhach.composition.domain.entities.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
