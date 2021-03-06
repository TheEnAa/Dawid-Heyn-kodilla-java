package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHands0(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> booksBorrowed = new ArrayList<Book>();
        LibraryUser libraryUser = new LibraryUser("Dawid", "Heyn", "90010103544");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(booksBorrowed);
        //When
        List<Book> listOfBooksBorrowed = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0, listOfBooksBorrowed.size());
    }
    @Test
    public void listBooksInHands1(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> booksBorrowed = new ArrayList<Book>();
        Book book = new Book("Title", "Author", 2017);
        booksBorrowed.add(book);
        LibraryUser libraryUser = new LibraryUser("Dawid", "Heyn", "90010103544");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(booksBorrowed);
        //When
        List<Book> listOfBooksBorrowed = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(1, listOfBooksBorrowed.size());
    }
    @Test
    public void listBooksInHandsFive(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> booksBorrowed = new ArrayList<Book>();
        Book book1 = new Book("Title1", "Author1", 2017);
        Book book2 = new Book("Title2", "Author2", 2017);
        Book book3 = new Book("Title3", "Author3", 2017);
        Book book4 = new Book("Title4", "Author4", 2017);
        Book book5 = new Book("Title5", "Author5", 2017);
        booksBorrowed.add(book1);
        booksBorrowed.add(book2);
        booksBorrowed.add(book3);
        booksBorrowed.add(book4);
        booksBorrowed.add(book5);
        LibraryUser libraryUser = new LibraryUser("Dawid", "Heyn", "90010103544");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(booksBorrowed);
        //When
        List<Book> listOfBooksBorrowed = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(5, listOfBooksBorrowed.size());
    }
}