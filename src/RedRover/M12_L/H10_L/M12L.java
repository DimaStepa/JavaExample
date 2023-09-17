package RedRover.M12_L.H10_L;

public class M12L {

    public static void main(String[] args) {

        System.out.println(add(1, 1));
        System.out.println(add(1, 100000L));
        System.out.println();
        printNumbers(10, 1);
        printNumbers(5);


    }

    static long add(int a, int b) {
        System.out.println("Adding ints");
        return a + b;
    }

    static long add(int a, long b) {
        System.out.println("Adding int + long");
        return a + b;
    }

    static void printNumbers(int maxNumber, int step) {
        for (int i = 0; i < maxNumber; i = i + step) {
            System.out.println(i);

        }
    }

    static void printNumbers(int maxNumber) {
        printNumbers(maxNumber, 1);
    }
}
