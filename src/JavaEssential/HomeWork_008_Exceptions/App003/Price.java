package JavaEssential.HomeWork_008_Exceptions.App003;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Price {
    private String productName;
    private String shopName;
    private double price;

    Price(String productName, String shopName, double price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", price=" + price +
                '}';
    }
}
class Main{
    private static Price[] newPrices(int lenght){
        Price[] prices = new Price[lenght];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            prices[i] = new Price(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
        }
        return prices;
    }
    private static Price[] sortByShopNames(Price[] prices){
        Arrays.sort(prices, new Comparator<>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getShopName().compareTo(o2.getShopName());
            }
        });
        return prices;
    }
    public static void main(String[] args) {
        Price[] prices = newPrices(2);
        sortByShopNames(prices);

        try {
            System.out.println("Type shop name: ");
            Scanner scanner = new Scanner(System.in);
            String shopName = scanner.nextLine();
            for (Price price : prices) {
                if (shopName.equals(price.getShopName())) {
                    System.out.println(price.toString());
                }else { throw new Exception("There is no such shop!"); }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
