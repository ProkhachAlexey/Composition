package com.prokhach.composition.domain.usecases

import com.prokhach.composition.domain.entities.Question
import com.prokhach.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        const val COUNT_OF_OPTIONS = 6
    }
}
