package com.netology;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> setNumbers = new ArrayList<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(5);
        setNumbers.add(16);
        setNumbers.add(-1);
        setNumbers.add(-2);
        setNumbers.add(0);
        setNumbers.add(32);
        setNumbers.add(3);
        setNumbers.add(5);
        setNumbers.add(8);
        setNumbers.add(23);
        setNumbers.add(4);

        Iterator<Integer> iterator = setNumbers.iterator();
        while (iterator.hasNext()) {
            Integer currentNumber = iterator.next();
            if (currentNumber <= 0 || currentNumber % 2 != 0) {
                iterator.remove();
            }
        }

        setNumbers.sort(Comparator.naturalOrder());
        System.out.println(setNumbers.toString());
    }
}
