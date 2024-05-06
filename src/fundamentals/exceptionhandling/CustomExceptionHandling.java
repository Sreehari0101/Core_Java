package fundamentals.exceptionhandling;
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        try {
            int amount = -100;
            processPayment(amount);
            System.out.println("Payment processed successfully.");
        } catch (NegativeValueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void processPayment(int amount) throws NegativeValueException {
        if (amount < 0) {
            throw new NegativeValueException("Payment amount cannot be negative.");
        }
        System.out.println("Processing payment for amount: $" + amount);
    }
}
