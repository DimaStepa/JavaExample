package RedRover.M25_L;

public class Main {

    public static void grade(int value) throws MyException {
        if (value > 2 && value < 5) {
            System.out.println("ololo");
        } else {
            throw new MyException("Grade can be only between 2 and 5");
        }
    }

    static void tryMe() {
//        throw new RuntimeException();
        System.out.println("Ok");
    }

    public static void main(String[] args) throws Exception {
//        try {
//            Main.grade(6);
//
//        } catch (MyException e) {
//            System.out.println("Tut exception");
//            e.printStackTrace();  // напечатать ексэптион
//        }
//        Main.grade(3);

        try {
            System.out.println("Trying");
            tryMe();
            System.out.println("Tried");
        }
        catch (RuntimeException e) {
            System.out.println("Caught exception");
        }
        finally {
            System.out.println("Finally");
        }


    }

}
