package programs;
import java.util.Scanner;
public class SimpleCalculator {
    public static float calculate(int a, int b, String o){
        float result = 0f;
        switch(o) {
            case "+":
                result = (float)a + (float)b;
                break;
            case "-":
                result = (float)a - (float)b;
                break;
            case "*":
                result = (float)a * (float)b;
                break;
            case "/":
                result = (float)a / (float)b;
                break;
            default :
                System.out.print("Invalid Operation");
                break;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
            System.out.print("Enter the First number: ");
            int a = s.nextInt();
            System.out.print("Enter the Second number: ");
            int b = s.nextInt();
        while(true) {
            System.out.print("What operation to perform(+,-,*,/) :");
            String o = s.next();
            System.out.println("Result : " + calculate(a, b, o));
        }

    }
}
