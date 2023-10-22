package RedRover.M20_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class UtilsHW {

    public static <E, R, T extends Iterable<E>> List<R> flatStringList(List<T> list, Function<E, R> transformValue) {
        List<R> result = new ArrayList<>();
        for (T iterable : list) {
            for (E element : iterable) {
                result.add(transformValue.apply(element));
            }
        }
        return result;
    }

    public static List<String> flatStringList(List<String> source) {
        List<String> result = new ArrayList<>();
        for (String str : source) {
            for (int i = 0; i < str.length(); i++) {
                result.add(String.valueOf(str.charAt(i)));
            }
        }
        return result;
    }

    public static List<String> flatStringListStream(List<String> source) {
        return source.stream()
                // исходными данными для выполнения операции является результат предыдущей операции
                .flatMapToInt(String::codePoints) // перебор каждого элемента source и получение int stream
                .mapToObj(i -> String.valueOf((char) i)) // возвращаем stream String'ов
                .collect(Collectors.toList()); //собрать все что есть в стриме и выдать список
    }

    public static List<Integer> flattenInts(List<Integer> source) {
        List<Integer> checker = new ArrayList<>();
        for (Integer newElement : source) {
            if (newElement > 0) {
                for (int i = 1; i < newElement + 1; i++) {
                    checker.add(i);
                }
            } else if (newElement < 0) {
                for (int i = newElement; i < 0; i++) {
                    checker.add(i);
                }
            }
        }
        return checker;
    }

    public static int maxNumber(List<Integer> list) {
        int e = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (e < list.get(i)) {
                e = list.get(i);
            }
        }
        return e;
    }

    public static int maxListList(List<List<Integer>> source) {
        int result = Integer.MIN_VALUE;
        for (List<Integer> list1 : source) {
            for (int i = 0; i < list1.size(); i++) {
                if (result < list1.get(i)) {
                    result = list1.get(i);
                }
            }
        }
        return result;
    }
}
