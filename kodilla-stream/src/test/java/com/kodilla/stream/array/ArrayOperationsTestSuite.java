package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {


    @Test
    public void testGetAverage() {

        //Given
        int[] tab = new int[20];
        tab[0] = 22;
        tab[1] = 4;
        tab[2] = 72;
        tab[3] = 62;
        tab[4] = 48;
        tab[5] = 45;
        tab[6] = 1;
        tab[7] = 67;
        tab[8] = 78;
        tab[9] = 83;
        tab[10] = 11;
        tab[11] = 16;
        tab[12] = 52;
        tab[13] = 90;
        tab[14] = 124;
        tab[15] = 166;
        tab[16] = 23;
        tab[17] = 12;
        tab[18] = 41;
        tab[19] = 22;

        //When
        ArrayOperations.getAverage(tab);

        //Then
        double averege =  ArrayOperations.getAverage(tab);

        Assert.assertEquals(9.5, averege, 0.001);

    }
}