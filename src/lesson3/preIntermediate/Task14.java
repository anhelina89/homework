package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task14 {
    public static void main(String[] args) {
        String a = "Test";
        char[] b = a.toCharArray();
        for (int i=0; i<b.length; i++){
            for (int j=0; j<b.length; j++){
                if (j==i) {
                    System.out.print(b[i]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
