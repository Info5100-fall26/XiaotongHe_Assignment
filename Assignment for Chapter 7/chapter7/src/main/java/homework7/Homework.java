package homework7;

public class Homework {
    public static void main(String[] args) {
       int[][] A = {{2,3,4},{3,4,5}};
       int[][] B = {{1,2},{3,4},{5,6}}; 

       int aRows = A.length;        
        int aCols = A[0].length;     
        int bRows = B.length;        
        int bCols = B[0].length;  
        
        if (aCols != bRows) {
            System.out.println("Matrices cannot be multiplied. A's columns must match B's rows.");
            return; 
        }

        int[][] C = new int[aRows][bCols];

        for (int i = 0; i < aRows; i++) {       
            for (int j = 0; j < bCols; j++) {   
                for (int k = 0; k < aCols; k++) { 
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


    }
}
