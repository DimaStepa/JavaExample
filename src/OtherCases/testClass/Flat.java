package OtherCases.testClass;

public class Flat {

    public static void main(String[] args) {
        Box roomFirst = new Box();
        roomFirst.setDimension(10.0, 44.92, 0.543);
        System.out.println("Объем комнаты: " + roomFirst.volumeBox());
    }

}
