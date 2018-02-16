package JavaEssential.HomeWork_001_OOP.App004;

public class Computer {
    private int price;
    private int id;

    public Computer() {
    }

    Computer(int price, int id) {
        this.price = price;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", id=" + id +
                '}';
    }
    static void printComputers(Computer[] anArray){
        for (Computer anAnArray : anArray) {
            System.out.println(anAnArray.toString());
        }
    }
}
