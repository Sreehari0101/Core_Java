package fundamentals.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",1,"B",2,"C",3);
        System.out.println(map);
        Map<String,Integer> hashmap = new HashMap<>(map);
        hashmap.put("D",4);
        System.out.println(hashmap);
        System.out.println(hashmap.get("A"));
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());
        System.out.println(hashmap.containsKey("A"));

        LinkedHashMap <String,Integer> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put("E",5);
        linkedhashmap.put("F",6);
        linkedhashmap.put("G",7);
        System.out.println(linkedhashmap);

        TreeMap<String,Integer> treemap = new TreeMap<>();
        treemap.put("H",8);
        treemap.put("J",10);
        treemap.put("I",9);
        treemap.put("L",12);
        treemap.put("K",11);
        System.out.println(treemap.higherKey("I"));
        System.out.println(treemap.lowerKey("I"));
        System.out.println(treemap.firstEntry());
        System.out.println(treemap.lastEntry());
        System.out.println(treemap.subMap("I",true,"K",true));
        System.out.println(treemap);

    }
}
