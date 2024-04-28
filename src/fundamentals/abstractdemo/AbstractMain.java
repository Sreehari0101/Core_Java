package fundamentals.abstractdemo;

public class AbstractMain {
    public static void main(String[] args){
        PermanentEmployee p = new PermanentEmployee();
        ContractEmployee c = new ContractEmployee();
        System.out.println("Company name: "+ p.getCompanyName());
        System.out.println("Permanent Employee Salary: "+ p.calculateSalary("Permanent"));
        System.out.println("Contract Employee Salary: "+c.calculateSalary("contractual"));


    }
}
