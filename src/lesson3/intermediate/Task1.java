package lesson3.intermediate;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.superpower();

    }

    Scanner sc = new Scanner(System.in);
    int userInput;
    int a = 0;

    public void superpower() {
        System.out.println("Task1 - Superpower (complicated). Imagine that you have a special skill which allows to calculate amount of digits in any integer positive number." + "\n" + "For example, if number is 12345, amount=15. Write a program which checks your superpower when user enters necessary number via console (in IDE). Use error guessing technique for provide additional checks" + "\n");
        System.out.println("Please enter your positive, integer number:");

        if (sc.hasNextInt())

        {
            userInput = sc.nextInt();
            while (userInput > 0) {
                a = a + userInput % 10;
                userInput = userInput / 10;
//&& sc.nextInt()>=0 && sc.nextInt()<MAX_VALUE
            }
            System.out.println(a);
        } else

        {
            System.out.println("Error! You have entered wrong number!" + '\n' + "Please enter positive number that is less than " + MAX_VALUE);
        }
    }

}
