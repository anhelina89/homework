package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class Applications {


    public static void main(String[] args) {
        Applications app = new Applications();
        app.setActive(true);
        app.setAutoInstallation(true);
        app.start();
        app.showData();
        app.update();
        app.stop();

    }

    private boolean autoInstallation;
    private boolean simpleDeinstallation;
    private boolean active; //state
    private boolean artificialIntelligence;
    private boolean maintainSession; //
    private double memoryUsage;
    private String type; //desctop or web
    private int amountOfUsers; // maintain simultaniously
    private boolean free;
    private double prevalencePercentage; // how many users are using it
    private boolean newVersion;

    //mothods started
    public boolean start() {
        if (getActive() == true) {
            return active;
        } else {
            System.out.println("Please turn App on!");
            return false;
        }
    }

    private void stop() {
        System.out.println("The app was stopped and closed! ");
    }

    private void update()
    {

        if (isAutoInstallation()==true && isNewVersion()==true) {
            System.out.println("The app was updated to the latest version");
        }
        else{
            System.out.println("Investiagtion is needed for update");
        }
    }

    private void showData() {
        System.out.println("This is data of current app");
    }
    // methods finished


    //getters started


    public boolean isAutoInstallation() {
        return autoInstallation;
    }

    public boolean isSimpleDeinstallation() {
        return simpleDeinstallation;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isArtificialIntelligence() {
        return artificialIntelligence;
    }

    public boolean isMaintainSession() {
        return maintainSession;
    }

    public double getMemoryUsage() {
        return memoryUsage;
    }

    public String getType() {
        return type;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public boolean isFree() {
        return free;
    }

    public double getPrevalencePercentage() {
        return prevalencePercentage;
    }
    //getters finished

    // setters started
    public void setAutoInstallation(boolean autoInstallation) {
        this.autoInstallation = autoInstallation;
    }

    public void setSimpleDeinstallation(boolean simpleDeinstallation) {
        this.simpleDeinstallation = simpleDeinstallation;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setArtificialIntelligence(boolean artificialIntelligence) {
        this.artificialIntelligence = artificialIntelligence;
    }

    public void setMaintainSession(boolean maintainSession) {
        this.maintainSession = maintainSession;
    }

    public void setMemoryUsage(double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmountOfUsers(int amountOfUsers) {
        this.amountOfUsers = amountOfUsers;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public void setPrevalencePercentage(double prevalencePercentage) {
        this.prevalencePercentage = prevalencePercentage;
    }

    public boolean getActive() {
        return active;
    }

    public boolean isNewVersion() {
        return newVersion;
    }

    // setters finished


}
