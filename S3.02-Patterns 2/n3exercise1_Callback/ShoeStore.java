package n3exercise1_Callback;

public class ShoeStore {
    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentMethod creditCard = new CreditCard("1111-2222-3333-4444");
        PaymentMethod paypal = new Paypal("lizzy@gmail.com");
        PaymentMethod bankAccount = new BankAccount("ES1234567891234678");

        System.out.println("Payment with credit card: ");
        payment.processPayment(creditCard, 300);

        System.out.println("Payment with PayPal: ");
        payment.processPayment(paypal, 50);

        System.out.println("Payment with Bank Account: ");
        payment.processPayment(bankAccount, 150);
    }
}
