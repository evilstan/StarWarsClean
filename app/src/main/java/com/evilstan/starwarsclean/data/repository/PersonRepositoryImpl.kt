package com.evilstan.starwarsclean.data.repository

import android.os.Bundle
import com.evilstan.starwarsclean.data.storage.database.PersonStorage
import com.evilstan.starwarsclean.data.storage.models.PersonCache
import com.evilstan.starwarsclean.domain.models.PersonDomain
import com.evilstan.starwarsclean.domain.repository.PersonRepository

class PersonRepositoryImpl(private val personStorage: PersonStorage) : PersonRepository {

    override suspend fun insert(personDomain: PersonDomain) {
        personStorage.insert(map(personDomain))
    }

    override suspend fun delete(personDomain: PersonDomain) =
        personStorage.delete(map(personDomain))


    override suspend fun contains(name: String) = personStorage.contains(name)

    override fun search(name: String) {

    }

    override fun showInfo(personDomain: PersonDomain): Bundle {
        return Bundle()
    }

    private fun map(person: PersonCache) =
        PersonDomain(
            person.name,
            person.height,
            person.mass,
            person.hairColor,
            person.skinColor,
            person.eyeColor,
            person.birthYear,
            person.gender,
            person.films,
            person.favorite
        )

    private fun map(person: PersonDomain) =
        PersonCache(
            person.name,
            person.height,
            person.mass,
            person.hairColor,
            person.skinColor,
            person.eyeColor,
            person.birthYear,
            person.gender,
            person.films,
            person.favorite
        )
}

