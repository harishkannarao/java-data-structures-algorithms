package com.harishkannarao.java.dsa.sort;

import java.util.Arrays;

public class ShellInsertionSort {
    public static int[] sortAscending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for(int gap = result.length / 2; gap >= 1; gap = gap / 2) {
            for (int backIndex = gap; backIndex < result.length; backIndex++) {
                int current = result[backIndex];
                for(int frontIndex = backIndex - gap; frontIndex >= 0; frontIndex = frontIndex - gap) {
                    if (result[frontIndex] > current) {
                        result[frontIndex + gap] = result[frontIndex];
                        if (frontIndex - gap <= 0) {
                            result[frontIndex] = current;
                        }
                    } else {
                        result[frontIndex + gap] = current;
                        break;
                    }
                }
            }
        }
        return result;
    }

    /*public static int[] sortDescending(int[] input) {
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
    }*/
}
