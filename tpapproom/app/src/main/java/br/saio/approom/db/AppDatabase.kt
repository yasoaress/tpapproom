package br.saio.approom.db

import androidx.room.Database
import androidx.room.RoomDatabase
import br.saio.approom.dao.UserDao
import br.saio.approom.model.User

@Database(
    entities = [User::class],
    version = 2
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}