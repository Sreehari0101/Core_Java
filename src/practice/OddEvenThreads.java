package practice;
class PrintNumbers implements Runnable {
    private static int num = 1;
    private static final Object lock = new Object();

    public void run() {
        while (num <= 10) {
            synchronized (lock) {
                if ((num % 2 == 0 && Thread.currentThread().getName().equals("EvenThread"))
                        || (num % 2 != 0 && Thread.currentThread().getName().equals("OddThread"))) {
                    System.out.println(Thread.currentThread().getName() + ": " + num);
                    num++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        PrintNumbers printer = new PrintNumbers();

        Thread evenThread = new Thread(printer, "EvenThread");
        Thread oddThread = new Thread(printer, "OddThread");

        evenThread.start();
        oddThread.start();
    }
}
