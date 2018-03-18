package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Ksiazka1", "Autor1", LocalDate.now());
        Book book2 = new Book("Ksiazka2", "Autor1", LocalDate.now().minusDays(10));
        Book book3 = new Book("Ksiazka3", "Autor2", LocalDate.now().minusMonths(1));
        Library library = new Library("biblioteka 1");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("biblioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.books.remove(book1);
        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }

}
