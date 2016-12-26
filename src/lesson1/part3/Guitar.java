package homework.lesson1.part3;

import homework.lesson1.part2.MusicInstruments;

import java.util.Scanner;

/**
 * Created by apodushkina on 16.12.2016.
 */
public class Guitar extends MusicInstruments {
    public static void main(String[] args) {
        Guitar g1=new Guitar();
        g1.setWeight(3.7);
        g1.setSize(120);
        g1.setSound("la la la");
        g1.setType("electric");
        System.out.println("Parameters of this guitar:\n"+"weight - "+ g1.getWeight()+ "kg"+"\n" + "size - "+g1.getSize()+"cm"+"\n"+"type - "+g1.getType());
        System.out.println("If you want ot test it, please answer a following question, then get the instruction or lesten to default test music:\n");
        g1.turnOnElectricity();

    }

    private static int strings = 7;
    private int price = 150;
    private String sound;



    private void makeSound() {
        System.out.println(getSound());
    }

    private void turnOnElectricity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is power is on ? ");
        System.out.print("Enter:\n 1=true \n 0=false\n");

        if (sc.hasNextInt()) {
            int answer = sc.nextInt();
            if (answer > 0) {
                makeSound();
            } else {
                System.out.println("Please turn on the electricity to play on the guitar!");
            }
        }
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void setSize(double size) {
        super.setSize(size);
    }
    public static int getStrings() {
        return strings;
    }

    public static void setStrings(int strings) {
        Guitar.strings = strings;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
