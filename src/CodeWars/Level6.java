package CodeWars;


import java.util.*;
import java.util.stream.Collectors;

public class Level6 {

    /*
Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only).
It will never give you an empty array (that's not a walk, that's standing still!).
 */

    public static boolean isValid(char[] walk) {
        int countN = 0;
        int countW = 0;
        int countE = 0;
        int countS = 0;
        if (walk.length == 10) {
            for (int i = 0; i < walk.length; i++) {
                if (walk[i] == 'n') {
                    countN += 1;
                }
                if (walk[i] == 'w') {
                    countW += 1;
                }
                if (walk[i] == 'e') {
                    countE += 1;
                }
                if (walk[i] == 's') {
                    countS += 1;
                }
            }
            if (countN == countS && countE == countW) {
                return true;
            }
        }
        return false;
    }

    /*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.
For example (Input --> Output):
39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
     */

    public static int persistence(long n) {
        String str = Long.toString(n);
        char[] array = str.toCharArray();
        int count = 0;
        while (array.length > 1) {
            int mult = 1;
            for (int i = 0; i < array.length; i++) {
                int num = Character.getNumericValue(array[i]);
                mult = mult * num;
            }
            count += 1;
            str = Integer.toString(mult);
            array = str.toCharArray();
        }
        return count;
    }

    /*
Some numbers have funny properties. For example:
89 --> 8¹ + 9² = 89 * 1
Given a positive integer n written as abcd... (a, b, c, d... being digits)
and a positive integer p
we want to find a positive integer k, if it exists,
such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
     */

    public static int searchK(int n, int p) {
//       Спросить у Артема: https://javarush.com/help/36640
//        List<Integer> numbers = Arrays
//            .stream(String.valueOf(n).split(""))  //
//            .map(Integer::valueOf)                      //преобразовываем Integer в значение
//            .collect(Collectors.toList());
        int sum = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        String[] str = String.valueOf(n).split("");
        for (int i = 0; i < str.length; i++) {
            numbers.add(Integer.valueOf(str[i]));
        }
        for (int i = 0; i < numbers.size(); i++) {
            int newN = numbers.get(i);
            sum = (int) (sum + Math.pow(newN, p));
            p += 1;
        }
        return ((sum % n == 0) ? sum / n : -1);
    }

    /*
The main idea is to count all the occurring characters in a string.
If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
What if the string is empty? Then the result should be empty object literal, {}.
     */

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int newCount = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    newCount += 1;
                }
            }
            count.put(str.charAt(i), newCount);
        }
        return count;
    }

/*
Given an array of integers,
find the one that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

    public static int findIt(int[] a) {
        Map<Integer, Integer> unsortedMap = new HashMap<>();
        Integer findValue = Integer.MAX_VALUE;
        Integer findKey = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count += 1;
                }
            }
            unsortedMap.put(a[i], count);
        }
        System.out.println(unsortedMap);
        for (Map.Entry<Integer, Integer> searchValue : unsortedMap.entrySet()) {
            Integer value = searchValue.getValue();
            if (value % 2 == 1 && findValue > value) {
                findKey = searchValue.getKey();
            }

        }
        return findKey;
    }

/*
Could you calculate the remaining volume of the liquid?
Your function tankvol(h, d, vt) returns an integer
which is the truncated result (e.g floor) of your float calculation.
 */
    public static int tankVol(int h, int d, int vt) {
        double lenght = vt / ((Math.PI * Math.pow(d, 2)) / 4);
        double v = 2 * Math.acos((((double) d / 2) - h) / ((double) d / 2));
        double sector = Math.pow(d, 2) * (v - Math.sin(v)) / 8;
        return (int) (lenght * sector);
    }

    public static String list4000 (){
        String str = "";
        for (int i = 1; i < 50001; i++) {
            str = str +"\""+ i +"\", ";
        }
        return str;
    }

    public static void printUUID (){
        String str = "";
        for (int i = 1; i < 101; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }



    public static void main(String[] args) {

//        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
//        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
//        System.out.println(isValid(new char[] {'w'}));
//        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
//
//        System.out.println(persistence(999));
//
//        System.out.println(searchK(89,1));
//
//        System.out.println(count("abaaaaabbc"));

//        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
//
//        System.out.println(tankVol(5, 7, 3848));

//        System.out.println(list4000());
//        String str = ")";
//        System.out.println(str);

        printUUID();

    }


}
