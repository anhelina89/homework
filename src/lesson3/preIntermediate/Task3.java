package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.check21();
    }

    int a = 10;
    int b = 11;
    int n = 21;

    public void check21() {
        System.out.println("Task - Given 2 integers, a and b. Write a method which returns true if one if them is 21 or if their sum is 21.");
        if (a == n || b == n || (a + b) == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
