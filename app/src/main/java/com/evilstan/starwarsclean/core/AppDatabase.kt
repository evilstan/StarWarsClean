package com.evilstan.starwarsclean.core

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.evilstan.starwarsclean.domain.models.PersonDomain

@Database(entities = [PersonDomain::class], version = 1, exportSchema = false)
@TypeConverters(DataConverter::class)

abstract class AppDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(AppDatabase::class) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "peopleDb"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}