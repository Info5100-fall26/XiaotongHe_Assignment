package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Arrays;

public class Chapter5 {
    public static void main(String[] args) {
        //(1)
        String str="Oakland";
        int length=str.length();
        char ch=str.charAt(2);
        String sub=str.substring(3, 7);
        String capital=str.toUpperCase();
        System.out.println("The length of the string is: " + length);
        System.out.println("The character at index 2 is: " + ch);
        System.out.println("The substring “land” from str is: " + sub);
        System.out.println("The uppercase version of the string is: " + capital);

        //(2)
        int[] abc = {1,3,5,2,5};
        int abc_length = abc.length;
        int last_member = abc[abc_length - 1];
        System.out.println("The length of the array is: " + abc_length);
        System.out.println("The last member of the array is: " + last_member);
        
        //(3)
        ArrayList<String> cities = new ArrayList<String>(Arrays.asList(
            "Austin", "Houston", "Oakland", "Paris", "San Francisco", "Seattle"));
        cities.remove("Paris");
        System.out.println("The cities in the list are: " + cities);
    }
}
