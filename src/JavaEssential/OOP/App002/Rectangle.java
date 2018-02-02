package JavaEssential.OOP.App002;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    private double areaCalculator(double side1, double side2){
        return side1*side2;
    }
    private double perimeterCalculator(double side1, double side2){
        return (side1 + side2) * 2;
    }
    private double getValueFromUser(){
        System.out.println("Please type Double value: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(rectangle.getValueFromUser());
        rectangle.setSide2(rectangle.getValueFromUser());
        System.out.println(rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.println(rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
    }

}
