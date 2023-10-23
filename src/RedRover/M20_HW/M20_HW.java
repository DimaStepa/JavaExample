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

        List<List<Integer>> listInnerList = List.of(List.of(1,2,4), List.of(-10, 100,20), List.of(-10,-20,-22));

        System.out.println(UtilsHW.maxListList(listInnerList));

        System.out.println(UtilsHW.maxNumber(listInnerList));

//Рассматриваем интерфейс Predicant
// Вместо интерфейса TransformerHW можно использовать интерфейс Function
// для каждого элемента х списка listInt если он < 0, то возвращаем тру
        System.out.println(UtilsHW.filter(listInt, x -> x < 0));

// Разносим значения списка listInt в 2 разных списка 1-го вложенного
// для каждого элемента х списка listInt если он < 0, то возвращаем тру
        System.out.println(UtilsHW.splitLists(listInt, x -> x < 0));

// Рассматриваем интерфейс Consumer
        UtilsHW.foreach(List.of(1,2,-5,6,-90), i->{
            if (i>0){
                System.out.println(i);
            }
            else {
                System.out.println(-1*i);
            }
        });

    }
}
