package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Task8 t8 = new Task8();
        t8.fibonacci();
    }

    public void fibonacci() {
        System.out.println("Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence");
        double a = 0;
        double b = 1;
        double fib = a + b;
        int maxElement = 100;
        int currentNum = 2;

        while (currentNum <= maxElement) {
            a = b;
            b = fib;
            fib = a + b;
            currentNum++;
            if (fib % 2 != 0) {
                System.out.println(fib);
            }
        }

    }
}
