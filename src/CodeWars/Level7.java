package CodeWars;

import RedRover.M14_L.M14_L;

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
            count += 1;
            String str = "";
            String small = "";
            small = small + s.charAt(i);
            small = small.toUpperCase();
            for (int j = 1; j < count; j++) {
                str = str + s.charAt(i);
            }
            result = result + small + str + "-";
        }
        return result.substring(0, result.length() - 1);


    }

/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.
Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
Testing: [0, 0, 0, 1] ==> 1
 */

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        double result = 0.0;
        int count = -1;
        for (int i = binary.size() - 1; i > -1; i--) {
            count += 1;
            result = result + binary.get(i) * Math.pow(2, count);
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
            if (str[i].length() < min) {
                min = str[i].length();
            }
        }
        return min;
    }


/*
In this little assignment you are given a string of space separated
numbers, and have to return the highest and lowest number.
 */

    public static String highAndLow(String numbers) {
        String[] strArray = numbers.split(" ");
        int temp;
        int min = Integer.parseInt(strArray[0]);
        int max = Integer.parseInt(strArray[strArray.length - 1]);
        if (min > max) {
            temp = max;
            max = min;
            min = temp;
        }
        for (int i = 1; i < strArray.length; i++) {
            if (min > Integer.parseInt(strArray[i])) {
                min = Integer.parseInt(strArray[i]);
            } else if (max < Integer.parseInt(strArray[i])) {
                max = Integer.parseInt(strArray[i]);
            }
        }
        String result = max + " " + min;
        return result;
    }

/*
Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
 */

    public static int getCount(String str) {
        String[] countNumber = str.split("");
        int count = 0;
        for (int i = 0; i < countNumber.length; i++) {
            if (countNumber[i].equals("a") || countNumber[i].equals("e")
                    || countNumber[i].equals("i") || countNumber[i].equals("o")
                    || countNumber[i].equals("u")) {
                count += 1;
            }
        }
        return count;
    }

/*
Complete the function to find the count of the most frequent item of an array.
You can assume that input is an array of integers. For an empty array return 0
 */

    public static int mostFrequentItemCount(int[] collection) {
        List<Integer> countList = new ArrayList<>();
        if (collection.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < collection.length; i++) {
                int count = 0;
                for (int j = 0; j < collection.length; j++) {
                    if (collection[j] == collection[i]) {
                        count += 1;
                    }
                    countList.add(count);
                }
            }
            Integer max = countList.get(0);
            for (Integer maxElement : countList) {
                if (maxElement > max) {
                    max = maxElement;
                }
            }
            return max;
        }
    }


    public static void main(String[] args) {

//        System.out.println(makeComplement("TAACG"));
//
//        System.out.println(accum("NyffsGeyylB"));
//
//        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
//
//        System.out.println(findShort("I love you"));

        System.out.println(highAndLow("100 3 -5 42 -8"));
        System.out.println(getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
        System.out.println(mostFrequentItemCount(new int[] {}));
    }

}
