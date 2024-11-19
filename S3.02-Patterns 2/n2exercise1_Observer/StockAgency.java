package n2exercise1_Observer;

public class StockAgency implements Subscriber{
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notifying agency " + this.name);
        System.out.println(message);
    }
}
