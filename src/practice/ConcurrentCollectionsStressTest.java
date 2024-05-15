package practice;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionsStressTest {
    private static final int THREAD_COUNT = 100;
    private static final int OPERATIONS_COUNT = 100000;

    public static void main(String[] args) {
        stressTestConcurrentHashMap();
        stressTestCopyOnWriteArrayList();
    }
    private static void stressTestConcurrentHashMap() {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < OPERATIONS_COUNT; i++) {
                concurrentHashMap.put(i, "Value" + i);
                concurrentHashMap.get(i);
                concurrentHashMap.remove(i);
            }
        };

        executeThreads(task, "ConcurrentHashMap");
    }
    private static void stressTestCopyOnWriteArrayList() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        Runnable task = () -> {
            for (int i = 0; i < OPERATIONS_COUNT; i++) {
                copyOnWriteArrayList.add(i);
                copyOnWriteArrayList.contains(i); // Retrieve
                copyOnWriteArrayList.remove(Integer.valueOf(i)); // Delete
            }
        };

        executeThreads(task, "CopyOnWriteArrayList");
    }
    private static void executeThreads(Runnable task, String collectionName) {
        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(collectionName + " Stress Test Time: " + (endTime - startTime) + " ms");
    }
}
