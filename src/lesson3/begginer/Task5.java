package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("There are several marks in the school: from 1 to 5 (the highest). Create a method (program) \n" +
                "which takes a mark and return your result (for ex. \"Excellent\", \"Good\", \"Failed\" etc.). Please do \n" +
                "not use if...else condition\n");
        Task5 t5 = new Task5();
        t5.markToText(5);
    }

    public void markToText(int mark) {
        System.out.print("Your mark is - "+ mark+" = ");

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