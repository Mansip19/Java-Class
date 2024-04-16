package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
 
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("grapes");
        hashSet.add("kiwi");

        System.out.println("Iterating using enhanced for-loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("\nIterating using forEach() method:");
        hashSet.forEach(element -> System.out.println(element));
    }
}
