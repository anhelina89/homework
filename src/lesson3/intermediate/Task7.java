package lesson3.intermediate;

/**
 * Created by Angelina on 29.01.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{3,2,1}};
        int[][] matrix2 = {{7,8,9},{9,8,7}};

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
