package programs;
import java.util.Scanner;
public class FactorialRecursion {
    private static int fact(int a){
        if(a == 0){
            return 1;
        }
        else{
            return (fact(a-1) * a);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.println("Factorial: "+ fact(n));

    }
}
