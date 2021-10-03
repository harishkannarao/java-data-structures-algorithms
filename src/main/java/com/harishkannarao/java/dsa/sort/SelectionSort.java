package com.harishkannarao.java.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sortAscending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for(int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largest = result[lastSortedIndex];
            int largestIndex = lastSortedIndex;
            for (int index = lastSortedIndex - 1 ; index >= 0; index--) {
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
