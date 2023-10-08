package RedRover.M18_L;

import java.util.Arrays;
import java.util.List;

public class M18_L {

    public static void doSomething (Month month){
        System.out.println(month);
    }

    public static Month fromName(String name){
        return Month.valueOf(name);
    }
    public static void main(String[] args) {

/**
 * Рассмотрение работы c enum
 */
 //region ENUM
       Month month = Month.MARCH; //это нам дает того, что любой другой пользовать не пошлет значение которое мы не ожидаем
        doSomething(month);
        System.out.println(fromName("APRIL"));
        System.out.println(Arrays.toString(Month.values()));

        System.out.println(Month.MAY == Month.valueOf("MAY"));

        System.out.println(Month.SEPTEMBER.getNumOfDays());
//        System.out.println(fromName("ONONO"));

//endregion

        List <Integer> ints = List.of(1,3,-90, 200,31);
        System.out.println(ListUtils.findMax(ints));
        System.out.println(ListUtils.findMin(ints));

        List<String> months = List.of("JAN", "FEBR", "DECEMB", "MAY");
        Decider<String> isLonger = new Decider<String>() {
            @Override
            public boolean isBetter(String first, String second) {
                return first.length() > second.length();
            }
        };

        System.out.println(ListUtils.findBest(months, "", isLonger));

    }

}
