package com.harishkannarao.java.dsa;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordExampleTest {
    @Test
    public void test_equality() {
        var sample1 = new RecordExample("sample", Optional.of(21));
        var sample2 = new RecordExample("sample", Optional.of(21));

        assertThat(sample1).isEqualTo(sample2);
    }
}
