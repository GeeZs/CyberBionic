package Logic;

public class App003LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        x += y >> x++ * z;
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
        z = ++x & y * 5;
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
        y /= x + 5 | z;
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
        z = x++ & y * 5;
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
        x = y << x ++ ^ z;
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
    }
}
