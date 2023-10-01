package RedRover.M16_L;

public class Yokozuna implements Comparable<Yokozuna>{
  // класс Yokozuna имплементирует интерфейс Comparable, который проводить сравнение
    private final String name;

    private final int weight;

    public Yokozuna(String name, int age) {
        this.name = name;
        this.weight = age;
    }

    @Override
    public int compareTo(Yokozuna o) {
        // o - это other
        return String.CASE_INSENSITIVE_ORDER.compare(name, o.name);
    }

    public String toString (){
        return "{" + name + ", " + weight + "}";
    }



}
