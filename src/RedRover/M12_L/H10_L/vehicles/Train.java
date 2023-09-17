package RedRover.M12_L.H10_L.vehicles;

public class Train implements WithEngine, Drivable {


    @Override
    public void startEngine() {
        System.out.println("Train Engine started");

    }

    @Override
    public void stopEngine() {
        System.out.println("Train Engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Train Accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Train stopping");

    }
}
