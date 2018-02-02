package JavaStarter.Methods;

import java.util.Scanner;

public class App002Arithmetics {
    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void sub(int a, int b){
        System.out.println(a + b);
    }
    public static void mul(int a, int b){
        System.out.println(a + b);
    }
    public static void div(int a, int b){
        if (b != 0) {
            System.out.println(a / b);
        }else {
            System.out.println("Error : divided byy zero");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type operand № 1:");
        int operand1 = scanner.nextInt();

        System.out.println("Please type operand № 2:");
        int operand2 = scanner.nextInt();

        System.out.println("Please type operation:");
        String sign = scanner.next();

        switch (sign){
            case "+" : {
                add(operand1, operand2);
            }
            case "-" : {
                sub(operand1, operand2);
            }
            case "*" : {
                mul(operand1, operand2);
            }
            case "/" : {
                div(operand1, operand2);
            }
            default:
                System.out.println("No such Operation");
        }


    }

}
