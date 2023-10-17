package RedRover.M20_HW;

import java.util.ArrayList;
import java.util.List;


public class UtilsHW {

    public static <T> List<T> moveList (List<T> list, TransformHW<T> transformValue){
        List<T> result = new ArrayList<>();
        for (T currentElement: list) {
            T elementAfterTransformation = transformValue.transformOriginal(currentElement);
            result.add(elementAfterTransformation);
        }
//        List <T> wordStream = result
//                .stream()
//                .flatMapToInt(line -> line.getClass().getResourceAsStream())
//                .collect(Collectors.toList());
        return result;
    }

    public static List<String> listToChars (List<String> source){
        return moveList(
                source, original -> {
                    List<Character> chars = new ArrayList<>();
                    for (char ch: original.toCharArray()) {
                        chars.add(ch);
                    }
                    return chars.toString();
                });
    }

//    public static <T> List<T> filterListInteger (List<T> source, List<T> checker){
//        List<T> result = new ArrayList<>();
//        for (T currentElement: source) {
//            if (checker.check(currentElement)){
//                result.add(currentElement);
//            }
//        }
//        return result;
//    }

    public static List<Integer> flattenInts(List<Integer>source){
        List<Integer> checker = new ArrayList<>();
        for (Integer newElement: source) {
            if (newElement > 0) {
                for (int i = 1; i < newElement+1; i++) {
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





}
