package n3exercise1_Command;

public class AccelerateCommand implements Command {
    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private Vehicle vehicle;

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
