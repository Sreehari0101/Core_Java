package practice;
class Counter {
    private int count;
    public Counter() {
        this.count = 0;
    }
    public void increment() {
        synchronized (this) {
            if (count < 5) {
                count++;
                System.out.println(Thread.currentThread().getName() + " increments count to " + count);
            }
        }
    }
}

class CounterIncrementer implements Runnable {
    private Counter counter;

    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new CounterIncrementer(counter), "Thread1");
        Thread thread2 = new Thread(new CounterIncrementer(counter), "Thread2");
        Thread thread3 = new Thread(new CounterIncrementer(counter), "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
