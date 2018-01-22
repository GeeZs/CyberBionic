package Loops;

import java.util.Scanner;

public class App004Delivery {
    public static void main(String[] args) {
        System.out.println("Type the amount of customers: ");
        int customersAmount = new Scanner(System.in).nextInt();
        int variants = 1;

        do {
            variants *= customersAmount;
            customersAmount -= 1;
        }while (customersAmount > 0);

        System.out.println("There are " + variants + " variants to deliver.");

    }
}
