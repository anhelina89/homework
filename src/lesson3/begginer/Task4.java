package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = {1,20,3,4,5,2};
        int a = 2;
        int b=0;
        for(int i=0; i<arr1.length; i++){
            if (arr1[i]==a){
              b++;
            }
        }
        System.out.println(b);

    }
}
