package lab.edu.neu;
import java.util.Arrays;
import java.util.ArrayList;

public class Lab {
    public static void main( String[] args )
    {
        //Lab 1 part 1 - Array
        int[] x ={1,15,3,12,5};
        int[] y ={6,7,8,9,10};
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        System.out.println("Array x = " + java.util.Arrays.toString(x));
        System.out.println("Array y = " + java.util.Arrays.toString(y));
        System.out.println("Array z = x + y = " + java.util.Arrays.toString(z));
        

        //Lab 1 part 2 - ArrayList
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(
            "Alice", "Benji", "Charlie", "Daisy", "Evelyn"
        ));
        ArrayList<String> names2 = new ArrayList<String>();

        for (int i=0; i < names.size(); i++) {
              names2.add(Character.toUpperCase(names.get(i).charAt(names.get(i).length()-1))
            + names.get(i).substring(1,names.get(i).length()-1)
            + Character.toLowerCase(names.get(i).charAt(0)));

        }

        System.out.println("Names =  " + names);
        System.out.println("Names (switched) = " + names2);


    }
}
