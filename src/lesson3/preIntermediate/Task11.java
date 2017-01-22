package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        int a;
        int[] arr = {1, 6, 3, 1, 6, 5, 7, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (arr[i+1] == 2){
                    if(arr[i+2] == 3){
                        System.out.println(true);
                    }
                }
            }
        }
    }
}
