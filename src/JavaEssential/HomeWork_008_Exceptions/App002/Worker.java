package JavaEssential.HomeWork_008_Exceptions.App002;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Worker {
    private String firstName;
    private String secondName;
    private String jobPosition;
    private String employmentYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(String employmentYear) {
        this.employmentYear = employmentYear;
    }

    public Worker(String firstName, String secondName, String jobPosition, String employmentYear) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobPosition = jobPosition;
        this.employmentYear = employmentYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", employmentYear=" + employmentYear +
                '}';
    }
}
class Main{
    private static String getYear(){
        String year = new Scanner(System.in).nextLine();
        if (year != null){
            try {
                Date date = new SimpleDateFormat("yyyy").parse(year);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return year;
    }
    private static Worker[] newWorkers(int length){
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[length];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), getYear());
        }
        return workers;
    }
    private static void printWorkers(Worker[] workers, int experience){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (Worker worker: workers) {
            if ((currentYear - Integer.parseInt(worker.getEmploymentYear())) > experience){
                System.out.println(worker.toString());
            }
        }
    }

    public static void main(String[] args) {
        Worker[] workers = newWorkers(5);
        printWorkers(workers, new Scanner(System.in).nextInt());

    }
}
