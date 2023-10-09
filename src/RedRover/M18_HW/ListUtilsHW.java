package RedRover.M18_HW;

import java.util.List;

public class ListUtilsHW {

    public static Integer findMax (List<Integer> listMax){
        Integer acum = listMax.get(0);
        DeciderHW<Integer> isLess = new DeciderHW<Integer>() {
            @Override
            public boolean isBetter(Integer firstValue, Integer secondValue) {
                return firstValue > secondValue;
            }
        };
        return findBetter(listMax, isLess);
    }
    public static Integer findMin (List<Integer> listMin){
        Integer acum = listMin.get(0);
        DeciderHW <Integer> isMore = new DeciderHW<Integer>() {
            @Override
            public boolean isBetter(Integer firstValue, Integer secondValue) {
                return firstValue < secondValue;
            }
        };
        return findBetter(listMin, isMore);
    }

    public static <T> T findBetter (List <T> list, DeciderHW <T> decider){
        T acum = list.get(0);
        for (T e : list) {
            if (decider.isBetter (e,acum)) {
                acum = e;
            }
        }
        return acum;
    }



}
