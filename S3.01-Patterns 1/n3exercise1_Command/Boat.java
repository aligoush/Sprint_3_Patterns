package n3exercise1_Command;

public class Boat extends Vehicle{
    @Override
    void start() {
        System.out.println("Boat started moving");
    }

    @Override
    void accelerate() {
        System.out.println("Boat accelerated");
    }

    @Override
    void brake() {
        System.out.println("Boat stopped");
    }
}
