import payment.*;
import processor.*;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("4400-4301-9876-5432");
        PaymentStrategy paypalPayment = new PayPalPayment("temirlan@gmail.com");

        PaymentProcessor processorCard = new PaymentProcessor(creditCardPayment);
        PaymentProcessor processorPaypal = new PaymentProcessor(paypalPayment);

        processorCard.processPayment(1000);
        processorPaypal.processPayment(2000);
    }
}
