package n3exercise1_Callback;

public class Paypal implements PaymentMethod{
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " euros with PayPal account: " + email);
    }
}
