package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App003;

class Car extends Vehicle{

    Car(int price, int speed, int year) {
        super(price, speed, year);
    }

    @Override
    public String toString() {
        return "Car{ Car" + super.toString();
    }
}
