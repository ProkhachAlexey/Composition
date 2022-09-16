package com.prokhach.composition.domain.usecases

import com.prokhach.composition.domain.entities.GameSettings
import com.prokhach.composition.domain.entities.Level
import com.prokhach.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
