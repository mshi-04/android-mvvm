package com.example.mvvmsample.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmsample.dao.BookDao
import com.example.mvvmsample.model.Book

@Database(entities = [Book::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun bookDao(): BookDao
}