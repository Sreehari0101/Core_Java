package fundamentals.multithreading;

class Task1 extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 101; i<= 200; i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 Ended ");
    }
}
class Task2 implements Runnable{
    @Override
    public void run() {
        for(int i =201; i<= 300; i++){
            System.out.print(i + " ");
        }
        System.out.print("Task2 Ended ");
    }
}

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException{
        Task1 task1 = new Task1();
        task1.start();
        task1.join();
        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.setPriority(10);
        thread2.start();
        for(int i = 1; i<= 100; i++){
            System.out.print(i + " ");
        }
        System.out.print("Task3 Ended ");
    }
}
