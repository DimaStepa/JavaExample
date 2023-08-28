package RedRover;

public class M6_3_HW {

public static int plusM (int a, int b){
    return a + b;
}

public  static int substractionM (int c, int d){
    return c - d;
}

public static float multiplicationM(float s1, float s2){
    return s1*s2;
}

public static double divisionM (double s3, double s4){
    return s3 / s4;
}

    public static boolean isLove(final int flower1, final int flower2) {
        boolean a = false;
        if ((flower1 % 2 ==0 && flower2 % 2 !=0) || (flower1 % 2 !=0 && flower2 % 2 ==0)) {
            a = true;
        }
        return a;
    }

    public static String numberToString(int num) {
        String str = Integer.toString(num);
    return str;
    }
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
    String str = "";
        for (int i = 1; i <= num; i++) {
            str = str + Integer.toString(i) + " sheep...";
        }
        return str;
    }

    public static void main(String[] args) {
/*
Задача №1

Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел

 */
        System.out.println(plusM(10, 42));
        System.out.println(substractionM(8, -42));
        System.out.println(multiplicationM(8.1f, 9.2f));
        System.out.println(divisionM(7.2, 3.1));

        System.out.println(isLove(11, 8));
        System.out.println(63);

        int result = findSmallestInt(new int[]{78,56,-2,12,8,-33});
        System.out.println(result);

        System.out.println(countingSheep(10));

    }
}
