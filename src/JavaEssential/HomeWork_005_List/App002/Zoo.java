package JavaEssential.HomeWork_005_List.App002;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<String> animals = new ArrayList<String>();
    private void addAnimals(){
        for (int i = 0; i < 8; i++) {
            this.animals.add(i, "Sorry, no hardcode 4 U 2day " + (i + 1));
            System.out.println(animals.get(i));
        }
    }

    public List<String> getAnimals() {
        addAnimals();
        return animals;
    }

}
