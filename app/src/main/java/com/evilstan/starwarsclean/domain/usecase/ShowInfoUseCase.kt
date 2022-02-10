package com.evilstan.starwarsclean.domain.usecase

import android.os.Bundle
import com.evilstan.starwarsclean.domain.models.PersonDomain
import com.evilstan.starwarsclean.domain.repository.PersonRepository

class ShowInfoUseCase(private val personRepository: PersonRepository) {
    fun execute(personDomain: PersonDomain): Bundle {

        return personRepository.showInfo(personDomain)
    }
}