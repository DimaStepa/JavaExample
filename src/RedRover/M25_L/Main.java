package RedRover.M25_L;

public class Main {

    public static void grade (int value) {
        if (value > 2 && value < 5) {
            System.out.println("ololo");
        }
        else {
            throw new IllegalArgumentException("Grade can be only between 2 and 5");
        }
    }

    public static void main(String[] args) {
        try {
            Main.grade(6);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Tut exception");
        }
        Main.grade(3);
    }

}
