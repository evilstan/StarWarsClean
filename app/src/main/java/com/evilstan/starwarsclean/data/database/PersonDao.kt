package com.evilstan.starwarsclean.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.evilstan.starwarsclean.domain.models.PersonCache

@Dao
interface PersonDao {
    @Query("SELECT EXISTS (SELECT 1 FROM persons WHERE name = :name)")
    suspend fun contains(name: String): Boolean

    @Query("SELECT * FROM persons")
    fun persons(): LiveData<List<PersonCache>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(characterCache: PersonCache)

    @Update
    fun update(characterCache: PersonCache)

    @Delete
    suspend fun delete(characterCache: PersonCache)
}