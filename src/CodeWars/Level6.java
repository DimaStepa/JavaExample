package CodeWars;


public class Level6 {

    /*
Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only).
It will never give you an empty array (that's not a walk, that's standing still!).
 */

    public static boolean isValid(char[] walk){
        int countN = 0;
        int countW = 0;
        int countE = 0;
        int countS = 0;
        if (walk.length == 10){
            for (int i = 0; i < walk.length; i++) {
                if (walk[i] == 'n'){
                    countN +=1;
                }
                if (walk[i] == 'w'){
                    countW +=1;
                }
                if (walk[i] == 'e'){
                    countE +=1;
                }
                if (walk[i] == 's'){
                    countS +=1;
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
        while (array.length > 1){
            int mult = 1;
            for (int i = 0; i < array.length; i++) {
                int num = Character.getNumericValue(array[i]);
                mult = mult * num;
            }
            count +=1;
            str = Integer.toString(mult);
            array = str.toCharArray();
        }
        return count;
    }


    public static void main(String[] args) {

//        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
//        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
//        System.out.println(isValid(new char[] {'w'}));
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));

        System.out.println(persistence(999));




    }


}
