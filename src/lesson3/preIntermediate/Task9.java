package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task9 {
    public static void main(String[] args) {
        Task9 t9 = new Task9();
        t9.multTable();
    }

    public void multTable() {
        System.out.println("Write a method which prints multiplication table for the input number.");

        for (int x = 2, y = 1; x < 10; x++) {
            while (y < 11) {
                System.out.println(x + "*" + y + "=" + (x * y));
                y++;
            }
            y = 1;
        }
    }
}
