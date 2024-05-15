package practice;
class StoppableThread implements Runnable {
    private volatile boolean active = true;

    public void run() {
        while (isActive()) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " stopped.");
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

public class VolatileThread {
    public static void main(String[] args) throws InterruptedException {
        StoppableThread thread = new StoppableThread();

        Thread checkerThread = new Thread(() -> {
            while (thread.isActive()) {
            }
            System.out.println("Checker thread detected inactive state.");
        });

        checkerThread.start();
        Thread.sleep(5000);
        thread.setActive(false);

        checkerThread.join();
        System.out.println("Main thread exits.");
    }
}
