package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Set<Book> books = new HashSet<>();
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> books.add(new Book("Book " + n, "Author " + n, LocalDate.of(1991 + n, 1, 1))));

        Library library = new Library("Alexandria 1");
        for (Book book : books) {
            library.getBooks().add(book);
        }

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Alexandria 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Alexadria 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().removeAll(books);

        //Then
        System.out.println(library.getBooks().size());
        System.out.println(clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks().size());
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}