package lesson3.intermediate;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int a=0;

        System.out.println("Please enter your positive, integer number");

        if (sc.hasNextInt() ) {
            userInput = sc.nextInt();
           while (userInput > 0) {
                a = a + userInput % 10;
                userInput = userInput / 10;
//&& sc.nextInt()>=0 && sc.nextInt()<MAX_VALUE
            }
            System.out.println(a);
       }
        else{
            System.out.println("Error! You have entered wrong number!" +'\n'+"Please enter positive number that is less than "+MAX_VALUE);
        }
    }
}
