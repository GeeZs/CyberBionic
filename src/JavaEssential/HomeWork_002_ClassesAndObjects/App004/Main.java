package JavaEssential.HomeWork_002_ClassesAndObjects.App004;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(7);
        Car car3 = new Car(11, 220);
        Car car4 = new Car(3, 230, 1);
        Car car5 = new Car(1, 300, 2, "GREEN");

        System.out.println(car1.toString());
    }
}
