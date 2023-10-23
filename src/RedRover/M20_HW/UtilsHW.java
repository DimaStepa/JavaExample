package RedRover.M20_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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

    public static int maxListList(List<List<Integer>> source) {
        int result = Integer.MIN_VALUE;
        for (List<Integer> list1 : source) {
            for (Integer integer : list1) {
                if (result < integer) {
                    result = integer;
                }
            }
        }
        return result;
    }

    //переделелал домашку отсюда
    public static <SOURCE, RESULT> List<RESULT> flatten(List<SOURCE> source, TransformHW<SOURCE, RESULT> transformHW) {
//Можно использовать интерфейс Funciton и метод apply
        List<RESULT> results = new ArrayList<>();
        for (SOURCE element : source) {
            results.addAll(transformHW.transformOriginal(element));
        }
        return results;
    }

    public static <T extends Comparable<T>> T maxNumber(List<List<T>> source) {
        List<T> allListInts = flatten(source, (List<T> list) -> list);
        return getMax(allListInts);
    }

    public static <T extends Comparable<T>> T getMax(List<T> source) {
        if (source.isEmpty()) {
            throw new IllegalArgumentException("ЧТО ПРОИСХОДИТ");
        }
        T currentMax = source.get(0);
        for (T element : source) {
            if (element.compareTo(currentMax) > 0) {
                currentMax = element;
            }
        }
        return currentMax;
    }

    public static <T> List<T> filter(List<T> source, Predicate<T> yesOrNo) {
        List<T> result = new ArrayList<>();
        for (T element : source) {
            if (yesOrNo.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> Splitted<T> splitLists(List<T> source, Predicate<T> yesOrNo) {
        List<T> passed = new ArrayList<>();
        List<T> rejected = new ArrayList<>();
        for (T element : source) {
            if (yesOrNo.test(element)) {
                passed.add(element);
            }
            else {
                rejected.add(element);
            }
        }
        return new Splitted<>(passed, rejected);
    }

    public static <T> void foreach(List<T> source, Consumer<T> consumer) {
        for (T element: source) {
            consumer.accept(element);
        }
    }

}

class Splitted<T> {
    private final List<T> passed;
    private final List<T> rejected;

    Splitted(List<T> passed, List<T> rejected) {
        this.passed = passed;
        this.rejected = rejected;
    }
    public String toString() {
        return "Passed: " + passed + ", Rejected: " + rejected;
    }
}
