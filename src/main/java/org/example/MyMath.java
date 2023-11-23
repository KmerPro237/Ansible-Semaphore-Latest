package org.example;

import java.util.Arrays;

public class MyMath {

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }

        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings must not be null");
        }

        return str1 + " " + str2;
    }
}

