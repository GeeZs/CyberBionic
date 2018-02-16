package JavaEssential.HomeWork_005_List.App004;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ListIterator<Integer> iterator = null;

        //Заливаем элэменты и печатаем до превращения

        for (int i = 0; i < 10; i++) {
            intList.add(i);
            System.out.print(intList.get(i) + " ");
        }

        iterator = intList.listIterator();
        System.out.println();

        //Увеличиваем на 1 с помочью магии листитератора

        while (iterator.hasNext()){
            iterator.set(iterator.next() + 1);
        }

        //после первращения

        for (Integer anIntList : intList) {
            System.out.print(anIntList + " ");
        }

    }
}
