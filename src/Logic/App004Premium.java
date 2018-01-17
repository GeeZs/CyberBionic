package Logic;

import java.util.Scanner;

public class App004Premium {
    public static void main(String[] args) {
        int workExperience;
        double salary;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the work experience in years: ");
        workExperience = scanner.nextInt();

        System.out.println("Type the salary amount: ");
        salary = scanner.nextDouble();

        if (workExperience < 5){
            System.out.println("Work experience - " + workExperience + " years\n" +
                                        "Salary - " + salary + "\n" +
                                                "Bonus 10% - " + (salary / 100 * 10));
        }else if (workExperience >= 5 && workExperience < 10){
            System.out.println("Work experience - " + workExperience + " years\n" +
                    "Salary - " + salary + "\n" +
                    "Bonus 15% - " + (salary / 100 * 15));
        }else if (workExperience >= 10 && workExperience < 15){
            System.out.println("Work experience - " + workExperience + " years\n" +
                    "Salary - " + salary + "\n" +
                    "Bonus 25% - " + (salary / 100 * 25));
        }else if (workExperience >= 15 && workExperience < 20){
            System.out.println("Work experience - " + workExperience + " years\n" +
                    "Salary - " + salary + "\n" +
                    "Bonus 35% - " + (salary / 100 * 35));
        }else if (workExperience >= 20 && workExperience < 25){
            System.out.println("Work experience - " + workExperience + " years\n" +
                    "Salary - " + salary + "\n" +
                    "Bonus 45% - " + (salary / 100 * 45));
        }else if (workExperience >= 25){
            System.out.println("Work experience - " + workExperience + " years\n" +
                    "Salary - " + salary + "\n" +
                    "Bonus 50% - " + (salary / 100 * 50));
        }
    }
}
