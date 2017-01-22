package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long fib = a+b;
        int maxElement=100;
        int currentNum=2;

        while (currentNum<=maxElement){
            a=b;
            b=fib;
            fib=a+b;
            currentNum++;
            if (fib%2!=0){
                System.out.println(fib);
            }
        }

    }
}
