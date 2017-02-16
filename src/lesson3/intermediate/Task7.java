package lesson3.intermediate;

import java.util.Arrays;

/**
 * Created by Angelina on 29.01.2017.
 */
public class Task7 {
    public static void main(String[] args) {
    Task7 t7 = new Task7();
        t7.printMatrix();

    }
        int[][] matrix1 = {{1,2,3},{3,2,1}};
        int[][] matrix2 = {{7,8,9},{9,8,7}};
public void printMatrix(){
    System.out.println("task - Addition of matrices. Add two matrix according to the common math rules and print the output to the console\n");
        System.out.println("First matrix:");
        for (int i=0; i<matrix1.length;i++){
            for (int j=0; j<matrix1[0].length;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Second matrix:");
        for (int i=0; i<matrix2.length;i++){
            for (int j=0; j<matrix2[0].length;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
