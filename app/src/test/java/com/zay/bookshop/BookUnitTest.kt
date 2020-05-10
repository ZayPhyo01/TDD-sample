package com.zay.bookshop

import org.junit.Assert
import org.junit.Test
import java.lang.IllegalStateException

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

    @Test
    fun books_whenBooksMoreThanBookCaseSize_shouldReturnBookOverSizeTrue(){
        //Give an bookshop object
        val books = BookShop(bookCaseSize = 3)
        //when set 7 books
        books.books = listOf("java" ,"android advance","c++ beginner" ,"biology","english speaking" ,"how to install window" ,
            "coroutine kotlin")
        //then books are more than size of book case return bookoversize true
        Assert.assertTrue(books.isBookOverSize())
        //we are pass in fail state , something wrong!

    }

    @Test(expected = IllegalStateException::class)
    fun bookshopisClose_withoutRemoveAllBooks_shouldReturnIllegalState() {
        //Give an bookshop object
        val books = BookShop()
        //when close before remove all books
        books.isNowClose = true
        //then calling remove all books after close , return illegal state
        books.removeAllBooks()
    }
}