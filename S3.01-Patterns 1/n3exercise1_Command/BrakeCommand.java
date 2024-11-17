package n3exercise1_Command;

public class BrakeCommand implements Command {
    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
