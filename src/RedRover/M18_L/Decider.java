package RedRover.M18_L;

public interface Decider<T> {

    boolean isBetter (T first, T second); // если 1 лучше чем 2 то тру
}
