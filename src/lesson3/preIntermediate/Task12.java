package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task12 {
    public static void main(String[] args) {
        int myInt = 1234569999;
        int amountOfDigits=0;

        while(myInt>0){
            amountOfDigits=amountOfDigits+myInt%10;
            myInt=myInt/10;
        }
        System.out.println("amount of digits = "+amountOfDigits);
    }
}
