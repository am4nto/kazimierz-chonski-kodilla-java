package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Fajny Autor", "Fajna Książka", 2000, "0001");
        Book book2 = new Book("Fajny Autor", "Bardzo Fajna Książka", 2001, "0002");
        Book book3 = new Book("Fajny Autor", "Super Fajna Książka", 2003, "0003");
        Book book4 = new Book("Ładny Autor", "Ładna książka", 2000, "0004");
        Book book5 = new Book("Ładny Autor", "Piękna Książka", 2002, "005");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(median, 2001);
    }
}