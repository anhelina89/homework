package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Task7 t7 = new Task7();
        t7.maxMinMult2();
    }

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int tempMin = arr[0];
    int tempMax = arr[0];

    public void maxMinMult2() {
        System.out.println("Given an array of integers. Write a method which finds max and min elements in it and multiplies them by 2");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > tempMax) {
                tempMax = arr[i];
            } else if (arr[i] < tempMin) {
                tempMin = arr[i];
            }
        }
        tempMax = tempMax * 2;
        tempMin = tempMin * 2;
        System.out.println("max * 2 = " + tempMax + '\n' + "min * 2 = " + tempMin);
    }
}
