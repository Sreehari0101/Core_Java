package programs;
import java.util.*;
public class Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        scanner.close();
        List<List<String>> groupedAnagrams = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
