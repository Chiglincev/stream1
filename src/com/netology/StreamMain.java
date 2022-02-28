package com.netology;

import java.util.*;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> setNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        setNumbers.stream()
                .filter(n -> n > 0)
                .filter(n -> n % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }
}
