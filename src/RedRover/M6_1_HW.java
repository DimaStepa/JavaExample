package RedRover;

public class M6_1_HW {

    public static int sumArr (int [][] arg){
        int result = 0;
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                result =result + arg[i][j];
            }
        }
        return result;
    }

    public static int maxArr (int [][] arg){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if (arg[i][j] > max) {
                    max = arg[i][j];
                }
            }
        }
        return max;
    }

    public static int minArr (int [][] arg){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if (arg[i][j] < min) {
                    min = arg[i][j];
                }
            }
        }
        return min;
    }

    public static int countArr (int [][] arg){
        int count = 0;
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                count +=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        /*
Задача №1
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
         */
        System.out.println("Сумма массива: " + sumArr(new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}));


/*
Задача №2
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
 */
        System.out.println("Максимальное значение массива: " + maxArr(new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}));

        /*
Задача №3
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести минимальное значение массива.

 */

        System.out.println("Минимальное значение массива: " + minArr(new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}));

/*
Задача №4
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
 */

        System.out.println("Кол-во эл. в массиве: " + countArr(new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}));



    }



}
