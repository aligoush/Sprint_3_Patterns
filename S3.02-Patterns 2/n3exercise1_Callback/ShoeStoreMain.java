package n3exercise1_Callback;

public class ShoeStoreMain {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();
        PaymentMethod creditCard = new CreditCard("1111-2222-3333-4444");
        PaymentMethod paypal = new Paypal("lizzy@gmail.com");
        PaymentMethod bankAccount = new BankAccount("ES1234567891234678");

        System.out.println("Payment with credit card: ");
        paymentGateway.processPayment(creditCard, 300);

        System.out.println("Payment with PayPal: ");
        paymentGateway.processPayment(paypal, 50);

        System.out.println("Payment with Bank Account: ");
        paymentGateway.processPayment(bankAccount, 150);
    }
}
