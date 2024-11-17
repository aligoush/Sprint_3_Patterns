package n1exercise1_Builder;

public class CarbonaraPizzaBuilder implements PizzaBuilder {
    private String name = "Carbonara";
    private String size;
    private String toppings;
    private String dough;

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setToppings() {
        this.toppings = "bacon, cheese, onion, mushroom";
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public Pizza buildPizza() {
        return new Pizza(name, size, toppings, dough);
    }
}
