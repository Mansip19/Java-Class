package com.java;

import java.util.Scanner;

public class Voting {

    static class UnderageException extends Exception {
        public UnderageException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new UnderageException("You are not eligible to vote as you are underage.");
            } else {
                System.out.println("You are eligible to vote.");
                
            }
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }
}

