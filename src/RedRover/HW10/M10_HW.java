package RedRover.HW10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SortedMap;


public class M10_HW {

    /*
Complete the method that takes a boolean value and return a "Yes" string for true,
or a "No" string for false.
     */
    public static String boolToWord(boolean b)
    {
        return b == true ? "Yes" : "No";
    }

    /*
Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.
Examples(Operator, value1, value2) --> output
     */

    public static Integer basicMath(String op, int v1, int v2)
    {
        int result = 0;

        if (op.equals("+")){
            result = v1 + v2;
        }
        if (op.equals("-")){
            result = v1 - v2;
        }
        if (op.equals("*")){
            result = v1 * v2;
        }
        if (op.equals("/")){
            result = v1 / v2;
        }

        return result;

    }

/*
Build a function that returns an array of integers from n to 1 where n>0.
 */

    public static int[] reverse(int n){
        if (n>0){
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = n-i ;
        }
        return arr1;
        }
        return new int[]{};
    }

    /*
Write a function to split a string and convert it into an array of words.
     */

    public static String[] stringToArray(String s) {
        String[] str = s.split(" ");
        return str;
    }

    /*
Character recognition software is widely used to digitise printed texts.
Thus the texts can be edited, searched and stored on a computer.
When documents (especially pretty old ones written with a typewriter),
are digitised character recognition softwares often make mistakes.
Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.
     */
    public static String correct(String string) {
        return string.replace("5","S").replace("0", "O").replace("1","I");
    }


    public static void main(String[] args) {

        System.out.println(boolToWord(true));

        System.out.println(Arrays.toString(reverse(1)));

        System.out.println(correct("1F-RUDYARD K1PL1NG"));


    }

}
