package com.example.shopping_application.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shopping_application.data.entities.Shoppingitem

@Dao
interface ShoppingDao {
    @Insert(onConflict =OnConflictStrategy.REPLACE)
    suspend fun upsert(item: Shoppingitem)

    @Delete
    suspend fun delete(item: Shoppingitem)

    @Query(value = "Select * FROM Shopping_Detail")
    fun getAllShopping():LiveData<List<Shoppingitem>>
}