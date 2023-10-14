package RedRover.M20_L;

import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(11,13,45, -9, 20, -33);

        System.out.println(numbers);
        System.out.println(Utils.myltiplyByTwo(numbers));
        System.out.println(Utils.addTen(numbers));

        System.out.println(Utils.filterList((numbers),number-> number % 2 ==0 ));
        System.out.println(Utils.onlyNegatives(numbers));

        List<String> strings = List.of("каждый", "охотник", "желает", "знать", "где", "сидит", "фазан");

        System.out.println(Utils.firstLetter(strings));
    }
}
