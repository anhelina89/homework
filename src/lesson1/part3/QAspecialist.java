package homework.lesson1.part3;

import homework.lesson1.part2.WorkerOfCompany;
import java.io.*;

/**
 * Created by Angelina on 20.12.2016.

 */
public class QAspecialist extends WorkerOfCompany{
    public QAspecialist() throws IOException {}
        public static void main (String[]args) throws IOException {
            QAspecialist qa = new QAspecialist();
            qa.setName("Bob");
            qa.setPosition("Senior");
            qa.setExperienceYears(8);
            qa.setAge(28);
            qa.setSex("male");
            qa.setSpeciality("QA");
            qa.setPoliteness(true);
            qa.setRealWorkingHourse(5);
            qa.makeGoodJob();
            qa.setRealWorkingHourse(5);
            qa.countPerformanceAtWork();
            String text = "Employee info: \n "
                    +"name - " + qa.getName()+ "\n "
                    +"sex - "+ qa.getSex()+ " \n "
                    +"position - "+qa.getPosition()+" \n "
                    +"experience in the " +qa.getSpeciality() +" - "+qa.getExperienceYears()+" years";
            System.out.println("Please check "+getFileName()+" with information about "+qa.getName());

            QAspecialist.write(fileName, text);

        }



    private String name;
    private String position;
    private String speciality;
    private int experienceYears;
    private boolean sertifiedSpecialist;
    private static int manHoursPerDay=8;

    private int realWorkingHourse;


    private static String fileName = "D:\\employeeInfo.txt";

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);
        try (FileWriter writer = new FileWriter("D:\\employeeInfo.txt", false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }}

    private void makeGoodJob(){
        if (isPoliteness() && getAge()<30 ){
            System.out.println("you are young specialist!");
        }
        else{
            System.out.println("you should be a specialist with big experience!");
        }
    }

    @Override
    public void countPerformanceAtWork() {
        double p=(getRealWorkingHourse()*100)/this.manHoursPerDay;
        System.out.println("Real performance is - "+p+"%");
    }
    @Override
    public void setPoliteness(boolean politeness) {
        super.setPoliteness(politeness==true);
    }
    @Override
    public void setResponsiveness(boolean responsiveness) {
        super.setResponsiveness(responsiveness=true);
    }
    public int setRealWorkingHourse(int realWorkingHourse) {
       return this.realWorkingHourse = realWorkingHourse;
    }
    public int getRealWorkingHourse() {
        return realWorkingHourse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setSertifiedSpecialist(boolean sertifiedSpecialist) {
        this.sertifiedSpecialist = sertifiedSpecialist;
    }
    public static void setManHoursPerDay(int manHoursPerDay) {
        QAspecialist.manHoursPerDay = manHoursPerDay;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public boolean isSertifiedSpecialist() {
        return sertifiedSpecialist;
    }

    public static int getManHoursPerDay() {
        return manHoursPerDay;
    }
    public static String getFileName() {
        return fileName;
    }


}
