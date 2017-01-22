package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int correct = 10;
        int x = 8;
        int y = 2;

        if (x == correct || y==correct || (x+y)==correct){
            System.out.println("correct");
        }
        else{
            System.out.println("wrong");
        }
    }
}
