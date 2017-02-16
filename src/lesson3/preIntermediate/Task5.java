package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Task5 t5 = new Task5();
        t5.checkMyNum();
    }

    boolean check = false;
    int[] arr = {1, 2, 3, 4, 5, 6, 8, 10, 11, 12, 13};

    public boolean checkMyNum() {
        System.out.println("Task - You don't like number 7 and number 9. Write a method which checks input array and returns True if the array doesn't contain your unloved numbers: \n");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7 || arr[i] == 9) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        System.out.println(check);
        return check;
    }
}
