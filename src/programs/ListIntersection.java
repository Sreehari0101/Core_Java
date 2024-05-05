package programs;
import java.util.*;
public class ListIntersection {
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                result.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1); // Reduce frequency
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in List 1: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements for List 1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in List 2: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements for List 2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        scanner.close();

        List<Integer> intersection = intersect(nums1, nums2);
        System.out.println("Intersection of lists: " + intersection);
    }
}
