package n1exercise1_Builder;

public class Pizza {
    private String name;
    private String size;
    private String toppings;
    private String dough;

    public Pizza(String name, String size, String toppings, String dough) {
        this.name = name;
        this.size = size;
        this.toppings = toppings;
        this.dough = dough;
    }

    @Override
    public String toString() {
        return "name:" + name + "\nsize: " + size + "\ntoppings: " + toppings + "\ndough: " + dough;
    }
}
