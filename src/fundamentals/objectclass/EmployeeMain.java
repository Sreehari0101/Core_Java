package fundamentals.objectclass;

public class EmployeeMain {
    public static void main(String[] args){
    System.out.println("***** Before setting - s *******");
    Employee s = new Employee();
    System.out.println(s.getEmployeeID());
    System.out.println( s.getSalary());
    System.out.println("***** After setting - s *******");
    s.setEmployeeID(1);
    s.setSalary(25.05);
    System.out.println(s.getEmployeeID());
    System.out.println( s.getSalary());
    System.out.println("***** Printing - s *******");
    System.out.print(s);


;}
}
