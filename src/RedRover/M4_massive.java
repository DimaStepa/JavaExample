package RedRover;

import java.lang.reflect.Array;
import java.util.Arrays;

public class M4_massive {
    public static void main(String[] args) {
//1-вы способ задания массива
//        int[] scoreMarksTest =  new int[3]; //кол-во элементов  в массиве
//        scoreMarksTest[0] = 8;
//        scoreMarksTest[1] = 9;
//        scoreMarksTest[2] = 5;
//        System.out.print("Testing massive = ");
//        System.out.println(Arrays.toString(scoreMarksTest));
//
////2-ой способ задания массива
//        int[] scoreMarks = new int[] {5, 4, 1, 2, 3};
//        scoreMarks[2] = 4;
//        scoreMarks[3] = 3;
//        System.out.print("Another way to set massive = ");
//            System.out.println(Arrays.toString(scoreMarks)); // Arrays - данный объект используется для чтения данных из массива
//
//// Вывод массива через цикл
//        System.out.print("Reproduce massive by cycle =");
//        for (int i = 0; i < scoreMarks.length; i = i+1){
//            System.out.print(scoreMarks[i] + " ");
//            System.out.println("");
//// Массив, цикл, условия
//        int [] massiveTest = new int [] {2,5,5,4,3};
//        for (int a = 0; a < massiveTest.length; a = a +1){
//              int score = massiveTest[a];
//              if (score < 4) {
//                  massiveTest[i] = score + 1;
//              }
//        }
//            System.out.print("Change massive with scores = ");
//            System.out.println(Arrays.toString(massiveTest));
//            System.out.println("");
//// Расчет среднего значения в массиве
//        int [] massiveTest2 = new int [] {2,5,5,4,3};
//        int sumMassive = 0;
//        for (int b = 0; b < massiveTest2.length; b = b + 1) {
//            sumMassive = massiveTest2 [b] + sumMassive;
//            }
//            System.out.println("Average scope of massive is = " + sumMassive*1.0/massiveTest2.length);
//        }
// Нахождение минимального значения в массиве
        int [] massiveTest3 = new int [] {2, 4, 6, 9, 3, 1, 8, 2};
        int minValue = Integer.MAX_VALUE;
        for  (int c = 0; c < massiveTest3.length; c = c + 1){
            int elem = massiveTest3[c];
            if (elem < minValue){
                minValue = elem;
            }

        }
        System.out.println("Min value in massive is = " + minValue);

//Из обного массива переносим значения в другой массив
        int [] massiveTest4 = new int [] {2, 4, 6, 9, 3, 1, 8, 2};
        int [] result = new int[massiveTest4.length];
        for  (int d = 0; d < massiveTest3.length; d = d + 1){
            int elem = massiveTest4[d];
            result [d] = elem*elem;
            }
        System.out.println("Values of new massive = " + Arrays.toString(result));

//Цикл while

        int counterText = 0;
        while (counterText < 5) {
            counterText = counterText + 1;
            System.out.print("I'm here! ");
        }

//Цикл do (одно действие всегда выполняется хотя бы один раз)
        int couterDo = 0;
        do {
            System.out.println("I'm here");
            couterDo = couterDo + 1;
        } while (couterDo < 5);

        // Вложенные циклы

        int[] arr1 = new int[] {1,2,3};
        int[] arr2 = new int[] {7,8,3};
        int[][] arrSum = {arr1, arr2};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j < arrSum[i].length; j++) {
                System.out.print(arrSum[i][j]);
                System.out.print(",");
                if(arrSum[i][j]>max){
                    max = arrSum[i][j];
                }
            }
        }
        System.out.println("Максимальное значение рваного массива: "+ max);


    }




}
