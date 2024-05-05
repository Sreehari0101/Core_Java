package programs;
import java.util.*;
class FrequencyComparator implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if (o1.getValue() == o2.getValue())
            return o2.getKey() - o1.getKey();
        else
            return o2.getValue() - o1.getValue();
    }
}

public class TopFrequentElements {
    public static void frequentNumbers(int[] arr, int N, int K) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(mp.entrySet());
        Collections.sort(list, new FrequencyComparator());

        for (int i = 0; i < K; i++)
            System.out.print(list.get(i).getKey() + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();

        scanner.close();

        frequentNumbers(arr, N, K);
    }
}
