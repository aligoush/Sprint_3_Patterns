package n3exercise1_Callback;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, double price){
        paymentMethod.pay(price);
        System.out.println("Payment processed successfully.");
    }
}
