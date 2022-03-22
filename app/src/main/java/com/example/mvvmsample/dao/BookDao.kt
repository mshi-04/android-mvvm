package com.example.mvvmsample.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvmsample.model.Book

@Dao
interface BookDao {
    @Insert
    fun insert(id: Int, title: String, auther: String)

    @Delete
    fun delete(book: Book)

    @Query("SELECT * FROM books")
    fun getAll(): List<Book>

}