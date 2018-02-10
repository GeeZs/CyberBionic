package JavaEssential.ClassesAndObjects.App004;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(11, 190, 13, "RED");
    }

    public Car(int year) {
        this(year, 170, 5, " BLUE");

    }

    public Car(int year, double speed) {
        this(year, speed, 2, "ORANGE");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "YELLOW");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
