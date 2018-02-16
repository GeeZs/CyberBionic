package JavaEssential.HomeWork_006_StaticAndNestedClasses.App002;

class Main{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();

        vehicle.print();
        wheel.print();
        door.print();
    }
}
