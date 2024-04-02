package com.java;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumber {
    public static void main(String[] args) {
        try {
            int number = 7; 
            checkIfEven(number);
            System.out.println(number + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number.");
        }
    }
}

