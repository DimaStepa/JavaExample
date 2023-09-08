package CodeWars;

import java.util.Arrays;

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

    /*
It's pretty straightforward.
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.
     */


    public static String remove(String str) {
        String word = "";;
        for (int i = 1; i < str.length()-1; i++) {
            word = word + str.charAt(i);
        }
        return word;
    }


    public static String printArray(Object[] array) {
        String word = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                word = word + array[i];
            }
            else {
                word = word + array[i] + ",";
            }
        }
        return word;
    }

    /*
    Complete the method that takes a boolean value and return
    a "Yes" string for true, or a "No" string for false.
     */

    public static String boolToWord(boolean b)
    {
        String answer = b == true ? "Yes" : "No";
        return answer;
    }


    static public boolean AmIAfraid(final String day, final int num) {
        return (day.equals("Monday") && num == 12) ||
                (day.equals("Tuesday") && num > 95) ||
                (day.equals("Wednesday") && num == 34) ||
                (day.equals("Thursday") && num == 0) ||
                (day.equals("Friday") && num % 2 == 0) ||
                (day.equals("Saturday") && num == 56) ||
                (day.equals("Sunday") && (num == 666 || num == -666))
                ? true : false;
    }

    /*
 Create a function that accepts a string and a single character,
 and returns an integer of the count of occurrences the 2nd argument
 is found in the first one.
     */

    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count +=1;
            }
        }
        return count;
    }


    /*
Numbers ending with zeros are boring.
They might be fun in your world, but not here.
Get rid of them. Only the ending ones.
     */

    public static int noBoringZeros(int n) {
        String str = Integer.toString(n);
        String shortNumber = "";
        int count = 0;
        for (int i = str.length()-1; i > 0 ; i--) {
            if (str.charAt(i) != '0') {
                break;
            }
            count += 1;
            System.out.println(str.charAt(i));
        }
        for (int i = 0; i < str.length()-count; i++) {
            shortNumber += str.charAt(i);
        }
        int intShortNumber = Integer.parseInt(shortNumber);
        return intShortNumber;
    }


    public static void main(String[] args) {


        System.out.println(paperWork(32,12));

        System.out.println(isEven(10));

        System.out.println(chromosomeCheck("Y"));

        System.out.println(remove("Low"));

        String result = printArray(new String[]{"333","jjj", "l", "a"});
        System.out.println(result);

        System.out.println(boolToWord(false));

        System.out.println(noBoringZeros(204000));


    }

}
