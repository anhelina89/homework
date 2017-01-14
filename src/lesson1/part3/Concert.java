package lesson1.part3;
import homework.lesson1.part2.Entertainments;

/**
 * Created by Angelina on 14.01.2017.
 */
public class Concert extends Entertainments{
    public static void main(String[] args) {
        Concert c = new Concert();
        c.name="Simphoni";
        c.setSafe(88.3);
        c.sellTickets();
        c.calculateFun();
        c.checkSecurity();
        c.countIncome();
    }
    private String name;
    private void sellTickets(){
        System.out.println("You have to buy a tickets to visit this concert!");
    }
}
