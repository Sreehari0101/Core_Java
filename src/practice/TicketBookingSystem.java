package practice;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TicketBookingSystem {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> ticketsQueue = new ConcurrentLinkedQueue<>();

        Thread enqueueThread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                String ticket = "Ticket" + i;
                ticketsQueue.offer(ticket);
                System.out.println(Thread.currentThread().getName() + " enqueued " + ticket);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "EnqueueThread1");

        Thread enqueueThread2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                String ticket = "Ticket" + i;
                ticketsQueue.offer(ticket);
                System.out.println(Thread.currentThread().getName() + " enqueued " + ticket);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "EnqueueThread2");

        Thread dequeueThread1 = new Thread(() -> {
            int count = 0;
            while (count < 5) {
                String ticket = ticketsQueue.poll();
                if (ticket != null) {
                    System.out.println(Thread.currentThread().getName() + " dequeued " + ticket);
                    count++;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "DequeueThread1");

        Thread dequeueThread2 = new Thread(() -> {
            int count = 0;
            while (count < 5) {
                String ticket = ticketsQueue.poll();
                if (ticket != null) {
                    System.out.println(Thread.currentThread().getName() + " dequeued " + ticket);
                    count++;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "DequeueThread2");

        enqueueThread1.start();
        enqueueThread2.start();
        dequeueThread1.start();
        dequeueThread2.start();
    }
}
