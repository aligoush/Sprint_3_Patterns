package n3exercise1_Command;

public class ParkingInvoker {
    public static void main(String[] args) {
        StartCommand startCommand = new StartCommand(new Car());
        startCommand.execute();

        AccelerateCommand accelerateCommand = new AccelerateCommand(new Car());
        accelerateCommand.execute();

        BrakeCommand brakeCommand = new BrakeCommand(new Car());
        brakeCommand.execute();

        StartCommand startCommand2 = new StartCommand(new Airplane());
        startCommand2.execute();

        AccelerateCommand accelerateCommand2 = new AccelerateCommand(new Airplane());
        accelerateCommand2.execute();

        BrakeCommand brakeCommand2 = new BrakeCommand(new Airplane());
        brakeCommand2.execute();

        StartCommand startCommand3 = new StartCommand(new Bicycle());
        startCommand3.execute();

        AccelerateCommand accelerateCommand3 = new AccelerateCommand(new Bicycle());
        accelerateCommand3.execute();

        BrakeCommand brakeCommand3 = new BrakeCommand(new Bicycle());
        brakeCommand3.execute();

        StartCommand startCommand4 = new StartCommand(new Boat());
        startCommand4.execute();

        AccelerateCommand accelerateCommand4 = new AccelerateCommand(new Boat());
        accelerateCommand4.execute();

        BrakeCommand brakeCommand4 = new BrakeCommand(new Boat());
        brakeCommand4.execute();
    }
}
