package RedRover.M14_L;

public class Person implements IName {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person(String name, int age){
            this.name = name;
            this.age = age;
        }


    @Override
    public String getName() {
        return name;
    }
}
