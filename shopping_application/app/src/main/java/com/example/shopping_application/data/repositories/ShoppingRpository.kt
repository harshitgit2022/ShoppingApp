package com.example.shopping_application.data.repositories

import com.example.shopping_application.data.db.ShoppingDatabase
import com.example.shopping_application.data.entities.Shoppingitem

class ShoppingRpository (
    private val db:ShoppingDatabase
){
    suspend fun upsert(item:Shoppingitem)=db.getShoppingDao().upsert(item)
    suspend fun delete(item: Shoppingitem)=db.getShoppingDao().delete(item)

    fun getAllShoppingItems()=db.getShoppingDao().getAllShopping()

}