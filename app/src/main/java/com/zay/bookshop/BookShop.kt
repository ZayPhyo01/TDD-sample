package com.zay.bookshop

import java.lang.IllegalStateException

class BookShop(val bookCaseSize: Int = 3) {
    var isNowClose  = true

    fun removeAllBooks() {
        if (isNowClose){
            throw IllegalStateException()
        }
        if (books != null) {
            books = null
        }
    }

    fun isClose(): Boolean?
       = (books == null)



    fun isBookOverSize(): Boolean {
        return bookCaseSize < books?.size!!
    }


    var books: List<String>? = null
}