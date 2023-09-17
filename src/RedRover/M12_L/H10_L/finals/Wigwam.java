package RedRover.M12_L.H10_L.finals;

public class Wigwam extends AbstractThermostat{

    @Override
    protected boolean tooHot(int currentTemp) {
        return currentTemp > 25;
    }

    @Override
    protected void decreaseTemp() {
        System.out.println("Открыть полог");
    }

    @Override
    protected boolean tooCold(int currentTemp) {
        return currentTemp < 18;
    }

    @Override
    protected void increaseTemp() {
        System.out.println("Подкинуть дров");

    }

    @Override
    protected void sleep() {
        System.out.println("Сидим тихо и машем");

    }
}
