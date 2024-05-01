package fundamentals.collections;

import java.util.List;
import java.util.*;

// Comparator implementation to compare strings based on their length
class LengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        // Compare strings based on their length
        return Integer.compare(o1.length(), o2.length());
    }
}

public class QueueDemo {
    public static void main(String[] args){
        // Create a PriorityQueue with a custom Comparator (LengthComparator)
        Queue<String> queue = new PriorityQueue<>(new LengthComparator());

        // Add elements to the PriorityQueue
        queue.addAll(List.of("Lion", "Zebra", "Cat"));

        // Retrieve and remove elements from the PriorityQueue (in order of length due to custom Comparator)
        System.out.println(queue.poll()); // Outputs: Cat
        System.out.println(queue.poll()); // Outputs: Lion
        System.out.println(queue.poll()); // Outputs: Zebra
    }
}
