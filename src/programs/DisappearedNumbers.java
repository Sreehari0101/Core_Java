package programs;
import java.util.*;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();

        // Mark the numbers as negative based on their indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        // Add positive numbers' indices (+1) to the result list
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close();
        List<Integer> disappeared = findDisappearedNumbers(nums);
        System.out.println("Disappeared Numbers: " + disappeared);
    }
}
