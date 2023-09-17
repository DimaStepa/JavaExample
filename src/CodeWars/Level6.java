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



    public static void main(String[] args) {

//        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
//        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
//        System.out.println(isValid(new char[] {'w'}));
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));



    }


}
