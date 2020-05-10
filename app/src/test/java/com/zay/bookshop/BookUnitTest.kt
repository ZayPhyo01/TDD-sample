package com.zay.bookshop

import org.junit.Assert
import org.junit.Test

class BookUnitTest {
    @Test//subjectUnderTest_actionOrInput_resultState
    fun bookShop_whenCreate_shouldReturnEmptyBooks() {
        //given a book shop
        val booksShop = BookShop()
        //when call books from booksShop()
        //then return empty books
        Assert.assertNull(booksShop.books)

    }

    @Test
    fun bookShop_whenEmpty_shouldReturnCloseBookShop () {
        //Give an bookshop object
        val bookShop = BookShop()
        //when remove all books
        bookShop.removeAllBooks()
        //then bookshop close is true
        Assert.assertEquals(true , bookShop.isClose())
        // now we r pass
    }
}