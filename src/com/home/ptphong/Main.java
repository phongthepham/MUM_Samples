package com.home.ptphong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        // Sample 01
        ArrayList<int[]> testValues01 = new ArrayList<>();
        testValues01.add(new int[] {1, 2, 3, 4, 5});
        testValues01.add(new int[] {3, 2, 1, 4, 5});
        testValues01.add(new int[] {3, 2, 1, 4, 1});
        testValues01.add(new int[] {1, 2, 3, 4});
        testValues01.add(new int[] {});
        testValues01.add(new int[] {10});

        for (int [] array: testValues01
        ) {
            System.out.println("Result: " + sample_01(array));
        }
        /*

        /*
        // Sample 02
        ArrayList<int[]> testValues = new ArrayList<>();
        testValues.add(new int[] {1});
        testValues.add(new int[] {1, 2});
        testValues.add(new int[] {1, 2, 3});
        testValues.add(new int[] {1, 2, 3, 4});
        testValues.add(new int[] {3, 3, 4, 4});
        testValues.add(new int[] {3, 2, 3, 4});
        testValues.add(new int[] {4, 1, 2, 3});
        testValues.add(new int[] {1, 1});
        testValues.add(new int[] {});

        for (int [] array: testValues
             ) {
            System.out.println("Result: " + sample_02(array));
        }
        */

        // Sample 04
       int[] testValues04 = {1234, 12005, -1, 1000, 0, -12345};

        for (int n: testValues04
             ) {
            System.out.println("Result: " + sample_04(n));
        }
    }

    public static int sample_04(int n)
    {
        int result = 0;

        while(n != 0) {
            result = (result * 10) + n % 10;
            n = n / 10;
        }
        return result;
    }

    public static int sample_02(int [] array)
    {
        int sumOfOdd = 0, sumOfEven = 0;

        if(array == null)
            return 0;

        for ( int i = 0 ; i < array.length ; i++)
        {
            if(array[i] % 2 == 0)
                sumOfEven+= array[i];
            else
                sumOfOdd+=array[i];
        }

        return sumOfOdd - sumOfEven;
    }

    public static int sample_01(int[] array) {
        if (array == null || array.length % 2 == 0)
            return 0;

        int midleIndex = array.length / 2;
        int midleValue = array[midleIndex];

        for (int i = 0; i < array.length; i++) {
            if (i != midleIndex && array[i] <= midleValue)
                return 0;
        }

        return 1;
    }
}
