package lesson3.preIntermediate;

import java.util.Arrays;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task2 {
    String init = "Cool text";
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.modifiedStr();
    }


    public void modifiedStr(){
        System.out.println("Write a method which swaps first and last characters and returns a new modified string:swapChar(\"Cool text\") → \"tool texC“");
        System.out.println("The initial str - "+init);
        char[] initChar = init.toCharArray();
            char temp = initChar[0];
            initChar[0]=initChar[initChar.length-1];
            initChar[initChar.length-1]=temp;

            System.out.println("The modified str - "+Arrays.toString(initChar));
    }
}
