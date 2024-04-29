package fundamentals.inheritance;

public class Vehicle {
    private String vehicleType;

    public Vehicle(){
        System.out.println("Default constructor of parent class");
    }

    public Vehicle(String a){
        System.out.println("One parameterized constructor " + a);
    }

    public String getVehicleType(){
        return this.vehicleType;
    }

    public void setVehicleType(String a){
        this.vehicleType = a;
    }
    public void show(){
        System.out.println("I am parent class vehicle");
    }
}
