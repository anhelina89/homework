package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        boolean check=false;
        int[] arr = {1,2,3,4,5,6,8,10,11,12,13};

                for(int i=0; i<arr.length; i++){
                    if(arr[i]==7 || arr[i]==9){
                      check=false;
                        break;
                    }
                    else{
                        check=true;
                    }
                }
        System.out.println(check);
    }
}
