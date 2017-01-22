package lesson3.intermediate;

/**
 * Created by Angelina on 23.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int num;
        int[] mas = new int[6];
        int n=0;

        for (num=001000; num<1000000; num++) {

            for (int i=0;i<6; i++) {
                int f=(num % 10);
                num = num / 10;
                mas[i]=f;
            }
            if ((mas[0]+mas[1]+mas[2])==(mas[3]+mas[4]+mas[5])){
                n++;
            }
        }
        System.out.println("Lucky ticket was found: "+n);
    }
}
