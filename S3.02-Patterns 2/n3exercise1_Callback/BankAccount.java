package n3exercise1_Callback;

public class BankAccount implements PaymentMethod{
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " with bank account: " + accountNumber);
    }
}
