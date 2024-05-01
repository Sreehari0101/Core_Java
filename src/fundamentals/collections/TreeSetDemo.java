package fundamentals.collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<Integer> treeset = new TreeSet<>(Set.of(1,3,4,7,6,5));
        System.out.println(treeset);
        System.out.println(treeset.floor(5));
        System.out.println(treeset.lower(5));
        System.out.println(treeset.ceiling(5));
        System.out.println(treeset.higher(5));
        System.out.println(treeset.subSet(3,5));
        System.out.println(treeset.subSet(3,false,5,false));
        System.out.println(treeset.headSet(5));
        System.out.println(treeset.tailSet(5));


    }
}
