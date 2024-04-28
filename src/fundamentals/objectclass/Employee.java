package fundamentals.objectclass;

public class Employee {
    long employeeID;
    double salary;
    void setEmployeeID(long e){
        employeeID = e;
    }

    void setSalary(double s){
        salary = s;
    }

    long getEmployeeID(){
        return employeeID;
    }

    double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        String s = employeeID + " " + salary;
        return s;
    }

}
