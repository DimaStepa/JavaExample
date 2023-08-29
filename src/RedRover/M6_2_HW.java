package RedRover;

import java.lang.reflect.Array;
import java.util.Arrays;

public class M6_2_HW {

    public static void primedDown (int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void primedRight (int count) {
        for (int i = 0; i < count; i++) {
            for (int k = 0; k <= i ; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <10 - i; j++) {
                System.out.print(j + " ");


            }
            System.out.println();
        }
    }

    public static void primedMir(int count) {
        for (int i = 0; i < count; i++) {
            for (int step = 0; step <= i ; step++) {
                System.out.print("  ");
            }
            for (int j = 9-i; j >=0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1; k < 10-i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }


        public static void main (String[]args) {

        /*
Вывести следующие строки с соответствующим форматированием (как пирамиды):
Задача №1
0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0
         */

            /*
Задача №2

0  1  2  3  4  5  6  7  8  9
   0  1  2  3  4  5  6  7  8
      0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
            0  1  2  3  4  5
               0  1  2  3  4
                  0  1  2  3
                     0  1  2
                        0  1
                           0

             */

            /*
            Задача №3

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0

             */

            primedDown(10);

            System.out.println();

            primedRight(10);

            System.out.println();

            primedMir(10);


      }

    }

