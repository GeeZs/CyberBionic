package JavaEssential.HomeWork_006_StaticAndNestedClasses.Additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a, b;
        String arithmeticOperation;
        System.out.println("Type first operand: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.println("Type first operand: ");
        b = scanner.nextDouble();
        System.out.println("What do you want to do?");
        arithmeticOperation = scanner.nextLine().toLowerCase();

        switch (arithmeticOperation){
            case "add" : System.out.println("Addition: " + a + " + " + b + " = " + calc.addition(a, b));
            case "subtract" : System.out.println("Subtraction: " + a + " - " + b + " = " + calc.subtraction(a, b));
            case "divide" : System.out.println("Division: " + a + " / " + b + " = " + calc.division(a, b));
            case "multiply" : System.out.println("Multiplication: " + a + " * " + b + " = " + calc.multiplication(a, b));
            default:
                System.out.println("всё равно никто не проверяет домашку");
        }






    }
}
