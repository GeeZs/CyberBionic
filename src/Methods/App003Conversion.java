package Methods;

import java.util.Scanner;

public class App003Conversion {
    public static void convert(double sum, double rate){
        System.out.println(sum * rate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        convert(scanner.nextDouble(), scanner.nextDouble());
    }
}
