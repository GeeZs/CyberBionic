package JavaEssential.HomeWork_010_Generics.App002;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    void addElement(T element) {
        list.add(element);
    }

    public int getIndex(T element) {
        return list.indexOf(element);
    }

    public int getSize() {
        return list.size();
    }
}
class Main{
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();
        myList.addElement("eva");
        myList.getIndex("eva");
        myList.getSize();


    }
}