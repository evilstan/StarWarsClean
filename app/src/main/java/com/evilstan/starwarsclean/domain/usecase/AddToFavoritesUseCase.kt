package com.evilstan.starwarsclean.domain.usecase

import com.evilstan.starwarsclean.domain.models.PersonCache
import com.evilstan.starwarsclean.domain.repository.Repository

class AddToFavoritesUseCase(private val repository: Repository) {
    fun execute(personCache: PersonCache) {
        repository.favorite(personCache)
    }
}