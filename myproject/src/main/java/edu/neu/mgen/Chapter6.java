package edu.neu.mgen;

import java.util.Scanner;

public class Chapter6 {
    public static void main(String[] args) {
        int x = 10, y = 25;
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int sqrt = (int) Math.sqrt(y);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sqrt: " + sqrt);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter any word:");
        long startTime = System.nanoTime();
        String newWord = myObj.nextLine();
        long endTime = System.nanoTime();
        
        if (newWord == null || newWord.trim().isEmpty()) {
            System.out.println("You entered an empty line. Please reenter");
        } else {
        int wordLength = newWord.length();
        double timePassed = (endTime - startTime) / 1000000000.0;
        
        String classify;
        if (newWord.length() <= 5) {
            classify = "short";
        } else if (newWord.length() <= 10) {
            classify = "medium";
        } else {
            classify = "long";
        }

        
            System.out.println("Your word is " + newWord);
            System.out.println("It is a " + classify + " word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + timePassed + " seconds");
        
    }







    }
}
