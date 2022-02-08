package com.evilstan.starwarsclean.domain.usecase

import com.evilstan.starwarsclean.domain.repository.Repository

class SearchByNameUseCase(private val repository: Repository) {
    fun execute(name: String) = repository.search(name)
}