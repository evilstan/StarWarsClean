package com.evilstan.starwarsclean.domain.usecase

import com.evilstan.starwarsclean.domain.repository.PersonRepository

class SearchByNameUseCase(private val personRepository: PersonRepository) {
    fun execute(name: String) = personRepository.search(name)
}