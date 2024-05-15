package practice;

class EmployeeDetails {
    private java.util.concurrent.ConcurrentHashMap<Integer, String> employeeMap;

    public EmployeeDetails() {
        employeeMap = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public void addEmployee(int id, String name) {
        employeeMap.put(id, name);
        System.out.println(Thread.currentThread().getName() + " added employee: ID=" + id + ", Name=" + name);
    }

    public void getEmployee(int id) {
        String name = employeeMap.get(id);
        System.out.println(Thread.currentThread().getName() + " retrieved employee: ID=" + id + ", Name=" + name);
    }
}

public class ConcurrentHashMap {
    public static void main(String[] args) {
        EmployeeDetails empDetails = new EmployeeDetails();

        Thread addThread1 = new Thread(() -> empDetails.addEmployee(101, "John"), "AddThread1");
        Thread addThread2 = new Thread(() -> empDetails.addEmployee(102, "Jane"), "AddThread2");
        Thread getThread1 = new Thread(() -> empDetails.getEmployee(101), "GetThread1");
        Thread getThread2 = new Thread(() -> empDetails.getEmployee(102), "GetThread2");

        addThread1.start();
        addThread2.start();
        getThread1.start();
        getThread2.start();
    }
}
