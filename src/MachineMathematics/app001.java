package MachineMathematics;

import java.util.Random;

public class app001 {
    public static void main(String[] args) {
        byte byteVar = Byte.MAX_VALUE;
        short shortVar = Short.MAX_VALUE;
        int intVar = Integer.MAX_VALUE;
        long longVar = Long.MAX_VALUE;
        boolean booleanVar = new Random().nextBoolean();
        double doubleVar = Double.MAX_VALUE;
        float floatVar = Float.MAX_VALUE;
        char charVar = Character.MAX_VALUE;
        System.out.println("charVar = " + charVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("booleanVar = " + booleanVar);
        System.out.println("longVar = " + longVar);
        System.out.println("intVar = " + intVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("byteVar = " + byteVar);



    }
}
