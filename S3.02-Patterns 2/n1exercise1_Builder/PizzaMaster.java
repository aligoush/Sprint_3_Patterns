package n1exercise1_Builder;

public class PizzaMaster {
    private PizzaBuilder builder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.builder = pizzaBuilder;
    }

    public Pizza constructPizza(String size, String dough) {
       builder.setSize(size);
       builder.setToppings();
       builder.setDough(dough);
       return builder.buildPizza();
    }
}
