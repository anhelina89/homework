package lesson3.intermediate;


import java.util.Arrays;

/**
 * Created by apodushkina on 23.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Task3 t3 = new Task3();
        System.out.println("Reverted array - " + t3.revertArr());
    }

    int[] arr = {1, 2, 3, 4, 5, 6};

    public String revertArr() {
        System.out.println("Tas - Reversed array. Write a method which takes an array and returns inverted one");
        System.out.println("Initial array - " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = j;
        }
        return Arrays.toString(arr);
    }

}

