package com.example.shopping_application.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Shopping_Detail")
data class Shoppingitem(
    @ColumnInfo(name = "item_name")
    var name=String,
    @ColumnInfo(name = "item_Amount")
    var amount=Int,
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int? =null

}