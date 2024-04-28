package fundamentals.inheritancedemo;

public class Bike extends Vehicle{
    public Bike(){
        super("Calling one parameterized constructor of parent class");
        System.out.println("Default Constructor of Child class Bike");
        super.setVehicleType("Bike is Two wheeler");
    }

    public void display(){
        System.out.println(super.getVehicleType());
    }

    @Override
    public void show(){
        System.out.println("I am child class Bike");
    }
}
