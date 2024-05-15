package practice;
class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing $" + amount);
        balance += amount;
        System.out.println("New balance after deposit: $" + balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing $" + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("New balance after withdrawal: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class BankAppDemo {
    public static void main(String[] args) {
        Account account = new Account(1000);

        Thread depositThread1 = new Thread(() -> account.deposit(500), "DepositThread1");
        Thread depositThread2 = new Thread(() -> account.deposit(300), "DepositThread2");
        Thread withdrawThread1 = new Thread(() -> account.withdraw(200), "WithdrawThread1");
        Thread withdrawThread2 = new Thread(() -> account.withdraw(800), "WithdrawThread2");

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}
