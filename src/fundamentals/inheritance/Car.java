package fundamentals.inheritance;

public class Car extends Vehicle{
    public long buildNumber;
    public Car(){
        System.out.println("Default Constructor of Child Class Car");
        super.setVehicleType("Car is Four Wheeler");
    }
    public Car(long buildNumber)
    {
        this();
        this.buildNumber = buildNumber;
    }

    public void display(){
        System.out.println(super.getVehicleType());
    }

    public Car(String a, long xyz){
        this(7L);
    }
    @Override
    public void show(){
        System.out.println("I am child class Car");
    }
}
