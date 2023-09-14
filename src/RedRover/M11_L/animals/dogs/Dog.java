package RedRover.M11_L.animals.dogs;

import RedRover.M11_L.animals.Animal;

public class Dog extends Animal {

    public Dog(){
        super("Собачка");
    }

    protected Dog (String name){
        super(name);
    }

    public void say(){
        System.out.println(name + " Dog says: Wov-wov");
    }

    public void bark(){
        say();
    }
}
