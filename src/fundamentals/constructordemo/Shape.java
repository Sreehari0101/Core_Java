package fundamentals.constructordemo;

public class Shape {
    int length;
    int breadth;
    String shapeType;
    public void test(){
        System.out.println("I am Test method");
    }
    public Shape(){
        System.out.println("Default Constructor");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeType);
    }

    public Shape(int l, int b){
        this.length = l;
        this.breadth = b;
        System.out.println("2 parameters Constructor");
        System.out.println(length);
        System.out.println(breadth);
    }

    public Shape(int l, int b, String s){
        this.length = l;
        this.breadth = b;
        this.shapeType = s;
        System.out.println("3 parameters Constructor");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeType);
        this.test();

    }
}
