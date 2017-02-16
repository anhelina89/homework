package lesson3.begginer;

/**
 * Created by Angelina on 21.01.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Given an array of integers. Create a method (program) which takes two arguments - this array \n" +
                "and number that you are looking for - and returns quantity of this number in the array\n");

    Task4 t4 = new Task4();
        t4.quantityOfNum();
    }


    public void quantityOfNum(){
        int[] arr1 = {1,20,3,4,5,2};
        int a = 2;
        int b=0;
        for(int i=0; i<arr1.length; i++){
            if (arr1[i]==a){
              b++;
            }
        }
        System.out.println("Your number is - "+ a+"\n"+"The quantity of this number in the array is "+b);

    }
}
