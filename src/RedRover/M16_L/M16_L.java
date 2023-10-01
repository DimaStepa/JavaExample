package RedRover.M16_L;

import java.util.*;

public class M16_L {


    static List<Integer> onlyPositive (List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for(Integer i : list){
            if (i>0){
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        //работа с list
        List<String> inmutable = List.of("fdfndm", "gfnfnmg", "hfjdfjndfnd"); // List.of - список, который нельзя изменить
        List <Integer> l = Arrays.asList(1,-2,3,-22);
        List<String> strings = List.of("one", "two");
        List<String> notSortedString = Arrays.asList("aaa", "xxxx", "ccc", "----", "   ");

        System.out.println(onlyPositive(l));

        l.sort(Comparator.naturalOrder());
        System.out.println(l);

        notSortedString.sort(Comparator.naturalOrder());
        System.out.println(notSortedString);

        List<Yokozuna> wrestlers  = Arrays.asList(new Yokozuna( "Чехотка", 200),
                new Yokozuna("Басе", 190),
                new Yokozuna("Мацуа", 250));
        wrestlers.sort(Comparator.reverseOrder());
        System.out.println(wrestlers);


        //работа с set (только уникальные значение, порядок элементов не гарантирован никак)
        System.out.println("---Работа с set-----");
        Set<Integer> ints = new HashSet<>();
        ints.add(1);
        ints.add(3);
        ints.add(10);
        ints.add(11);
        ints.add(3);
        ints.add(1);

        System.out.println(new HashSet<>(ints));

        //СПИСОК ФИКСИРОВАННОЙ ДЛИНЫ (объект типа очередь)
        System.out.println("----Deque----");
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(1);
        System.out.println(queue);
        queue.addLast(2);
        System.out.println(queue);
        queue.addLast(3);
        System.out.println(queue);
        System.out.println(queue.removeLast());
        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue);


        //работа с  мар
        System.out.println("---работа с маp----");
        Likes likes = new Likes();
        likes.printable();
        likes.addLike("heart");
        likes.printable();
        likes.addLike("heart");
        likes.printable();
        likes.addLike("care");
        likes.printable();

        System.out.println(likes.getTotalLikes());
        likes.printTypes();

        Map<Yokozuna, List<Yokozuna>> wins = new HashMap<>();
        
        System.out.println(wins);



    }
}
