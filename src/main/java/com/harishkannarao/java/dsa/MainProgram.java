package com.harishkannarao.java.dsa;

import java.util.Optional;

public class MainProgram {
    public static void main(String[] args) {
        RecordExample recordExample = new RecordExample("recordExample", Optional.of(23));
        System.out.println("recordExample = " + recordExample);
    }
}
