package JavaStarter.Methods;

public class Calculator {
    public static double avarage(int a, int b, int c){
        return (double)(a + b + c)/3;
    }

    public static void main(String[] args) {
        System.out.println(avarage(5, 7, 11));
    }
}
