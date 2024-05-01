package fundamentals.exceptionhandling;
import java.util.Scanner;

public class ExpceptionRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }
        public static void method1() {
            method2();
            System.out.println("Method 1 Ended");
        }
            public static void method2() {
                Scanner scanner = null;
                try {
                    scanner = new Scanner(System.in);
                    String s = null;
                    int length = s.length();
                }
                catch(NullPointerException e) {
                     e.printStackTrace();
                     System.out.println("Exception handled as NullPointer");
                }
                catch(Exception e) {
                    e.printStackTrace();
                    System.out.println("Exception handled");
                }

                finally{
                    scanner.close();
                    System.out.println("scanner closed");
                }

            }
}

