package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        Task11 t11 = new Task11();
        t11.sequence123check();
    }

    public void sequence123check(){
        System.out.println("Given an array of integer positive numbers. For example, {4, 6, 0, 1, 2, 3, 1, 9}, but it can be any random. Write Java-program which returns True, if sequence {1, 2, 3} appears somewhere in the array. Provide additional boundary checks");
        int a;
        int[] arr = {1, 6, 3, 1, 6, 5, 7, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (arr[i+1] == 2){
                    if(arr[i+2] == 3){
                        System.out.println("Result - " + true);
                    }
                }
            }
        }
    }
}
