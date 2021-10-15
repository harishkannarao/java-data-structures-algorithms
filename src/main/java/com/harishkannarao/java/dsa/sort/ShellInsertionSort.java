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

    public static int[] sortDescending(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for(int gap = result.length / 2; gap >= 1; gap = gap / 2) {
            for (int frontIndex = (result.length -1) - gap; frontIndex >= 0; frontIndex--) {
                int current = result[frontIndex];
                for(int backIndex = frontIndex + gap; backIndex < result.length; backIndex = backIndex + gap) {
                    if (current < result[backIndex]) {
                        result[backIndex - gap] = result[backIndex];
                        if (backIndex + gap >= result.length) {
                            result[backIndex] = current;
                        }
                    } else {
                        result[backIndex - gap] = current;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
