package com.evilstan.starwarsclean.domain.repository

import android.os.Bundle
import com.evilstan.starwarsclean.domain.models.PersonCache

interface Repository {

    fun favorite(personCache: PersonCache)

    fun search(name: String)

    fun showInfo(personCache: PersonCache): Bundle
}