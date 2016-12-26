package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class CustomerGoods {


    public static void main(String[] args) {
        CustomerGoods cg= new CustomerGoods();
        cg.setTea(30);
        cg.setWater(1);
        cg.setSalt(20);
        cg.setPotato(6);
        cg.setCoffee(50);
        cg.setSugar(80);
        cg.prepareDinner();
    }

    //food related
    private int meet;
    private int egg;
    private int potato;
    private int cucumber;
    private int tomato;
    private int pasta;
    private int bread;
    private int tea;
    private int coffee;
    private double sugar;
    private int water;
    private double salt;

    //non-food related
    private int washingPowder;
    private int soup;
    private int shampoo;
    private int bodyWash;
    private int dishwasherGel;


    //my methods started
    public double countMeet(int nuOfPersons, double weightPerPerson) {
        return  nuOfPersons*weightPerPerson;
    }

    public void prepareTeaCup() {
        checkWater();
        addSugar();
        System.out.println("Be sure that "+getTea()+" gr of tea was added and enjoy your tea");
    }

    public void buy() {
        System.out.println("Follow the list with goods and add it to the basket. Don't forget to pay at the checkout");
    }

    public void prepareDinner() {
        checkWater();
        addSalt();
        boilWater();
        getPotato();
        cutPotato();
        getEgg();
        getMeet();
        getPasta();
        getTomato();
        prepareTeaCup();
    }

    public void checkWater() {
        System.out.println("There is a "+ getWater()+" litrs of water inside.");
    }

    public void addSalt() {
        System.out.println("Add "+ getSalt()+" gr of salt as was described in the recipe");
    }

    public void addSugar() {
        System.out.println("Add "+getSugar()+ " gr of sugar to each cup");
    }

    public void cutPotato() {
        System.out.println("Cut "+getPotato()+ " potatoes into 6 parts");
    }

    public void grindCoffee() {
        System.out.println("Grin "+getCoffee()+ " gr of coffe");
    }

    public void selectBread() {
        System.out.println("Select fresh bread");
    }

    public void boilWater(){
        System.out.println("We have " +getWater()+" of water with 100 C");
    }
    //my methods finished

    //setters started
    public void setMeet(int meet) {

        this.meet = meet;
    }

    public void setPotato(int potato) {

        this.potato = potato;
    }

    public void setCucumber(int cucumber) {

        this.cucumber = cucumber;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setPasta(int pasta) {

        this.pasta = pasta;
    }

    public void setBread(int bread) {

        this.bread = bread;
    }

    public void setTea(int tea) {

        this.tea = tea;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public void setWashingPowder(int washingPowder) {
        this.washingPowder = washingPowder;
    }

    public void setSoup(int soup) {
        this.soup = soup;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public void setBodyWash(int bodyWash) {
        this.bodyWash = bodyWash;
    }

    public void setDishwasherGel(int dishwasherGel) {
        this.dishwasherGel = dishwasherGel;
    }
    //setters finished

    //getters started

    public int getMeet() {
        return meet;
    }

    public int getEgg() {
        return egg;
    }

    public int getPotato() {
        return potato;
    }

    public int getCucumber() {
        return cucumber;
    }

    public int getTomato() {
        return tomato;
    }

    public int getPasta() {
        return pasta;
    }

    public int getBread() {
        return bread;
    }

    public int getTea() {
        return tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public double getSugar() {
        return sugar;
    }

    public int getWater() {
        return water;
    }

    public double getSalt() {
        return salt;
    }

    public int getWashingPowder() {
        return washingPowder;
    }

    public int getSoup() {
        return soup;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getBodyWash() {
        return bodyWash;
    }

    public int getDishwasherGel() {
        return dishwasherGel;
    }
    //getters finished


}
