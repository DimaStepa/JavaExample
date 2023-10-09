package RedRover.M18_HW;

import RedRover.M18_L.Decider;

import java.util.Arrays;
import java.util.List;

public class M18_HW {

    public static void main(String[] args) {

        List<Integer> list = List.of(-1, 5, -90, 200, 43, -3);
        List<String> stringList = List.of("xyz", "decemder234561", "mama", "portofino", "aaaahh");

        DeciderHW<Integer> isMax = new DeciderHW<Integer>() {
            @Override
            public boolean isBetter(Integer firstValue, Integer secondValue) {
                return firstValue > secondValue;
            }
        };

        DeciderHW<String> isLonger = new DeciderHW<String>() {
            @Override
            public boolean isBetter(String firstValue, String secondValue) {
                return firstValue.length() > secondValue.length();
            }
        };
        DeciderHW<EnumList> isMinIndex = new DeciderHW<EnumList>() {
            @Override
            public boolean isBetter(EnumList firstValue, EnumList secondValue) {

                return firstValue.ordinal() < secondValue.ordinal();
            }
        };

        System.out.println(ListUtilsHW.findBetter(list, isMax));
        System.out.println(ListUtilsHW.findBetter(stringList, isLonger));


        System.out.println(Arrays.toString(EnumList.values()));
//        System.out.println(ListUtilsHW.findBetter(EnumList.values(), isMinIndex));

    }

}
