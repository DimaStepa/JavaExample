package RedRover;

import java.util.Arrays;



public class M4_HW {
    public static void main(String[] args) {

//test1 Необходимо вывести числа от 0 до 15.

        for (int i = 0; i < 16; i = i+1){
            System.out.print(i + " ");
        }
        System.out.println("");
// test2 Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

        for (int n = 1; Math.pow(5,n) < 10000; n = n+1){
            System.out.print(n + " ");
        }
        System.out.println("");

// test4 необходимо вывести сумму всех значений массива.
        int[] array = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int a = 0; a < array.length; a = a +1){
            sum = sum + array[a];
        }
        System.out.println("Сумма всех чисел в массиве = " + sum);

// test5 необходимо вывести максимальное значение массива.
        int[] array5 = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = Integer.MAX_VALUE;
        for (int b = 0; b <array5.length; b = b+1) {
            int elem = array5[b];
            if (elem < minValue) {
                minValue = elem;
            }
        }
        System.out.println("Минимальное значение в массиве = " + minValue);

// test6 необходимо вывести максимальное значение массива.
        int[] array6 = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = Integer.MIN_VALUE;
        for (int c = 0; c <array5.length; c = c+1) {
            int elem = array6[c];
            if (elem > maxValue) {
                maxValue = elem;
            }
        }
        System.out.println("Максимальное значение в массиве = " + maxValue);

// test7 необходимо вывести среднее арифметическое всех значений массива.
        int[] array7 =new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum7 = 0;
        for (int d = 0; d <array7.length; d = d + 1){
            sum7 = sum7 + array7[d];
        }
        System.out.println("Среднее арифметическое элементов массива = " + sum7*1.0/array7.length);

// test8 необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.
        int[] array8 =new int[] {1, 2, 3, -29, 4, 5, 6, 7, 8, 9, -8, -2, -3, -7};
        int plus = 0;
        int negative = 0;
        for (int a1 = 0; a1 < array8.length; a1 = a1 +1){
            if (array8[a1] > 0) {
                plus = plus + 1;
            } else {
                negative = negative + 1;
            }
        }
        System.out.println("Кол-во положительных чисел в массиве = " + plus);
        System.out.println("Кол-во отрицательных чисел в массиве = " + negative);

// test9 проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так, что каждое следующее число больше предыдущего
        int[] array9 = new int[] {1, 6, 3, 2, 7, 5, 8, 9, 4};
        int temp;
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array9.length - 1; i++) {
                if (array9[i] > array9[i + 1]) {
                    temp = array9[i];
                    array9[i] = array9[i + 1];
                    array9[i + 1] = temp;
                    sort = false;
                }
            }
            System.out.println(Arrays.toString(array9));
        }
// test10 Создать массив: первые два элемента ряда равнялись 1, любой другой элемент ряда был суммой двух предыдущих.
        int[] array10 = new int[20];
        array10[0] = 1;
        array10[1] = 1;
        for (int i = 2; i < array10.length; i++) {
            array10[i] = array10[i - 1] + array10[i - 2];
        }
        System.out.println(Arrays.toString(array10));

    }

}
