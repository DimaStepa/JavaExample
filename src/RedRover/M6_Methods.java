package RedRover;

import java.util.Arrays;


public class M6_Methods {

    public static int sumTwoNum(int a, int b){
        int c = a + b;
        return c;
    }

    public static void printText (String text, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }

    }

    public static void main(String[] args) {

//Методы
        String s = "sergey";
        printText(s,1);

        String a = "10";
        printText(a, 2);

        int x = 10;
        int y = 22;

        int z = sumTwoNum(x,y);

        System.out.println("Это метод sum и его результат: " + z);

        int index = s.indexOf('g');
        System.out.println(index);
    }
}
