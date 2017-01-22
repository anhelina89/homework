package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        String init = "Cool text";
        char[] initChar = init.toCharArray();
            char temp = initChar[0];
            initChar[0]=initChar[initChar.length-1];
            initChar[initChar.length-1]=temp;
            System.out.println(initChar);
    }
}
