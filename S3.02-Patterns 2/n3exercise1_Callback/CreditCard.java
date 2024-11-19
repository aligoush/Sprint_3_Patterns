package n3exercise1_Callback;

public class CreditCard implements PaymentMethod{
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paid "+ price + "euros with credit card.");
    }
}
