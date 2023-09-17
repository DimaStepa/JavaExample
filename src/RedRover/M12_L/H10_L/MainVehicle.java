package RedRover.M12_L.H10_L;

import RedRover.M12_L.H10_L.vehicles.*;

public class MainVehicle {

    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Bicycle bicycle = new Bicycle();

        Turnable[] vechicleThatTurn = {car, bicycle};
        WithEngine[] vechicleWithEngine = {car, train};
        for (WithEngine vechicle : vechicleWithEngine){
            vechicle.startEngine();   // если есть двигатель - то включи двигатль
        }
    }
}
