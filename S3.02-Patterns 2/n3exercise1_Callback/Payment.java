package n3exercise1_Callback;

public class Payment {
    public void processPayment(PaymentMethod paymentMethod, double price){
        paymentMethod.pay(price);
        System.out.println("Payment processed successfully.");
    }
}
