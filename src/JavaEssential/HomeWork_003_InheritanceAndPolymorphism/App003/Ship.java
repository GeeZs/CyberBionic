package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App003;

class Ship extends Vehicle{
    private int passengersAmount;
    private String portName;

    Ship(int price, int speed, int year, int passengersAmount, String portName) {
        super(price, speed, year);
        this.passengersAmount = passengersAmount;
        this.portName = portName;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengersAmount=" + passengersAmount +
                ", portName='" + portName + '\'' + super.toString();
    }
}
