package chapter8.java;

public class Chapter8HW {

    static String[] names = {"Anne", "John", "Alex", "Jessica"};
    static String[] planets = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};
    public static void main(String[] args) {
        
        System.out.println("Original Array : ");
            for ( String a : names) {
                System.out.println(a);
            }
        String[] reversedNames = reverseArray(names);
        System.out.println("=========");
        System.out.println("Resultant array : ");
            for ( String a : reversedNames) {
                System.out.println(a);
}  

        System.out.println("Original Array : ");
            for ( String a : planets) {
                System.out.println(a);
            }
        String[] reversedPlanets = reverseArray(planets);
        System.out.println("=========");
        System.out.println("Resultant array : ");
            for ( String a : reversedPlanets) {
                System.out.println(a);
}  

    }

    public static String[] reverseArray(String[] names) {
    String[] result = new String[names.length];

    for (int i = 0; i < names.length; i++) {

        String name = names[names.length - 1 - i];
        

        String lowerName = name.toLowerCase();
        
        String reversed = "";
        for (int j = lowerName.length() - 1; j >= 0; j--) {
            reversed = reversed + lowerName.charAt(j);
        }
        
        String finalName = Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1);
        
        result[i] = finalName;
    }

    return result;
}
}
