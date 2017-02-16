package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Task6 t6 = new Task6();
        t6.sumAndAverage();
    }

    int sum = 0;
    double avg;
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void sumAndAverage() {
        System.out.println("Given an array of integers. Write a method which calculates sum of all elements and arithmetic average of them");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = (double) sum / (arr.length - 1);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
