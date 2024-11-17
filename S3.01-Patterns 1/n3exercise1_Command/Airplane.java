package n3exercise1_Command;

public class Airplane extends Vehicle {

    @Override
    public void start() {
        System.out.println("Airplane started");
    }

    @Override
    public void accelerate() {
        System.out.println("Airplane accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Airplane stopped");
    }
}
