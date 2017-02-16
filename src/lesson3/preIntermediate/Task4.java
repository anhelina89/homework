package lesson3.preIntermediate;

import java.util.Arrays;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task4 {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Task4 t4 = new Task4();
        System.out.println("The initial array - " + Arrays.toString(arr));
        t4.type2partArr();

    }

    public void type2partArr() {
        System.out.println("Given an array of integers. Write a method which prints the second half of the array. Include the middle element to output, if the array has odd number of elements: the output -->");

        int a = arr.length / 2;

        for (int i = a; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
