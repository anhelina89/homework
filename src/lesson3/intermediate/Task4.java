package lesson3.intermediate;

/**
 * Created by apodushkina on 23.01.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        String a = "test523t2";
        int sum=0;

        for(int i=0; i<a.length(); i++){
            if (Character.isDigit(a.charAt(i))){
                int b = Integer.parseInt(String.valueOf(a.charAt(i)));
                sum=(sum+b);
            }
        }
        System.out.println("The sum of the numbers appearing in the string, ignoring all other characters is - "+sum);

    }
}
