package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App003;

class Plane extends Vehicle{
    private int height;
    private int passengersAmount;

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengersAmount=" + passengersAmount + super.toString();
    }

    Plane(int price, int speed, int year, int height, int passengersAmount) {
        super(price, speed, year);
        this.height = height;
        this.passengersAmount = passengersAmount;
    }


}
