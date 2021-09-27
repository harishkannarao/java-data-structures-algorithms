package com.harishkannarao.java.dsa;

import java.util.Optional;

public class MainProgram {
    public static void main(String[] args) {
        Sample sample = new Sample("sample", Optional.of(23));
        System.out.println("sample = " + sample);
    }
}
