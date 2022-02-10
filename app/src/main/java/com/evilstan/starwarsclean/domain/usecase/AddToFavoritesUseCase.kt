package com.evilstan.starwarsclean.domain.usecase

import com.evilstan.starwarsclean.domain.models.PersonDomain
import com.evilstan.starwarsclean.domain.repository.PersonRepository

class AddToFavoritesUseCase(private val personRepository: PersonRepository) {

    suspend fun execute(personDomain: PersonDomain) {
        if (personDomain.favorite) personRepository.insert(personDomain)
        else personRepository.delete(personDomain)
    }

}