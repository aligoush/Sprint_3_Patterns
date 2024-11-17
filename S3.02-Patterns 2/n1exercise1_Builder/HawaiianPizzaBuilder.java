package n1exercise1_Builder;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String name = "Hawaiian";
    private String size;
    private String dough;
    private String toppings;
    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setToppings() {
        this.toppings = "ham, pineapple, onion, pepper, jalapenos";
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public Pizza buildPizza() {
        return new Pizza(name,size, toppings, dough);
    }
}
