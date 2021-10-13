package com.harishkannarao.java.dsa.sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sortAscending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for (int unsortedIndex = 1; unsortedIndex < result.length; unsortedIndex++) {
            int current = result[unsortedIndex];
            for (int i = unsortedIndex - 1; i >= 0; i--) {
                if (result[i] > current) {
                    result[i+1] = result[i];
                    if (i == 0) {
                        result[i] = current;
                    }
                } else {
                    result[i+1] = current;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] sortDescending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for (int unsortedIndex = input.length - 1; unsortedIndex >= 0; unsortedIndex--) {
            int current = result[unsortedIndex];
            for (int i = unsortedIndex + 1; i < result.length; i++) {
                if (current < result[i]) {
                    result[i-1] = result[i];
                    if (i == result.length - 1) {
                        result[i] = current;
                    }
                } else {
                    result[i-1] = current;
                    break;
                }
            }
        }
        return result;
    }
}
