package Methods;

import java.util.Scanner;

public class App004NumersCheck {
    public static void numCheck(int a){
        if (a >= 0){
            int count = 0;
            System.out.println("The number is Positive.");
            for (int i = 1; i <=a ; i++) {
                if ((a % i) == 0){
                    count ++;
                }
            }
            if (count <= 2){
                System.out.println("The number is Prime.");
            }else {
                System.out.println("The number isn't Prime.");
            }
        }else {
            System.out.println("The number is Negative.");
        }
        if ((a % 2) == 0 && (a % 5) == 0 && (a % 3) == 0 && (a % 6) == 0 && (a % 9) == 0){
            System.out.println("This number can be divided by 2, 5, 3, 6, 9 - WOW!!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type number to check: ");
        numCheck(scanner.nextInt());
    }
}
