package com.zay.bookshop

class BookShop {
    fun removeAllBooks() {
        if (books != null) {
            books = null
        }
    }

    fun isClose(): Boolean?
       = (books == null)



    var books: List<String>? = listOf("mgmg", "aung au")
}