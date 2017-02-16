package lesson3.preIntermediate;

/**
 * Created by Angelina on 22.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        System.out.println("Couple went to the cinema? - " + t1.goCinema());
    }

    boolean heSmile = false;
    boolean sheSmile = false;

    public String goCinema() {
        String result;
        if (heSmile == sheSmile) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }
}
