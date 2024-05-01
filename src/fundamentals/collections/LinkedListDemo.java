package fundamentals.collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 2, 6, 7);
        List<Integer> lin = new LinkedList<Integer>(numbers);
        System.out.println(lin);

        lin.add(5);
        System.out.println(lin);
        lin.add(2, 8);
        System.out.println(lin);
        lin.remove(2);
        System.out.println(lin);
        Collections.sort(lin);
        System.out.println(lin);
        System.out.println(lin);


    }
}
