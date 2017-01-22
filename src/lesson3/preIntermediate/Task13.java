package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int c=-3;
        double x1;
        double x2;

        double d = ((Math.pow(b,2))-(4*a*c));
        x1=(-b-Math.sqrt(d))/2*a;
        x2=(-b+Math.sqrt(d))/2*a;

        double e = Math.pow(b,2);

        System.out.println("Result x1 = "+x1);
        System.out.println("Result x2 = "+x2);

    }
}
