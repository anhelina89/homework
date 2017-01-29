package lesson3.intermediate;

/**
 * Created by apodushkina on 23.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int temp1=arr.length-1;


        for (int i=0; i<arr.length; i++){

               int temp = arr[i];
               arr[i] = arr[temp1];
               arr[temp1] = temp;

               temp1 = temp1 - 1;

            System.out.println(arr[i]);
        }

    }

}
