package RedRover.M13;

public class M13 {


    public static int sum (int a, int b){
        return a + b;
    }

    public static void testSum(){
        int r1 = sum(5, 8);
        System.out.println(r1 == 13);

        int r2 = sum(0, 0);
        System.out.println(r2 == 0);
    }

    public static void main(String[] args) {

        testSum();

    }

}
