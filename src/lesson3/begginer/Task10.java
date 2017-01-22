package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        int b = 4;
        String a = "";

        for (int i = 1,j=b; i <= 2*(b); i++) {
            if (i <= b) {
                a = a + "*";
                System.out.println(a);
            }

               /* else{
                b=b-1;
                System.out.println(a.substring(0 , b));}

            }*/

        else {
                j=j-1;
                System.out.println(a.substring(0 , j));

                }

        }
    }}







