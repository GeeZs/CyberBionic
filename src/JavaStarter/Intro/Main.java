package JavaStarter.Intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + scanner.nextLine());
    }
}
