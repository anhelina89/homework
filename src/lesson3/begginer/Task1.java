package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr[];


        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 10;
            System.out.println(arr1[i]);
        }
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = arr1[j] * 3;
            System.out.println(arr1[j]);
        }



}
}