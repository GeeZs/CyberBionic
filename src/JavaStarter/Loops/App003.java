package JavaStarter.Loops;

public class App003 {
    public static void main(String[] args) {
        // Rectangle
        int x = 5, y = 15;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        // Right triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Equilateral triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print(" ");                
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Rhombus
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int n = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3 - i - n; j++) {
                System.out.print("*");
            }
            n++;
            System.out.println();
        }
        System.out.println("The end!");
    }
}
