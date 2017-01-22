package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        int mark = 5;

        switch (mark) {
            case 1:
                System.out.println("Very Poor");
                break;
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Your mark was not set yet!");
        }
    }
}