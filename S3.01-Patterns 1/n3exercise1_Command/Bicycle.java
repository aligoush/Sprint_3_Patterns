package n3exercise1_Command;

public class Bicycle extends Vehicle {

    @Override
    void start() {
        System.out.println("Bicycle started moving");
    }

    @Override
    void accelerate() {
        System.out.println("Bicycle accelerated");
    }

    @Override
    void brake() {
        System.out.println("Bicycle stopped");
    }
}
