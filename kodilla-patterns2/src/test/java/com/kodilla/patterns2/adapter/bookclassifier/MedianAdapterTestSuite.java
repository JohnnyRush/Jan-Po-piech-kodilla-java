package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("A", "ABC", 1994, "A1"));
        bookSet.add(new Book("B", "DEF", 1945, "B2"));
        bookSet.add(new Book("C", "GHI", 2017, "C3"));
        bookSet.add(new Book("D", "JKL", 2000, "D4"));
        bookSet.add(new Book("E", "MNO)", 1822, "E5"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(median, 1994, 0);
    }
}
