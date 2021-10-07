package com.harishkannarao.java.dsa.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    @Test
    public void test_sortAscending() {
        int[] input = new int[]{20, 35, -15, 7, 55, 1, -22};
        int[] result = SelectionSort.sortAscending(input);
        assertThat(result)
                .containsExactly(-22, -15, 1, 7, 20, 35, 55);
    }

    @Test
    public void test_sortDescending() {
        int[] input = new int[]{20, 35, -15, 7, 55, 1, -22};
        int[] result = SelectionSort.sortDescending(input);
        assertThat(result)
                .containsExactly(55, 35, 20, 7, 1, -15, -22);
    }
}
