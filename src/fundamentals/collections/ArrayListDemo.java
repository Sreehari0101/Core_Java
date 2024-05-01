package fundamentals.collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,4,2,6,7);
        List<Integer> arr = new ArrayList<Integer>(numbers);
        System.out.println(arr);

        arr.add(5);
        System.out.println(arr);
        arr.add(2,8);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);


    }
}
