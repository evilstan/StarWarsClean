package com.evilstan.starwarsclean.data.storage.models

import androidx.room.PrimaryKey

class PersonCache
    (
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
