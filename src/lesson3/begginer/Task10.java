package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println("Create method which gets a number form 1 to 9 (for example 4) and then prints the output:");

        Task10 t10 = new Task10();
        t10.astersisks(8);

    }

    public void astersisks(int b) {
        String a = "";

        for (int i = 1, j = b; i <= 2 * (b); i++) {
            if (i <= b) {
                a = a + "*";
                System.out.println(a);
            } else {
                j = j - 1;
                System.out.println(a.substring(0, j));
            }
        }
    }
}







