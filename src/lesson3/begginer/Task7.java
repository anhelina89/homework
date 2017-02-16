package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Given an array of integers. Find and print the max element in it\n");

        Task7 t7 = new Task7();
        t7.maxElementInArr();
    }

    public void maxElementInArr(){
        int[] arr = {20,30,5,6,45,89};
        int max= arr[0];
        for ( int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element in the arr - "+max);

    }
}
