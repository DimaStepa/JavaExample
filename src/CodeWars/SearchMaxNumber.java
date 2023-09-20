package CodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchMaxNumber {

    public static List<Integer> readListOfNumber() {
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner numberReader = new Scanner(System.in);
        Scanner userAnswerReader = new Scanner(System.in);

        String userAnswer = "нет";
        while (userAnswer.equals("нет")) {
            System.out.println("Введите число: ");
            int givenNumber = numberReader.nextInt();
            listOfNumbers.add(givenNumber);
            System.out.println("Вы ввели все числа? да/нет");
            userAnswer = userAnswerReader.next();
        }
        return listOfNumbers;
    }

    public static int searchMaxNumber(List<Integer> listOfNumbers){
        if(listOfNumbers == null || listOfNumbers.isEmpty()){
            throw new IllegalArgumentException("Given list is empty or null");
        }
        int max = listOfNumbers.get(0);
        for (int i = 1; i < listOfNumbers.size(); i++) {
            int elem = listOfNumbers.get(i);
            if (elem > max){
                max = elem;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(searchMaxNumber(null));

    }
}
