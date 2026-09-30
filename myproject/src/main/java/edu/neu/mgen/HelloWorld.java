package edu.neu.mgen;

import java.util.Scanner;

public class HelloWorld {
    public static void main( String[] args )
    {
        System.out.println("It is my first Java program");  

        //int
        int x1 = 1;
        int x2 = 2;

        //long
        long population = 60000000000L;
        long distance = 15000000000L;

        //double
        double price = 10.99;
        double height = 200.5;

        //boolean
        boolean isTrue = true;
        boolean isFalse = false;

        //char
        char character = 'A';
        char label = 'B';

        System.out.println("int x1: " + x1);
        System.out.println("int x2: " + x2);
        System.out.println("long population: " + population);
        System.out.println("long distance: " + distance);
        System.out.println("double price: " + price); 
        System.out.println("double height: " + height);
        System.out.println("boolean isTrue: " + isTrue);
        System.out.println("boolean isFalse: " + isFalse);
        System.out.println("char character: " + character);
        System.out.println("char label: " + label);


        //convert initialized variables of type "int" to "long"
        long convertLong = x1;
        System.out.println("int x1: " + x1);
        System.out.println("long convertLong: " + convertLong);

        //convert initialized variables of type "long" to "int"
        int convertInt = (int) population;
        System.out.println("long population: " + population);
        System.out.println(convertInt);

        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter username:");
        String userName = myObj.nextLine(); 
        System.out.println("Username: " + userName);

        //arithemetic operations
        System.out.println("x1+x2=" + (x1 + x2));
        System.out.println("x1+price=" + (x1 + price));
        System.out.println("distance/population=" + (distance / population));

        //logical operations
        System.out.println("isTrue && isFalse=" + (isTrue && isFalse));
        System.out.println("!isTrue=" + !isTrue);
        System.out.println("x2<x1:" + (x2 < x1));
        
        /* This is 
         * a multi-line comment
         */
    }
}
