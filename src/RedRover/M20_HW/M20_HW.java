package RedRover.M20_HW;

import java.util.List;

public class M20_HW {

    public static void main(String[] args) {

        List<String> list = List.of("каждый", "охотник");
        System.out.println(UtilsHW.listToChars(list));

        List<Integer> listInt = List.of(3, 0, -4, 2);
        System.out.println(UtilsHW.flattenInts(listInt));

    }
}
