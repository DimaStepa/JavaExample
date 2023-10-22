package RedRover.M20_HW;

import java.util.List;

public class M20_HW {

    public static void main(String[] args) {

        List<String> list = List.of("каждый", "охотник");
        System.out.println(UtilsHW.flatStringList(list));
        System.out.println(UtilsHW.flatStringListStream(list));
//        System.out.println(UtilsHW.flatStringList(List.of(List.of(1,2,3), List.of(4,5,6)), String::valueOf));
        System.out.println("=======");
        List<Integer> listInt = List.of(3, 0, -4, 2);
        System.out.println(UtilsHW.flattenInts(listInt));

        System.out.println(UtilsHW.maxNumber(UtilsHW.flattenInts(listInt)));

        List<List<Integer>> listInnerList = List.of(List.of(1,2,4), List.of(-10, 100,20), List.of(-10,-20,-22));

        System.out.println(UtilsHW.maxListList(listInnerList));

    }
}
