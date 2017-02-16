package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task12 {
    public static void main(String[] args) {
        Task12 t12 = new Task12();
        t12.superpowerCheck();
    }

    int myInt = 1234569999;
    int amountOfDigits = 0;

    public void superpowerCheck() {
        System.out.println("Imagine that you have a special skill which allows to calculate amount of digits in any integer positive number. For example, if number is 12345, amount=15. Write a method which checks your superpower for any hard-coded number.");
        while (myInt > 0) {
            amountOfDigits = amountOfDigits + myInt % 10;
            myInt = myInt / 10;
        }
        System.out.println("amount of digits = " + amountOfDigits);
    }
}
