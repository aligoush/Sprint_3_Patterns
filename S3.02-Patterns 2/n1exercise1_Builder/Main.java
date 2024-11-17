package n1exercise1_Builder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaMaster pizzaMaster = new PizzaMaster(hawaiianPizzaBuilder);
        Pizza hawaiianPizza = pizzaMaster.constructPizza("large", "thick");
        System.out.println(hawaiianPizza);
        System.out.println("-------------------------- ");
        PizzaBuilder carbonaraPizzaBuilder = new CarbonaraPizzaBuilder();
        pizzaMaster = new PizzaMaster(carbonaraPizzaBuilder);
        Pizza carbonaraPizza = pizzaMaster.constructPizza("medium", "thin");
        System.out.println(carbonaraPizza);
    }
}
