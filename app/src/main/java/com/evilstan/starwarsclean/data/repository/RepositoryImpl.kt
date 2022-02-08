package com.evilstan.starwarsclean.data.repository

import android.os.Bundle
import com.evilstan.starwarsclean.domain.models.PersonCache
import com.evilstan.starwarsclean.domain.repository.Repository

class RepositoryImpl : Repository {
    override fun favorite(personCache: PersonCache) {
    }

    override fun search(name: String) {

    }

    override fun showInfo(personCache: PersonCache): Bundle {
        return Bundle()
    }
}