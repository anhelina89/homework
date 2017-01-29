package lesson3.intermediate;


/**
 * Created by apodushkina on 23.01.2017.
 */
public class Task6 {
    public static void main(String[] args) {
//274.15 = 1
        String record = "Java строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems";
        int n=0;
        int l;
        String m = "a";

        String[] masWord = record.split(" ");

        for (int i=0; i<masWord.length; i++){
           char[] masChar = masWord[i].toCharArray();
            l=masChar.length;
            //System.out.println(l);

            if (l>n){
                n=l;
                m = String.valueOf(masChar);
             }
        }
        System.out.println("The longest word in the input string is - "+m);
    }
}
