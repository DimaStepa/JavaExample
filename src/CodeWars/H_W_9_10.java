package CodeWars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class H_W_9_10 {

    /*
    Write a function to convert a name into initials.
    This kata strictly takes two words with one space in between them.
    The output should be two capital letters with a dot separating them.
     */

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        System.out.println(names[0]);
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    /*
    All of the animals are having a feast! Each animal is bringing one dish.
    There is just one rule: the dish must start and end with the same letters as the animal's name.
    For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
     */

    public static boolean feast(String beast, String dish) {
        int lenBeast = beast.length();
        int lenDish = dish.length();
        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(lenBeast-1) == dish.charAt(lenDish-1)){
            return true;
        }
        return false;
    }

    /*
Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
Taking the first letter of all of the inputs and grouping them next to each other.
Do this for every letter, see example below!
E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
Note: You can expect all of the inputs to be the same length.
     */

    public static String tripleTrouble(String one, String two, String three) {
        String str = "";
        for (int i = 0; i < one.length(); i++) {
            for (int j = i; j < i + 1; j++) {
                for (int k = j; k < j + 1; k++) {
                    str = str + one.charAt(i) + two.charAt(j) + three.charAt(k);
                }

            }
        }
        return str;
    }

/*
When provided with a letter, return its position in the alphabet.
Input :: "a"
Ouput :: "Position of alphabet: 1"
 */

    public static String position(char alphabet) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == alphabet){
                count = count + i + 1;
                return "Position of alphabet: " + Integer.toString(count);
            }

        }
        return "";
    }

    /*
I'm new to coding and now I want to get the sum of two arrays...
Actually the sum of all their elements. I'll appreciate for your help.
P.S. Each array includes only integer numbers. Output is a number too.
     */

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int count1 = 0;
        int count2 = 0;
        int sumCount;
        for (int i = 0; i < arr1.length; i++) {
         count1 =count1 + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            count2 =count2 + arr2[i];
        }
        return sumCount = count1 + count2;
    }

    public static void main(String[] args) {

        System.out.println(abbrevName("Faaa5 saaab"));
        System.out.println(feast("great blue heron", "garlic naan"));
        System.out.println(tripleTrouble("ff", "ss", "dd"));
        System.out.println(position('b'));


    }
}
