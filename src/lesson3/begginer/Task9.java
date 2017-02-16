package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println("Create method which takes two integers (a and b), performs their division (a/b) and outputs \n" +
                "accurate result of division (this means the result should have a decimal part, if any)\n");

        Task9 t9 = new Task9();
        t9.accurateDevide(11,3);

    }

    public void accurateDevide(int a, int b){

        double c = (double) a/b;
        System.out.println(a+"/"+b +" = "+c);
    }
}
