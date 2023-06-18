package com.dianajconcepcion.database
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dianajconcepcion.Model.User


@Database(
    entities = [User::class],
    version = 1,                // <- Database version
    exportSchema = false
)
abstract  class QuizAppDatabase:RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: QuizAppDatabase? = null

        fun getDatabase(context: Context): QuizAppDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizAppDatabase::class.java,
                    "quiz_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }

    }

