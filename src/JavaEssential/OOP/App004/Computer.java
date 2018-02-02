package JavaEssential.OOP.App004;

public class Computer {
    private int price;
    private int id;

    public Computer() {
    }

    public Computer(int price, int id) {
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
    public void printComputers(Computer[] anArray){
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i].toString());
        }
    }
}
