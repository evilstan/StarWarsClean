package com.evilstan.starwarsclean.core

import androidx.lifecycle.LiveData
import androidx.room.*
import com.evilstan.starwarsclean.data.storage.models.PersonCache

@Dao
interface PersonDao {
    @Query("SELECT EXISTS (SELECT 1 FROM persons WHERE name = :name)")
    suspend fun contains(name: String): Boolean

    @Query("SELECT * FROM persons")
    fun persons(): LiveData<List<PersonCache>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(personCache: PersonCache)

    @Update
    fun update(personCache: PersonCache)

    @Delete
    suspend fun delete(personCache: PersonCache)
}