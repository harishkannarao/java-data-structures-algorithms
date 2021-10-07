package com.harishkannarao.java.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sortAscending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for(int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestIndex = 0;
            for (int index = 1; index <= lastSortedIndex; index++) {
                if (result[index] > result[largestIndex]) {
                    largestIndex = index;
                }
            }
            swap(result, largestIndex, lastSortedIndex);
        }
        return result;
    }

    public static int[] sortDescending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for(int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0;
            for (int index = 1; index <= lastSortedIndex; index++) {
                if (result[index] < result[smallestIndex]) {
                    smallestIndex = index;
                }
            }
            swap(result, smallestIndex, lastSortedIndex);
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
