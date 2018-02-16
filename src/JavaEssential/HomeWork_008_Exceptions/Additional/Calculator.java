package JavaEssential.HomeWork_008_Exceptions.Additional;

import java.util.Scanner;

class Calculator {
    double addition(double operand1, double operand2){return operand1 + operand2;}
    double subtraction(double operand1, double operand2){return operand1 - operand2;}
    double division(double operand1, double operand2) throws Exception {
        if (operand2 == 0){
            throw new Exception("My own Exception.");
        }
        return operand1 / operand2;
    }
    double multiplication(double operand1, double operand2){return operand1 * operand2;}
}

class Main{

    private static double getOperand(){
        System.out.println("Type operand: ");
        return new Scanner(System.in).nextDouble();
    }
    private static String getArithmeticOperation(){
        System.out.println("Type operation: ");
        return new Scanner(System.in).nextLine().toLowerCase();
    }

    public static void main(String[] args) throws Exception{
        /*Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Bad idea" + e.getClass());
            }
        });*/

        double firstOperand = getOperand();
        double secondOperand = getOperand();
        String arithmeticOperation = getArithmeticOperation();
        Calculator calc = new Calculator();

        switch (arithmeticOperation){
            case "add" : System.out.println("Addition: " + firstOperand + " + " + secondOperand + " = " + calc.addition(firstOperand, secondOperand));
                break;

            case "sub" : System.out.println("Subtraction: " + firstOperand + " - " + secondOperand + " = " + calc.subtraction(firstOperand, secondOperand));
                break;

            case "div" : System.out.println("Division: " + firstOperand + " / "
                    + secondOperand + " = "
                    + calc.division(firstOperand, secondOperand));
                try {
                    System.out.println("Division: " + firstOperand + " / "
                            + secondOperand + " = "
                            + calc.division(firstOperand, secondOperand));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case "mul" : System.out.println("Multiplication: " + firstOperand + " * " + secondOperand + " = " + calc.multiplication(firstOperand, secondOperand));
                break;
            default:
                System.out.println("No such operation.");
        }
    }
}
