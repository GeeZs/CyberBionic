package JavaEssential.HomeWork_007_AnonymousClassesAndEnums.Additional;
// чётко составлено ТЗ (Но это не точно)....
enum Vehicle {
    BWM(10000),
    FIAT(2000);

    int carPrice;
    String color;

    Vehicle(int carPrice) {
        this.carPrice = carPrice;
    }
    String getColor(){return this.color;}

    @Override
    public String toString() {
        return "Vehicle{" +
                "carPrice=" + carPrice +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
