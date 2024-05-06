package fundamentals.exceptionhandling;
import java.util.*;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // NullPointerException handling
        try {
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        // ArrayIndexOutOfBoundsException handling
        try {
            int[] nums = {1, 2, 3};
            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + nums[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println();
        }

        // IllegalArgumentException handling
        try {
            List<Integer> numbers = new ArrayList<>();
            System.out.print("Enter a positive number: ");
            int num = scanner.nextInt();
            if (num <= 0) {
                throw new IllegalArgumentException("Number must be positive.");
            }
            numbers.add(num);
            System.out.println("Added " + num + " to the list: " + numbers);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
        }

}
