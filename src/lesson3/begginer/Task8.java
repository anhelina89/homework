package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Given a string and an int n. Return a string made of the first n characters of the string, followed \n" +
                "by the first n-1 characters of the string, and so on. Example:\n" +
                "yourMethod(\"Testing\", 4) → \"TestTesTeT\"\n" +
                "yourMethod(\"Testing\", 3) → \"TesTeT\"\n" +
                "yourMethod(\"Testing\", 2) → \"TeT“\n");

        Task8 t8 = new Task8();
        t8.firstCharStr();
    }

    public void firstCharStr(){
        int n=5;
        String a="Testing";
        System.out.println("Your initial string  - "+a);
       for(int i=n; n>0; n--) {
           System.out.print(a.substring(0, n));
       }
        System.out.println(" - your result");
    }
}
