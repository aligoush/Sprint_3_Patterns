package n3exercise1_Command;

public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("Boat started moving");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Boat stopped");
    }
}
