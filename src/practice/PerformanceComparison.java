package practice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PerformanceComparison {
    public static void main(String[] args) {
        final int THREAD_COUNT = 10;
        final int OPERATIONS_COUNT = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> copyOnWriteList = new CopyOnWriteArrayList<>();

        Runnable modifyArrayList = () -> {
            for (int i = 0; i < OPERATIONS_COUNT; i++) {
                synchronized (arrayList) {
                    arrayList.add(i);
                }
            }
        };

        Runnable modifyCopyOnWriteList = () -> {
            for (int i = 0; i < OPERATIONS_COUNT; i++) {
                copyOnWriteList.add(i);
            }
        };

        long startTime, endTime;

        // Test with ArrayList
        List<Thread> arrayListThreads = new ArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread t = new Thread(modifyArrayList);
            arrayListThreads.add(t);
            t.start();
        }
        arrayListThreads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for ArrayList operations: " + (endTime - startTime) + " ms");

        // Test with CopyOnWriteArrayList
        List<Thread> copyOnWriteListThreads = new ArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread t = new Thread(modifyCopyOnWriteList);
            copyOnWriteListThreads.add(t);
            t.start();
        }
        copyOnWriteListThreads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for CopyOnWriteArrayList operations: " + (endTime - startTime) + " ms");
    }
}
