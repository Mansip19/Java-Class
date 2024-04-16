package com.demo;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
    
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(4);

        System.out.println("ArrayList before sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("ArrayList after sorting: " + numbers);
    }
}

