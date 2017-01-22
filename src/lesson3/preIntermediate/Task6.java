package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        int sum=0;
        double avg;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        avg=(double) sum/(arr.length-1);
        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}
