package JavaEssential.OOP.App004;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(new Random().nextInt(10000), i+1);
        }
        Computer.printComputers(computers);
    }
}
