package OtherCases.testClass;

public class Flat {

    public static void main(String[] args) {
        Box roomFirst = new Box();
        roomFirst.wight = 2.5;
        roomFirst.height = 4.44;
        roomFirst.depth = 6.0;
        System.out.println("Объем комнаты: " + roomFirst.volumeBox());
    }

}
