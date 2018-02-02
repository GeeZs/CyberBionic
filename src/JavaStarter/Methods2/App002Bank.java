package JavaStarter.Methods2;

public class App002Bank {
    static int accBalance = 10000;
    static void checkAccStatus(int sum){
        if (accBalance - sum == 0){
            System.out.println("Dept repaid.");
        }else if (accBalance - sum > 0){
            System.out.println("The sum of dept: " + (accBalance - sum) + " $.");
        }else{
            System.out.println("Overpayments: " + Math.abs(accBalance - sum) + " $.");
        }
    }

    public static void main(String[] args) {
        checkAccStatus(1000);
    }


}
