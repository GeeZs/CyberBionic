package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App003;

class Vehicle {
    private int price;
    private int speed;
    private int year;

    Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return ", " +
                "price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
