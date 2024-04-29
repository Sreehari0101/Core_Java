package fundamentals.collections;
import java.util.*;

public class ListDemo {
    public static void main(String[] args){
        // Create an immutable list of Strings
        List<String> list = List.of("Apple", "Orange", "Grape");

        // Print the entire list
        System.out.println(list);

        // Iterate through the list using a traditional for loop
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // Iterate through the list using a for-each loop
        for(String word: list){
            System.out.println(word);
        }

        // Iterate through the list using an Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Check if the list contains a specific element
        System.out.println(list.contains("Apple"));

        // Check if the list is empty
        System.out.println(list.isEmpty());

        // Get the index of a specific element in the list
        System.out.println(list.indexOf("Orange"));
    }
}
