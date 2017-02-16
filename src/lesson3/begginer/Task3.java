package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Create a method (program) which returns True if the given non-negative number is a multiple of 3 or a multiple of 5");

        Task3 t3 = new Task3();
        t3.check10(8);
    }

    public void check10(int x) {
        if (x > 0 && (x % 3 == 0 || x % 5 == 0)) {
            System.out.println("Your number is "+ x+"\n"+"Result - " + true);
        } else {
            System.out.println("Your number is "+ x+"\n"+"Result - " + false);
        }
    }
}
