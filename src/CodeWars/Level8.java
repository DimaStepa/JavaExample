package CodeWars;

public class Level8 {

    public static int paperWork(int n, int m)
    {
        return (n < 0) || (m < 0) ? 0 : n * m;
        // если n<0 или m <0 вернуть 0, противном случае передать произведение n * m
        }
/*
In this Kata we are passing a number (n) into a function.
Your code will determine if the number passed is even (or not).
The function needs to return either a true or false.
Numbers may be positive or negative, integers or floats.
Floats with decimal part non equal to zero are considered UNeven for this kata.
 */

    public static boolean isEven(double n) {
            return n % 2 == 0.0;
        }

        /*
        check how to passing in method: X or Y;
         */

    public static String chromosomeCheck(String sperm) {
        if (sperm.equals("X")) {
            return "Congratulations! You're going to have a daughter.";
        }
        if (sperm.equals("Y")) {
            return "Congratulations! You're going to have a son.";
        }
        return "nothing";
    }


    public static void main(String[] args) {


        System.out.println(paperWork(32,12));

        System.out.println(isEven(10));

        System.out.println(chromosomeCheck("Y"));


    }

}
