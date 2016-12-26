package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class Entertainments {
    public static void main(String[] args) {
        Entertainments en = new Entertainments();
        en.countIncome();
        en.checkAbleLocation();
        en.checkSecurity();
        en.selectTargetPeople();
        en.getNumOfPeopleInvolved();
        en.approveOriginCountry();
        en.calculateFun();
    }

    public String type; // active or not
    public String targetGroup; //old, middle,
    public boolean safe;
    public int numberOfInvolvedPeople;
    public String supportingComponents; // musicInstruments, toys, fireworks, animals in the circle
    public int numOfPeopleInvolved;
    public String originCountry;
    public String location;
    public double widespreadPersentage;
    public boolean isReligious;

    //methods started
    public void playGame() {
        System.out.println("select particular game and follow the rools");
    }

    public void playMusic() {
        System.out.println("select instrument and play");
    }

    public void selectTargetPeople() {
        System.out.println("Chose only target zone");
    }

    public void checkSecurity() {
        System.out.println("Be sure that entertainment is secure");
    }

    public void checkAbleLocation() {
        System.out.println("Check location and be sure that it is suitable and safe for particular entertaiment");
    }

    public void invitePeople() {
        selectTargetPeople();
        System.out.println("send an inviatation emails to target people");
    }

    public void approveOriginCountry() {
        System.out.println("Check the origin country to be aware about root-causes of this event");
    }

    public void countWidespread() {
        checkAbleLocation();
        System.out.println("Be sure that it is a common entertainment in the particular location");
    }

    public void countIncome() {
        System.out.println("Check the payback of events");
    }

    public void calculateFun() {
        System.out.println("Check that people a glad to visit this event next time");
    }


    // methods finished


    //setters started
    public void setType(String type) {
        this.type = type;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public void setNumberOfInvolvedPeople(int numberOfInvolvedPeople) {
        this.numberOfInvolvedPeople = numberOfInvolvedPeople;
    }

    public void setSupportingComponents(String supportingComponents) {
        this.supportingComponents = supportingComponents;
    }

    public void setNumOfPeopleInvolved(int numOfPeopleInvolved) {
        this.numOfPeopleInvolved = numOfPeopleInvolved;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWidespreadPersentage(double widespreadPersentage) {
        this.widespreadPersentage = widespreadPersentage;
    }

    public void setReligious(boolean religious) {
        isReligious = religious;
    }
    //setters finished

    //getter started

    public String getType() {
        return type;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public boolean isSafe() {
        return safe;
    }

    public int getNumberOfInvolvedPeople() {
        return numberOfInvolvedPeople;
    }

    public String getSupportingComponents() {
        return supportingComponents;
    }

    public int getNumOfPeopleInvolved() {
        return numOfPeopleInvolved;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getLocation() {
        return location;
    }

    public double getWidespreadPersentage() {
        return widespreadPersentage;
    }

    public boolean isReligious() {
        return isReligious;
    }
    //getter started

}
