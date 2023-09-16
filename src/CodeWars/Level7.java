package CodeWars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

public class Level7 {

    /*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
Your function receives one side of the DNA (string, except for Haskell);
you need to return the other complementary side.
DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */

    public static String makeComplement(String dna) {
        String result = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                result = result + 'T';
            } else if (dna.charAt(i) == 'T') {
                result = result + 'A';
            } else if (dna.charAt(i) == 'C') {
                result = result + 'G';
            } else if (dna.charAt(i) == 'G') {
                result = result + 'C';
            }
        }
        return result;
        }

/*
This time no story, no theory. The examples below show you how to write function accum:
Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
 */

    public static String accum(String s) {
        s = s.toLowerCase();
        String result = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count +=1;
            String str = "";
            String small = "";
            small = small + s.charAt(i);
            small = small.toUpperCase();
            for (int j = 1; j < count; j++) {
                str = str + s.charAt(i);
            }
            result = result + small + str + "-";
        }
        return result.substring(0,result.length()-1);


    }

/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.
Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
Testing: [0, 0, 0, 1] ==> 1
 */

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        double result = 0.0;
        int count = -1;
        for (int i = binary.size()-1; i >-1; i--) {
            count += 1;
            result = result + binary.get(i)*Math.pow(2,count);
        }
        return (int) result;
    }

/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
 */

    public static int findShort(String s) {
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < min){
             min = str[i].length();
            }
        }
        return min;
    }


    public static void main(String[] args) {

        System.out.println(makeComplement("TAACG"));

        System.out.println(accum("NyffsGeyylB"));

        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));

        System.out.println(findShort("I love you"));

    }

}
