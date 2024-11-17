package n1exercise1_Builder;

public interface PizzaBuilder {
    public void setSize(String size);
    public void setToppings();
    public void setDough(String dough);
    public Pizza buildPizza();
}
