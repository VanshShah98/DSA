package Hashing;
import java.util.*;
public class Hashmap_learning {
    public static void main(String[] args) {
        //key(country),value(population)
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",10000);
        map.put("US",12560);
        map.put("China",456978 );
        // System.out.println(map);
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : "+ e.getValue());
        }
    }

}
