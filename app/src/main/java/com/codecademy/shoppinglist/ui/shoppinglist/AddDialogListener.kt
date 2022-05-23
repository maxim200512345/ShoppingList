package com.codecademy.shoppinglist.ui.shoppinglist

import com.codecademy.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item : ShoppingItem)

}