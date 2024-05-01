package fundamentals.collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args){
        // Creating an immutable list of characters
        List<Character> characters = List.of('A','Z','A','B','Z','F');

        // HashSet does not maintain insertion order or sort elements
        Set<Character> characterset = new HashSet<Character>(characters);
        System.out.println("Hash set: " + characterset);

        // LinkedHashSet maintains insertion order of elements
        Set<Character> characterlinkedset = new LinkedHashSet<>(characters);
        System.out.println("Linked Hash set: " + characterlinkedset);

        // TreeSet sorts elements in natural order (for characters, it's based on Unicode values)
        Set<Character> charactertreeset = new TreeSet<>(characters);
        System.out.println("Tree set: " + charactertreeset);
    }
}
