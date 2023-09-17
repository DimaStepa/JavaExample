package RedRover.M12_L.H10_L.finals;



public class Nest extends AbstractThermostat {

    public int targetTemp;

    public int getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(int targetTemp) {
        this.targetTemp = targetTemp;
    }


    @Override
    protected boolean tooHot(int currentTemp) {
        return currentTemp > targetTemp;
    }

    @Override
    protected void decreaseTemp() {
        System.out.println("Turn on Air Conditioner");
    }

    @Override
    protected boolean tooCold(int currentTemp) {
        return currentTemp < targetTemp;
    }

    @Override
    protected void increaseTemp() {
        System.out.println("Turn on heat");
    }

    @Override
    protected void sleep() {
        System.out.println("Nest is sleeping");
    }
}
