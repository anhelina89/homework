package lesson3.intermediate;

/**
 * Created by apodushkina on 23.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for (int i=0; i< arr.length/2;i++){
            int j = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=j;
        }
        for(int m=0; m < arr.length;m++){
            System.out.print(arr[m]+" ");
        }
    }

}
