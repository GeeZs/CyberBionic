package JavaStarter.Loops;

public class Rectangle {
    public static void main(String[] args) {
        int x = 10, y = 20;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
