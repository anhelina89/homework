package homework.lesson1.part3;

import homework.lesson1.part2.TouchScreenDevices;

/**
 * Created by Angelina on 18.12.2016.
 */
public class Tablet extends TouchScreenDevices {

    public static void main(String[] args) {
        Tablet tab1 = new Tablet();
        tab1.setAbleToPhone(true);
        tab1.setPhotoProgrammProfessional("Photoshop support");
        tab1.setOperationSystem("Win7");
        tab1.setRechargeSpead(60);//min
        System.out.println("This tablet has following characteristics:\n"+
                "Able to make a call - "+ tab1.isAbleToPhone() +"\n"
                +"photo tool - "+tab1.getPhotoProgrammProfessional()+"\n"
                +"Default OS - "+tab1.getOperationSystem()+"\n"
                +"Recharging spead - "+tab1.getRechargeSpead()+"min"+"\n");

        tab1.synchronizeData();


    }

    //new variables
    private String operationSystem ;
    private boolean ableToPhone;
    private int rechargeSpead;
    private String photoProgrammProfessional;
    private boolean newPhotos;

    //new methods
    private void readBook(){
        System.out.println("Check that user can open books in pdf,doc foramts");
    }
    private void useNotePad(){
        System.out.println("Check that NotePad is installed and user can open/write/edit/delete/save text from it");
    }
    private void useGPS(){
        System.out.println("Open GPS and test that it shows your location correctly");
    }
    public void sendPhoto() {
        if (isNewPhotos() == true) {
            System.out.println("Send photo to another devise and check that it was recieved successfully");
        } else {
            System.out.println("You cannot send photo because you don't have new one");
        }
    }
    public void synchronizeData(){
        if (newPhotos==true){
            sendPhoto();
        }
        else{
            System.out.println("You don't have any mew photo");
        }
    }
    public void setNewPhotos(boolean newPhotos) {
        this.newPhotos = newPhotos;
    }
    public boolean isNewPhotos() {
        return newPhotos;
    }

    @Override
    public void checkInstallation(boolean autoInstallation) {
    }
    public String getOperationSystem() {
        return operationSystem;
    }
    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    public void setAbleToPhone(boolean ableToPhone) {
        this.ableToPhone = ableToPhone;
    }
    public void setRechargeSpead(int rechargeSpead) {
        this.rechargeSpead = rechargeSpead;
    }
    public void setPhotoProgrammProfessional(String photoProgrammProfessional) {
        this.photoProgrammProfessional = photoProgrammProfessional;
    }
    public String getPhotoProgrammProfessional() {
        return photoProgrammProfessional;
    }
    public int getRechargeSpead() {
        return rechargeSpead;
    }
    public boolean isAbleToPhone() {
        return ableToPhone;
    }

}
