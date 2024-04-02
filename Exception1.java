package com.java;

public class Exception1 {
    public static void main(String[] args) {
        try {
            
            throw new Exception("This is an example exception.");
        } catch (Exception e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

