package com.java;

public class Vowels {
	  
    static class NoVowelsException extends Exception {
        public NoVowelsException(String message) {
            super(message);
        }
    }
    
    static void checkForVowels(String input) throws NoVowelsException {
        boolean hasVowels = false;
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                hasVowels = true;
                break;
            }
        }
        if (!hasVowels) {
            throw new NoVowelsException("The input string does not contain any vowels.");
        }
    }
    
    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    
    public static void main(String[] args) {
        String input1 = "Mansi";
        String input2 = "bcd";
        
        try {
            checkForVowels(input1);
            System.out.println("Input 1 has vowels.");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            checkForVowels(input2);
            System.out.println("Input 2 has vowels.");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }
}

