package lesson3.intermediate;


/**
 * Created by apodushkina on 23.01.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Task6 t6 = new Task6();
        System.out.println("The longest word in the input string is - " + t6.longestWord());
    }

    String record = "Java строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems";
    int n = 0;
    int l;
    String m = "a";

    public String longestWord() {
        String[] masWord = record.split(" ");

        for (int i = 0; i < masWord.length; i++) {
            char[] masChar = masWord[i].toCharArray();
            l = masChar.length;
            //System.out.println(l);

            if (l > n) {
                n = l;
                m = String.valueOf(masChar);
            }
        }

        return m;
    }
}
