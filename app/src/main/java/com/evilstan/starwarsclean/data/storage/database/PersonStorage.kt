package com.evilstan.starwarsclean.data.storage.database

import androidx.lifecycle.LiveData
import com.evilstan.starwarsclean.core.PersonDao
import com.evilstan.starwarsclean.data.storage.models.PersonCache

interface PersonStorage {
    suspend fun contains(name: String): Boolean

    fun persons(): LiveData<List<PersonCache>>

    suspend fun insert(personCache: PersonCache)

    suspend fun delete(personCache: PersonCache)


    class Base(private val personDao: PersonDao) : PersonStorage {

        override suspend fun contains(name: String) = personDao.contains(name)

        override fun persons() = personDao.persons()

        override suspend fun insert(personCache: PersonCache) = personDao.insert(personCache)

        override suspend fun delete(personCache: PersonCache) = personDao.delete(personCache)

    }
}