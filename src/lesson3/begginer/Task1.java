package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr[];


        int[] arr1 = new int[5];
        System.out.println("new Array where each element is multiplied by 3");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 10;
            System.out.print(arr1[i]+" ");
        }
        System.out.println(" - old array");
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = arr1[j] * 3;
            System.out.print(arr1[j]+" ");
        }
        System.out.println(" - new array");



}
}