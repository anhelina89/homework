package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task2 {

    public static int correct = 10;

    public static void main(String[] args) {

        System.out.println("Task2 - Given two integers, x and y. Create a method (program) which returns True if one of them is 10 or if their sum is 10");
        Task2 t2 = new Task2();
        t2.task2(10, 34);

    }

    public void task2(int x, int y) {
        if (x == correct || y == correct || (x + y) == correct) {
            System.out.println("correct");
        } else {
            System.out.println("wrong");
        }
    }
}