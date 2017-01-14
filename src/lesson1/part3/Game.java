package lesson1.part3;
import homework.lesson1.part2.Entertainments;
/**
 * Created by Angelina on 14.01.2017.
 */
public class Game extends Entertainments{
    public static void main(String[] args) {
        Game football = new Game();
        football.setType("Active");
        football.setName("Footbal");
        football.setEquipment("standart ball");
        System.out.println(football.getName()+" is an "+football.getType() +" type of sport."+"\n"
        +"It needs a pice of equipment - "+football.getEquipment());
    }

    private String name;
    private String equipment;

    public String getName() {
        return name;
    }

    public String getEquipment() {
        return equipment;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }





}
