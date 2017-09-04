package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] numbers = new int[20];
        numbers[0] = 84;
        numbers[1] = 24;
        numbers[2] = 55;
        numbers[3] = 37;
        numbers[4] = 15;
        numbers[5] = 34;
        numbers[6] = 64;
        numbers[7] = 2;
        numbers[8] = 19;
        numbers[9] = 28;
        numbers[10] = 37;
        numbers[11] = 46;
        numbers[12] = 64;
        numbers[13] = 73;
        numbers[14] = 82;
        numbers[15] = 91;
        numbers[16] = 81;
        numbers[17] = 13;
        numbers[18] = 59;
        numbers[19] = 66;
        double avg = ArrayOperations.getAverage(numbers);
        Assert.assertEquals(48.7, avg, 0);
    }
}
