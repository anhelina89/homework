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
            qa.name = "Bob";
            qa.position = "Senior";
            qa.experienceYears = 8;
            qa.setAge(28);
            qa.setSex("male");
            qa.setPoliteness(true);
            qa.makeGoodJob();
            qa.setRealWorkingHourse(5);
            qa.countPerformanceAtWork();
            System.out.println("Please check disk D:/ and find a file employeeInfo.txt with information about Bob");

            QAspecialist.write(fileName, text);

        }

    private String name;
    private String position;
    private String speciality;
    private int experienceYears;
    private boolean sertifiedSpecialist;
    private static int manHoursPerDay = 6;
    private int realWorkingHourse;
    private static String text = "Employee info: \n name - Bob \n position - senior \n experienceYears - 8 years";
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
        double p=(this.realWorkingHourse*100)/this.manHoursPerDay;
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
}
