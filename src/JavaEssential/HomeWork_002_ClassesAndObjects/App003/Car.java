package JavaEssential.HomeWork_002_ClassesAndObjects.App003;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    Car() {
        this.year = new Random().nextInt(30);
        this.speed = ThreadLocalRandom.current().nextDouble(0, 220);
        this.weight = new Random().nextInt(20);
        this.color = "SOME_COLOR";
    }

    Car(int year) {
        this.year = year;
        this.speed = ThreadLocalRandom.current().nextDouble(0, 220);
        this.weight = new Random().nextInt(20);
        this.color = "SOME_COLOR";
    }

    Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = new Random().nextInt(20);
        this.color = "SOME_COLOR";
    }

    Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "SOME_COLOR";
    }

    Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
