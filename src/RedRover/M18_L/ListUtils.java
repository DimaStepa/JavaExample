package RedRover.M18_L;

import java.util.List;

public class ListUtils {

    public static Integer findMax(List<Integer> list) {
        Decider<Integer> isMore = new Decider<Integer>() {
            @Override
            public boolean isBetter(Integer first, Integer second) {
                return first > second;
            }
        };
        return findBest(list, Integer.MIN_VALUE,isMore);
    }

    public static Integer findMin(List<Integer> list) {
        Decider<Integer> isLess = new Decider<Integer>() {
            @Override
            public boolean isBetter(Integer first, Integer second) {
                return first < second;
            }
        };
        return findBest(list, Integer.MAX_VALUE,isLess);
    }

    public static <T>T findBest(List<T> list, T initialValue, Decider<T> decider) {
        T accum = initialValue;
        for (T e : list) {
            if (decider.isBetter(e, accum)) {
                accum = e;
            }
        }
        return accum;
    }
}

