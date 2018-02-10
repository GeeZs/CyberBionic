package JavaEssential.InheritanceAndPolymorphism.App003;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Plane(1000,220,2013, 2,20);
        Vehicle vehicle1 = new Ship(200, 130, 2000, 13, "NY");
        Vehicle vehicle3 = new Car(200, 130, 2000);

        System.out.println(vehicle.toString());
        System.out.println(vehicle1.toString());
        System.out.println(vehicle3.toString());
    }
}
