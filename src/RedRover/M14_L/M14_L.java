package RedRover.M14_L;

import java.util.*;

public class M14_L {

    //nested
    public static class N{
    }

    //Inner - нельзя создать без объекта класса контейнера (main)
    public class I{
    }

    public static void printName (IName named){
        System.out.println(named.getName());
    }





    public static void main(String[] args) {

//        final  N n = new N();
//
//        M14_L m = new M14_L();
//        I i = m.new I();

        Pet pet = new Pet("dog", "Lucy");
        Person person = new Person("Sergey", 30);

        printName(pet);
        printName(person);

        System.out.println("----------");
        IName[] arr = new IName[]{pet,person};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }

        System.out.println("-----------");

        List <Person> pList = new ArrayList<>();
        pList.add( new Person("Kostic", 30));
        System.out.println(pList.get(0).getName());

        List <String> sList = new ArrayList <>();
        sList.add("sergey");
        sList.add("ANNA ASTI");
        sList.add("ANNA ASTI");
        sList.add("Lucy");

        System.out.println(sList);

        sList.remove(3);

        System.out.println(sList);

        System.out.println("-----------");

        Set<String> set = new HashSet<>();
        set.add("ANton");
        set.add("Olga");
        set.add("Luda");
        set.add("Luda");
        System.out.println(set);
        set.contains("Luda");

        System.out.println("-----------");

        Map<String, Integer> map = new HashMap<>();
        map.put("Pavel", 30);
        map.put("Larisa", 50);
        map.put("ANNA ASTI", 33);
        map.put("Artic",34);
        map.put("Larisa", 21);
        System.out.println(map);
    }

}
