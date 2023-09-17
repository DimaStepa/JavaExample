package RedRover.M12_L.H10_L.vehicles;

public class Car implements Drivable,Turnable,WithEngine {

    public void startEngine(){
        System.out.println("Car Engine started");

    }

    public void stopEngine() {
        System.out.println("Car Engine stopped");
    }


    public void accelerate() {
        System.out.println("Car Accelerating");
    }

    public void stop() {System.out.println("Train stopping");}

    public void turnLeft(){
        System.out.println("Car turning left");

    }

    public void turnRight(){
        System.out.println("Car turning right");
    }

}
