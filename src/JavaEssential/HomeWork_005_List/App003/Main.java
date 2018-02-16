package JavaEssential.HomeWork_005_List.App003;

import JavaEssential.HomeWork_005_List.App002.Zoo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List someList = zoo.getAnimals();
        System.out.println("BEFORE: " + someList.size());
        for (int i = 0; i < someList.size(); i++) {
            if (i == 3 || i == 5 || i == 7){
                someList.remove(i);
            }
        }
        System.out.println("AFTER: " + someList.size());

    }
}
