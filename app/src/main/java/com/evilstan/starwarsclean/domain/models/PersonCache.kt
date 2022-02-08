package com.evilstan.starwarsclean.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "persons")
data class PersonCache(
    @PrimaryKey
    val name: String,
    val height: String,
    val mass: String,
    val hairColor: String,
    val skinColor: String,
    val eyeColor: String,
    val birthYear: String,
    val gender: String,
    var films: List<String>,
    var favorite: Boolean
)
