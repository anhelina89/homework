package homework.lesson1.part3;

import homework.lesson1.part2.TouchScreenDevices;

/**
 * Created by apodushkina on 16.12.2016.
 */
public class MobilePhone extends TouchScreenDevices {

    public static void main(String[] args) {
        MobilePhone mob1 = new MobilePhone();
        mob1.ableInstallApps=true;
        mob1.cleanCash();
        mob1.checkInstallation(true);

    }

    //new variables
    private String keyBoardType = "sensor";
    public static boolean microphone = true;
    private int numberOfMsg=25;
    private int numberOfCallRecords;


    //new methods
    private void takeCall() {
    }
    private String takeMsg(String msg) {
        return msg;
    }
    private void checkPhoneForTourist(){
        System.out.println("Mobile for tourists should have following charachteristics:");
    }
    private void countMsg(int numberOfMsg){
            System.out.println("Cash will be cleaned in 5 sec ... ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    private void cleanCash(){
        countMsg(numberOfMsg);
        System.out.println("Cash was cleaned");
    };
    public void setKeyBoardType(String keyBoardType) {
        this.keyBoardType = keyBoardType;
    }
    public void checkInstallation(boolean ableInstallApps){
        if (super.ableInstallApps == true) {
            System.out.println("This device can install apps automatically.");
        } else {
            System.out.println("You have to install apps on your own!");
        }
    }
    @Override
    public void setEnergySaving(boolean energySaving) {
        super.setEnergySaving(energySaving == true);
    }
    @Override
    public void setRechargable(boolean rechargable) {
        super.setRechargable(rechargable == true);
    }
    @Override
    public boolean isMultiCardSupport() {
        return super.isMultiCardSupport();
    }
    @Override
    public boolean isInternet3G4GSupport() {
        return super.isInternet3G4GSupport();
    }


}
