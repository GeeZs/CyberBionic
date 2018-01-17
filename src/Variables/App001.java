package Variables;

public class App001 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;
        x += y - x++ * z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        z = --x - y * 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        y /= x = 5 % z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        z = x++ + y *5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        x = y - x++ * z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
