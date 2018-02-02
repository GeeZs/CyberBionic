package JavaStarter.Conditions;

import java.util.Scanner;

public class App002Calculator {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose the sign :");
        String sign = scanner.next();
        switch (sign){
            case "+" :
                System.out.println(operand1+operand2);
                break;
            case "-" :
                System.out.println(operand1-operand2);
                break;
            case "*" :
                System.out.println(operand1*operand2);
                break;
            case "/" :
                if (operand2 == 0){
                    System.out.println("Error: Divided by zero, you dumb ass!");
                    break;
                }else {
                    System.out.println(operand1/operand2);
                }
                break;
            default:
                System.out.println("No such a sign. Game over!");
        }
    }
}
