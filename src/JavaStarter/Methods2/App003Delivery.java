package JavaStarter.Methods2;

import java.util.Scanner;

public class App003Delivery {
    static int getFactorial(int num){
        if (num == 1){
            return 1;
        }
        return getFactorial(num -1) * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(getFactorial(N));
    }
}
