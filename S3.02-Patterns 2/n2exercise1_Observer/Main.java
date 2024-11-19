package n2exercise1_Observer;

public class Main {

    public static void main(String[] args) {
        AgencyObservable agency = new AgencyObservable("HP", 100.0);

        StockAgency agency1 = new StockAgency("StockAgency_1");
        StockAgency agency2 = new StockAgency("StockAgency_2");

        agency.subscribe(agency1);
        agency.subscribe(agency2);

        agency.setStockPrice(105.0);
        agency.setStockPrice(80.5);

        agency.unsubscribe(agency1);

        agency.setStockPrice(110.0);
    }
}
