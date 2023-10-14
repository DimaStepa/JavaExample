package RedRover.M20_L;

import RedRover.M14_L.M14_L;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Integer> myltiplyByTwo (List<Integer> source){
//        Transformer<Integer> timesTwo = new Transformer<Integer>() {
//            @Override
//            public Integer transformOriginal(Integer original) {
//                return original*2;
//            }
//        };
        // лямба используется, только объек имплементирует один интерфейc, в котором указан один метод
        Transformer<Integer> timesTwo = (Integer original) -> original * 2;
        return transformList(source, timesTwo);
    }

    public static List<Integer> addTen (List<Integer> source){

        //По сути тут мы создаемы новый анонимный класс (у него нет имени),
        // который имплементирует интерфейс, и создали инстанс это класса
        //class PlusTenTransformer implements Transformer<Integer> {
        Transformer<Integer> plusTen = new Transformer<Integer>() {
            @Override
            public Integer transformOriginal(Integer original) {
                return original + 10;
            }
        };
        //PlusTenTransformer plusTen = new PlusTenTransformer();
        return transformList(source, plusTen);
    }

    public static List<String> firstLetter (List<String> source){
//        Transformer<String> getFirstLetter = new Transformer<String>() {
//            @Override
//            public String transformOriginal(String original) {
//                return String.valueOf(original.charAt(0));
//            }
//        };
        return transformList(
                source,
                original -> String.valueOf(original.charAt(0)));
    }

    public static <T> List<T> transformList (List<T> source, Transformer<T> transformer){
        List<T> result = new ArrayList<>();
        for (T currentElement: source) {
            T elementAfterTransformation = transformer.transformOriginal(currentElement);
            result.add(elementAfterTransformation);
        }
        return result;
    }

    public static List<Integer> onlyNegatives(List<Integer>source){
        Checker<Integer> checker = (Integer number) -> number < 0;
        return filterList(source, checker);
    }

    public static <T> List<T> filterList (List<T> source, Checker<T> checker){
        List<T> result = new ArrayList<>();
        for (T currentElement: source) {
            if (checker.check(currentElement)){
                result.add(currentElement);
            }
        }
        return result;
    }

}
