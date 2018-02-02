package JavaStarter.Logic;

import java.util.Scanner;

public class App002Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Int Value: ");
        int userValue = scanner.nextInt();
        if (userValue % 2 == 0){
            System.out.println("Grats! You've typed even number");
        }else{
            System.out.println("Not even.");
        }

        if ((1 & userValue) == 0){
            System.out.println("Grats! You've typed even number");
        }else{
            System.out.println("Not even.");
        }
    }
}
