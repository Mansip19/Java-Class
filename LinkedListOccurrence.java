package com.demo;
import java.util.LinkedList;

public class LinkedListOccurrence {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("banana");
        linkedList.add("grapes");
        linkedList.add("banana");

        String targetElement = "grapes";

        int firstOccurrenceIndex = linkedList.indexOf(targetElement);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + targetElement + "' is at index: " + firstOccurrenceIndex);
        } else {
            System.out.println("Element '" + targetElement + "' not found in the LinkedList");
        }

        int lastOccurrenceIndex = linkedList.lastIndexOf(targetElement);

        if (lastOccurrenceIndex != -1) {
            System.out.println("Last occurrence of '" + targetElement + "' is at index: " + lastOccurrenceIndex);
        } else {
            System.out.println("Element '" + targetElement + "' not found in the LinkedList");
        }
    }
}
