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
        ArrayList<int[]> testValues02 = new ArrayList<>();
        testValues02.add(new int[] {1});
        testValues02.add(new int[] {1, 2});
        testValues02.add(new int[] {1, 2, 3});
        testValues02.add(new int[] {1, 2, 3, 4});
        testValues02.add(new int[] {3, 3, 4, 4});
        testValues02.add(new int[] {3, 2, 3, 4});
        testValues02.add(new int[] {4, 1, 2, 3});
        testValues02.add(new int[] {1, 1});
        testValues02.add(new int[] {});

        for (int [] array: testValues02
             ) {
            System.out.println("Result: " + sample_02(array));
        }
        */

        /*
        // Sample 03
        char[] sample03 = sample_03(new char[] {'a', 'b', 'c'}, 1, 2);
        System.out.println("Result:" + Arrays.toString(sample03));
        */

        /*
        // Sample 04
       int[] testValues04 = {1234, 12005, -1, 1000, 0, -12345};

        for (int n: testValues04
             ) {
            System.out.println("Result: " + sample_04(n));
        }
        */

        // Sample 06
        ArrayList<int[]> testValues06 = new ArrayList<>();
        testValues06.add(new int[] {1, 8, 3, 7, 10, 2});
        testValues06.add(new int[] {1, 5, 3, 1, 1, 1, 1, 1, 1});
        testValues06.add(new int[] {2, 1, 1, 1, 2, 1, 7});
        testValues06.add(new int[] {1, 2, 3});
        testValues06.add(new int[] {3, 4, 5, 10});
        testValues06.add(new int[] {1, 2, 10, 3, 4});

        for (int[] a: testValues06
             ) {
            System.out.println("Result: " + sample_06(a));
        }
    }

    public static int sample_06(int[]a)
    {
        int length = a.length;

        if(length < 3)
            return -1;

        int poe = 1;
        for(int i = 0 ; i < length - 1; i++)
        {
            int sumLeft = 0, sumRight= 0;

            for(int x = 0 ; x < poe ; x++)
                sumLeft+= a[x];

            for(int y = poe + 1; y < length ; y++)
                sumRight += a[y];

            if(sumLeft == sumRight)
                return poe;
            else
                poe++;
        }

        return -1;
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

    public static char[] sample_03(char[]a, int start, int len)
    {
        if(a==null || start < 0 || len < 0 || start + len > a.length)
            return null;

        char [] result = new char[len];
        int index = 0;

        for(int i = 0 ; i < len ; i++)
        {
            result[index++] = a[start++];
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
