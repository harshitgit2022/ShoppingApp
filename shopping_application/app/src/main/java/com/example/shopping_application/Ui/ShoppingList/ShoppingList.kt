package com.example.shopping_application.ui.ui

import androidx.lifecycle.ViewModel
import com.example.shopping_application.data.entities.Shoppingitem
import com.example.shopping_application.data.repositories.ShoppingRpository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository:ShoppingRpository
):ViewModel() {
    fun upsert(item: Shoppingitem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)

        fun delete(item: Shoppingitem) = CoroutineScope(Dispatchers.Main).launch {
            repository.delete(item)
        }

        fun getAllShoppingItems() = repository.getAllShoppingItems()

    }
}