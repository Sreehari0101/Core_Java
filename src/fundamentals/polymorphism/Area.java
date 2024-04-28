package fundamentals.polymorphism;
//Method Overloading
public class Area {
    double calculateArea(double r){
        return (3.14 * r * r);
    }

    double calculateArea(double l, double w){
        return (l * w);
    }

    double calculateArea(long b, long h){
        return (0.5 * b * h);
    }
}
