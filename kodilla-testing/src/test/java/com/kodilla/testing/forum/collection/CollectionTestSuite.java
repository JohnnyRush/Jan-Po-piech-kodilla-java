package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.lang. *;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        //When
        List<Integer> listEmpty = new ArrayList<>();
        List<Integer> result = emptyList.exterminate(listEmpty);
        System.out.println("Testing empty list");
        //Then
        Assert.assertFalse(result.size() != 0);
        for (int oddNumber : result) {
            Assert.assertTrue(oddNumber % 2 != 0);
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
            //Given
            OddNumbersExterminator fullList = new OddNumbersExterminator();
            //When
            List<Integer> listFilled = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                listFilled.add(i);
            }
            List<Integer> result = fullList.exterminate(listFilled);
            System.out.println("Testing full list");
            //Then
            Assert.assertTrue(result.size() != 0);
            for (int oddNumber : result) {
                Assert.assertTrue(oddNumber % 2 != 0);
            }
        }
    }

