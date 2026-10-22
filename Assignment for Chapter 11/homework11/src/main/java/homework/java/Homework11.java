package homework.java;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
 
        try {
            
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
 
            int age = 0;
            boolean valid = false;
 
            while (!valid) {
                try {
                    System.out.print("Enter your age (a whole number): ");
                    age = scanner.nextInt();
 
                    if (age < 0 || age > 150) {
                        throw new IllegalArgumentException("Age must be between 0 and 150.");
                    }
                    valid = true; 
 
                } catch (InputMismatchException e) {
                  
                    System.out.println("Invalid input: please type digits only, like 25.");
                    scanner.next(); 
                } catch (IllegalArgumentException e) {
                  
                    System.out.println(e.getMessage());
                }
            }
 
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
 
        } catch (NoSuchElementException e) {

            System.out.println("\nInput ended unexpectedly. Exiting the program.");
        } finally {
            scanner.close(); 
        }
    }
   }


