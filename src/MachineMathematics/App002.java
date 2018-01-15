package MachineMathematics;

import java.math.BigDecimal;

public class App002 {
    public static void main(String[] args) {
        double pi = 3.141592653;

        String str = "2.7182818284590452";

        BigDecimal e = new BigDecimal(str);

        System.out.println("pi = " + pi);
        System.out.println("e = " + e);
    }
}
