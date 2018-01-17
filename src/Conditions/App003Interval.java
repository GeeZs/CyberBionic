package Conditions;


import java.util.Scanner;

public class App003Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number :");
        int userNum = scanner.nextInt();
        if (userNum >= 0 && userNum <= 14){
            System.out.println("The interval of your number is [0 - 14]");
        }else if (userNum >= 15 && userNum <= 35){
            System.out.println("The interval of your number is [15 - 35]");
        }else if (userNum >= 36 && userNum <= 50){
            System.out.println("The interval of your number is [36 - 50]");
        }else if (userNum >= 51 && userNum <= 100){
            System.out.println("The interval of your number is [51 - 100]");
        }else{
            System.out.println("Your number is out of range.");
        }
    }
}
