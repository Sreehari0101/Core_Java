package programs;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Input string
        String word = "This is a great day";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Convert the input string to a character array
        char[] chars = word.toCharArray();

        // Iterate through each character in the array
        for(char character : chars){
            // Get the current count of the character from the map
            Integer value = map.get(character);

            // Skip processing spaces
            if(character == ' '){
                continue; // Skip this iteration and move to the next character
            }

            // Update the count of the character in the map
            if(value == null){
                // If the character is encountered for the first time, set its count to 1
                map.put(character, 1);
            } else {
                // If the character already exists in the map, increment its count
                map.put(character, value + 1);
            }
        }

        // Print the character frequencies stored in the map
        System.out.println(map);
    }
}
