package RedRover;

import java.util.ArrayList;
import java.util.Arrays;

public class M5_HW {

    public static void main(String[] args) {

 /*
1. Дана строка:
String s = "Перестановочный алгоритм быстрого действия";
необходимо вывести все буквы "о" из этой строки.
Для указанной строки ответ будет "ооооо" (или в столбик)

 */

//        String s = "Перестановочный алгоритм быстрого действия";
//        String a = "";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'о'){
//                a = a +'o';
//            }
//
//        }
//        System.out.println(a);

/*
2. Дана строка:
String s = "Перевыборы выбранного президента";
необходимо подсчитать количество букв "е" в строке.
Для указанной строки ответ будет 4.

 */
        String str2 = "Перевыборы выбранного президента";
        int a2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'е'){
                a2 = a2 + 1;
            }

        }
        System.out.println(a2);

/*
3. Дана строка:
String s = "Посмотрите как Рите нравится ритм";
необходимо вывести индексы начала всех подстрок - "рит", независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.

 */
        String str3 = "Посмотрите как Рите нравится ритм";
        String str33 = str3.toLowerCase();
        System.out.println(str33);
        for (int i = 0; i < str33.length(); i++) {
            if (str33.charAt(i) == 'р' && str33.charAt(i+1) == 'и' &&str33.charAt(i+2) == 'т'){
                System.out.print(i + " ");
            }

        }
/*
4. extra task
Дан массив:
String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы "е".

 */
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        for (int a4 = 0; a4 < array.length; a4++) {
            for (int a44 = 0; a44 < array[a4].length; a44++) {
                if(!array[a4][a44].contains("е")){
                    count ++;
                }
            }
        }
        System.out.println(" ");
        System.out.println(count);

    }


}
