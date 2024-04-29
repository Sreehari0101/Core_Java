package fundamentals.abstraction;

public class PermanentEmployee extends Employee{
    @Override
    public double calculateSalary(String employeeType){
        double tax = 0.2;
        double grossSalary = 60000;
        double netSalary = 0.0;
        if(employeeType.equalsIgnoreCase("Permanent")){
            netSalary = grossSalary - (grossSalary*tax);
            netSalary = netSalary + 10000;
        }
        return netSalary;
    }

}
