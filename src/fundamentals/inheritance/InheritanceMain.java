package fundamentals.inheritance;

public class InheritanceMain {
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.display();

        System.out.println("-------------------------------------");

        Car car = new Car(7L);
        car.display();


        System.out.println("-------------------------------------");

    }
}

