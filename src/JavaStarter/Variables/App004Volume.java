package JavaStarter.Variables;

public class App004Volume {
    public static void main(String[] args) {
        double pi = Math.PI;
        int r = 10, h = 5;
        double v = pi * Math.pow(r, 2) * h;
        double s = 2 * pi * r * (r + h);

        System.out.println(v);
        System.out.println(s);

    }
}
