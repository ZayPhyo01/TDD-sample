package com.zay.bookshop

class BookShop(bookCaseSize: Int = 3) {
    fun removeAllBooks() {
        if (books != null) {
            books = null
        }
    }

    fun isClose(): Boolean?
       = (books == null)

    fun isBookOverSize(): Boolean {
        return true
    }


    var books: List<String>? = listOf("mgmg", "aung au")
}