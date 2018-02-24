package com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] numbersArray = new int[20];
        double averageExpected = 3.7;
        double arrayLength = numbersArray.length;
        numbersArray[0] = 0;
        numbersArray[1] = 10;
        numbersArray[2] = 1;
        numbersArray[3] = 0;
        numbersArray[4] = 25;
        numbersArray[5] = 0;
        numbersArray[6] = 0;
        numbersArray[7] = 2;
        numbersArray[8] = 0;
        numbersArray[9] = 5;
        numbersArray[10] = 0;
        numbersArray[11] = 4;
        numbersArray[12] = 3;
        numbersArray[13] = 1;
        numbersArray[14] = 0;
        numbersArray[15] = 0;
        numbersArray[16] = 6;
        numbersArray[17] = 0;
        numbersArray[18] = 8;
        numbersArray[19] = 9;

        Assert.assertEquals(averageExpected, ArrayOperations.getAverage(numbersArray), 0.01);

    }
}
