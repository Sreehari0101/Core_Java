package programs;
import java.util.Scanner;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0; // Index to track the position of unique elements
        for (int i = 1; i < nums.length; i++) {
            // Compare the current element with the element at j
            if (nums[i] != nums[j]) {
                // If different, move j forward and update the element at that position
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
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

        int newLength = removeDuplicates(nums);

        System.out.println("Length is " + newLength + ", and the first " + newLength + " elements are:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
