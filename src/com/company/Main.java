package com.company;

import java.util.Arrays;

public class Main {

    public int smallestNumber(int[] array) {
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public int largestNumber(int[] array) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }

    public int[] sortedArray(int[] array) {
        int[] array2 = array;
        Arrays.sort(array2);
        return array2;
    }

    public static void main(String[] args) {

        Main main = new Main();
        int[] x = {4, 2, 9, 13, 1, 0};
        int largeNumber = main.largestNumber(x);
        System.out.println("The largest number "+ largeNumber);
        int smallNumber = main.smallestNumber(x);
        System.out.println("The smallest number "+ smallNumber);
        int[] sorted = main.sortedArray(x);
        System.out.println("The sorted array is "+ Arrays.toString(sorted));
    }
}