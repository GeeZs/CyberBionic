package Logic;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Int value: ");
        int userValue = scanner.nextInt();
        if (userValue > 0 && (userValue & (userValue -1)) == 0){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
