package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 *  *Error:(11, 28) java: main(java.lang.String[]) in homework.lesson1.part3.QAspecialist cannot override main(java.lang.String[]) in homework.lesson1.part2.WorkerOfCompany
 overridden method does not throw java.io.IOException
 */
public class WorkerOfCompany {

    private boolean politeness;
    private boolean responsibility;
    private boolean responsiveness;
    private boolean hardWorking;
    private boolean smart;
    private boolean flexibility;
    private boolean selfLearning;
    private boolean selfMotivating;
    private boolean teamPlayer;
    private int age;
    private String sex;

    //my methods started
    public void bePolite() {
    }

    public void beResponsible() {
        System.out.println("Each employee has to be responsible for his/her tasks");
    }

    public void beResponsive() {
        System.out.println("Responsive persone is very valuable in the team");
    }

    public void countPerformanceAtWork() {
        System.out.println("Devide hours/day that this person work in average on 8 and then multiply on 100 to recieve xx.xx%");
    }

    public void estimateMindAbility() {
        System.out.println("Make an estiamtion based on the approaches that employee has used in the hard task solving");
    }

    public void estimateFlexibility() {
        System.out.println("Is worker can change his/her timetable?");
    }

    public void selfLearningPersentage() {
        System.out.println("How much materials employee can learn his/her own?");
    }

    public void countMiddleAgePeople() {
        System.out.println("Count the middle age of your employees ");
    }

    public void countMen() {
        System.out.println("Count how mnay people do you have in the company/office/project");
    }
    //my methods finished

    //setters started
    public void setPoliteness(boolean politeness) {
        this.politeness = politeness;
    }

    public void setResponsibility(boolean responsibility) {
        this.responsibility = responsibility;
    }

    public void setResponsiveness(boolean responsiveness) {
        this.responsiveness = responsiveness;
    }

    public void setHardWorking(boolean hardWorking) {
        this.hardWorking = hardWorking;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void setFlexibility(boolean flexibility) {
        this.flexibility = flexibility;
    }

    public void setSelfLearning(boolean selfLearning) {
        this.selfLearning = selfLearning;
    }

    public void setSelfMotivating(boolean selfMotivating) {
        this.selfMotivating = selfMotivating;
    }

    public void setTeamPlayer(boolean teamPlayer) {
        this.teamPlayer = teamPlayer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //stters finished

    //getters started

    public boolean isPoliteness() {
        return politeness;
    }

    public boolean isResponsibility() {
        return responsibility;
    }

    public boolean isResponsiveness() {
        return responsiveness;
    }

    public boolean isHardWorking() {
        return hardWorking;
    }

    public boolean isSmart() {
        return smart;
    }

    public boolean isFlexibility() {
        return flexibility;
    }

    public boolean isSelfLearning() {
        return selfLearning;
    }

    public boolean isSelfMotivating() {
        return selfMotivating;
    }

    public boolean isTeamPlayer() {
        return teamPlayer;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    //getters finished
}
