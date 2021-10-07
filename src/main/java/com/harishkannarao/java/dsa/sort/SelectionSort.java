package com.harishkannarao.java.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sortAscending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for(int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largest = result[0];
            int largestIndex = 0;
            for (int index = 1; index <= lastSortedIndex; index++) {
                if (result[index] > largest) {
                    largest = result[index];
                    largestIndex = index;
                }
            }
            swap(result, largestIndex, lastSortedIndex);
        }
        return result;
    }

    private static void swap(int[] input, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
