package programs;
import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "this is not the way this is";

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> map = new HashMap<>();

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Iterate through each word in the array
        for(String word : words){
            // Get the current count of the word from the map
            Integer value = map.get(word);

            // Update the count of the word in the map
            if(value == null){
                // If the word is encountered for the first time, set its count to 1
                map.put(word, 1);
            } else {
                // If the word already exists in the map, increment its count
                map.put(word, value + 1);
            }
        }

        // Print the word frequencies stored in the map
        System.out.println(map);
    }
}
