package n2exercise1_Observer;

import java.util.ArrayList;
import java.util.List;

public class AgencyObservable implements Publisher{
    private String name;
    private double stockPrice;
    private List<Subscriber> subscribers = new ArrayList<>();

    public AgencyObservable(String name, double stockPrice) {
        this.name = name;
        this.stockPrice = stockPrice;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for(Subscriber subscriber: subscribers){
            subscriber.update(message);
        }
    }

    public void setStockPrice(double newPrice){
        String message = "";
        if(newPrice > this.stockPrice){
            message = "The stock's price of the agency " + name + " has been risen to " + newPrice;
        } else if (newPrice < this.stockPrice){
            message = "The stock's price of the agency " + name + " has been fallen to " + newPrice;
        }
        this.stockPrice = newPrice;
        notifySubscribers(message);
    }
}
