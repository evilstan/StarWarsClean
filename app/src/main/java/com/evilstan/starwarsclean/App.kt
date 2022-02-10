package com.evilstan.starwarsclean

import android.app.Application
import com.evilstan.starwarsclean.core.AppDatabase

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        instance = this
        database = AppDatabase.getInstance(this)
    }

    companion object {
        lateinit var instance: Application
            private set
        lateinit var database: AppDatabase
            private set
    }
}