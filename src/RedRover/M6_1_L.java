package RedRover;

public class M6_1_L {

    public static String even_or_odd(int number) {
        if(number % 2 ==0) {
            return "Even";
        }
        else {
            return "Odd";
        }

    }

    public static int billboard(String name, int price) {
        int a = 0;
        for (int i = 0; i < name.length(); i++) {
            a +=price;
        }
        return a;
    }

    public static String stringy(int size) {
        String str = "10";
        for (int i = 3; i <= size; i++) {
            if (i % 2 == 0){
                str = str + "0";
            }
            else {
                str = str + "1";
            }

        }
        return str;
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum = sum + classPoints[i];
        }
        avg = (sum + yourPoints)/(classPoints.length + 1);
        if (yourPoints > avg) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String sayHello(String [] name, String city, String state){
        String str = "";
        for (int i = 0; i < name.length-1; i++) {
            str = str + name[i] + " ";
        }
        str = str + name[name.length-1];
        return "Hello, " + str +"! Welcome to " + city + ", " + state + "!";
    }


    public static void main(String[] args) {

    M6_1_L_Util.log("Eduard");
    System.out.println(M6_1_L_Util.sumTwoNumber(22,88));

        System.out.println(M6_1_L_Util.moreLess(10));

        System.out.println(even_or_odd(23));

        System.out.println(billboard("Dima", 40));

        System.out.println(stringy(12));

        System.out.println(betterThanAverage(new int[]{10, 3, 4}, 5));

        System.out.println(sayHello(new String[]{"John", "Don", "RUZVELT", "KUKU"}, "BAZINGVA", "URURU"));
    }
}
