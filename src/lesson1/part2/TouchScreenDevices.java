package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public abstract class TouchScreenDevices {

    private double performance;
    private boolean rechargable;
    private boolean energySaving;
    private boolean multiCardSupport;
    private boolean wiFiSupport;
    public boolean internet3G4GSupport;
    public boolean recording;
    public String shape;
    public int diagonal;
    public boolean ableInstallApps;
    public String manufacture;

    //methods started
    private void countPerformance() {
        System.out.println("Count perfrmance: "+ getPerformance());
    }

    private void selectBigHardDisks() {
    }

    private void supportMultiCard() {
    }

    private void supportWiFi() {
    }

    private void support3Or4G() {
    }

    private void supportRecording() {
    }

    private void calculateDiagonal() {
    }

    public abstract void checkInstallation(boolean autoInstallation) ;

    private void isRechargable(boolean rechargable){};

    private void isEnergySaving(boolean energySaving) {
        if (energySaving == true) {
            System.out.println("This device is energy saving.");
        } else {
            System.out.println("Poor batary");
        }
    }
    //methods finisheded


    //getters started


    public double getPerformance() {
        return performance;
    }

    public boolean isRechargable() {
        return rechargable;
    }

    public boolean isEnergySaving() {
        return energySaving;
    }

    public boolean isMultiCardSupport() {
        return multiCardSupport;
    }

    public boolean isWiFiSupport() {
        return wiFiSupport;
    }

    public boolean isInternet3G4GSupport() {
        return internet3G4GSupport;
    }

    public boolean isRecording() {
        return recording;
    }

    public String getShape() {
        return shape;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public boolean isAbleInstallApps() {
        return ableInstallApps;
    }

    //getters finished

    //setters started
    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public void setRechargable(boolean rechargable) {
        this.rechargable = rechargable;
    }

    public void setEnergySaving(boolean energySaving) {
        this.energySaving = energySaving;
    }

    public void setMultiCardSupport(boolean multiCardSupport) {
        this.multiCardSupport = multiCardSupport;
    }

    public void setWiFiSupport(boolean wiFiSupport) {
        this.wiFiSupport = wiFiSupport;
    }

    public void setInternet3G4GSupport(boolean internet3G4GSupport) {
        this.internet3G4GSupport = internet3G4GSupport;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setAbleInstallApps(boolean ableInstallApps) {
        this.ableInstallApps = ableInstallApps;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    //setters started

}
