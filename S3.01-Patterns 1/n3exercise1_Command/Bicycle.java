package n3exercise1_Command;

public class Bicycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bicycle started moving");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle stopped");
    }
}
