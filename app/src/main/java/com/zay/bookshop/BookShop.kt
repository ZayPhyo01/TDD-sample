package com.zay.bookshop

class BookShop(val bookCaseSize: Int = 3) {
    var isNowClose  = true
    fun removeAllBooks() {
        if (books != null) {
            books = null
        }
    }

    fun isClose(): Boolean?
       = (books == null)



    fun isBookOverSize(): Boolean {
        return bookCaseSize < books?.size!!
    }


    var books: List<String>? = listOf("mgmg", "aung au")
}