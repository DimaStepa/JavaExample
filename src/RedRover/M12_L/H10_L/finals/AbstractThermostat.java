package RedRover.M12_L.H10_L.finals;

public abstract class AbstractThermostat {


    final void checkAndAdjust(int currentTemp){
        if (tooHot(currentTemp)){
            decreaseTemp();
        }
        else if (tooCold(currentTemp)){
            increaseTemp();
        } else {
            sleep();
        }
    }

    protected abstract boolean tooHot(int currentTemp);
    protected abstract void decreaseTemp();

    protected abstract boolean tooCold(int currentTemp);

    protected abstract void increaseTemp();
    protected abstract void sleep();
}
