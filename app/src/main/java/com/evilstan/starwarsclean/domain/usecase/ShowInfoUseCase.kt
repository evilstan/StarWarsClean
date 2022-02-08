package com.evilstan.starwarsclean.domain.usecase

import android.os.Bundle
import com.evilstan.starwarsclean.domain.models.PersonCache
import com.evilstan.starwarsclean.domain.repository.Repository

class ShowInfoUseCase(private val repository: Repository) {
    fun execute(personCache: PersonCache): Bundle {

        return repository.showInfo(personCache)
    }
}