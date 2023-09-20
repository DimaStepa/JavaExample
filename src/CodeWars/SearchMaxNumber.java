package CodeWars;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchMaxNumber {

    public static ArrayList<Integer> setListNumber() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        Scanner printNumber = new Scanner(System.in);
        Scanner writeText = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number1 = printNumber.nextInt();
        listNumbers.add(number1);
        System.out.println("Вы ввели все числа? да/нет");
        String text = writeText.next();
        if (text.equals("нет")) {
            while (text.equals("нет")) {
                text = "";
                System.out.println("Введите число: ");
                int number2 = printNumber.nextInt();
                listNumbers.add(number2);
                System.out.println("Вы ввели все числа? да/нет");
                text = text+ writeText.next();
            }
        }
        else {
            return listNumbers;
        }
        return listNumbers;
    }

    public static int searchMaxNumber(ArrayList<Integer> listNumbers){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < listNumbers.size(); i++) {
            int elem = listNumbers.get(i);
            if (elem > max){
                max = elem;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(searchMaxNumber(setListNumber()));

            }
        }
