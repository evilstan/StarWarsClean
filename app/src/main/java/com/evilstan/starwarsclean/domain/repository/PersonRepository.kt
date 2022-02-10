package com.evilstan.starwarsclean.domain.repository

import android.os.Bundle
import com.evilstan.starwarsclean.domain.models.PersonDomain

interface PersonRepository {

    suspend fun insert(personDomain: PersonDomain)

    suspend fun delete(personDomain: PersonDomain)

    suspend fun contains(name: String):Boolean

    fun search(name: String)

    fun showInfo(personDomain: PersonDomain): Bundle
}