package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {
    
    static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        String filename = "example.txt"; 
        
        try {
            readFile(filename);
            System.out.println("File read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

