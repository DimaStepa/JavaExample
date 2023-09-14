package RedRover.M11_L.animals.dogs;

import RedRover.M11_L.animals.Animal;

public class Dog extends Animal {

    public void say(){
        System.out.println("Dog says: Wov-wov");
    }

    public void bark(){
        say();
    }
}
