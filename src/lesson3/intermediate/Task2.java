package lesson3.intermediate;

/**
 * Created by Angelina on 23.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        System.out.println("Number of lucky ticckets = " + t2.luckyTickets());
    }
    int amount = 0;

    public int luckyTickets() {
        System.out.println("Lucky tickets. As you may know tram tickets have numbering in the range from 000 001 to 999 999.\n" +
                "Many people try to find a lucky ticket, where the sum of the first three digits = the sum of the second\n" +
                "three digits. For example, 205 151 is a lucky ticket. Write a program for calculating of how many lucky\n" +
                "tickets people can find in the one roll\n");
        for (int num = 1001; num < 10000000; num++) {

            int i1 = num / 100000 % 10,
                    i2 = num / 10000 % 10,
                    i3 = num / 1000 % 10,
                    i4 = num / 100 % 10,
                    i5 = num / 10 % 10,
                    i6 = num % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                amount++;
            }
        }
        return amount;
    }
}