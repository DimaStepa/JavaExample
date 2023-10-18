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

    }
}
