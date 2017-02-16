package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task6 {

    public static void main(String[] args) {
        System.out.println("Print all even numbers from range (0..50). Try to solve this in more than one way");

        Task6 t6 = new Task6();
        t6.evenNum();
    }

    public void evenNum(){
        for(int i=0; i<50; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
