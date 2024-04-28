package fundamentals.polymorphism;
//Method Overloading
public class AreaMain {
    public static void main(String[] args){
        Area a = new Area();
        System.out.println("Area of circle is " + a.calculateArea(2.5));
        System.out.println("Area of rectangle is " + a.calculateArea(2.5,3.5));
        System.out.println("Area of triangle is " + a.calculateArea(2L,3L));



    }
}
