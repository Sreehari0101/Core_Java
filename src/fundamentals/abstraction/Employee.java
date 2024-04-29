package fundamentals.abstraction;
public abstract class Employee {
    private final String companyName = "xyz Private Limited";

    public String getCompanyName(){
        return this.companyName;
    }
    public abstract double calculateSalary(String employeeType);
}
