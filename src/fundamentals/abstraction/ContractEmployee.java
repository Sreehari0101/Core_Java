package fundamentals.abstraction;
public class ContractEmployee extends Employee {
    @Override
    public double calculateSalary(String employeeType) {
        double tax = 0.3;
        double grossSalary = 80000;
        double netSalary = 0.00;
        if (employeeType.equalsIgnoreCase("Contractual")) {
            netSalary = grossSalary - (grossSalary * tax);
            netSalary = netSalary - 5000;
        }
        return netSalary;

    }
}
