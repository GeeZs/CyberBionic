package JavaEssential.HomeWork_010_Generics.App003;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyDictionary<TKey,TValue> {
    Map<TKey,TValue> map = new LinkedHashMap<>();

    public Map<TKey, TValue> getMap() {
        return map;
    }
    void addElemet(TKey key, TValue value){
        map.put(key, value);
    }
    int getSize(){
        return map.size();
    }
    int getIndexOfPairByKey(TKey key){
        return new ArrayList<TKey>(map.keySet()).indexOf(key);
    }


    public static void main(String[] args) {
        MyDictionary<String, Integer> map = new MyDictionary<>();
        map.addElemet("Qatar", 98814);
        map.addElemet("Luxembourg", 78670);
        map.addElemet("Singapore", 64584);
        map.addElemet("Norway", 54947);

        System.out.println(map.getSize());
        System.out.println(map.getMap());
        System.out.println(map.getIndexOfPairByKey("Norway"));

    }

}
