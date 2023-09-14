package RedRover.M11_L.animals.cats;

import RedRover.M11_L.animals.Animal;

public class Cat extends Animal {


    public Cat() {
        super("Koska");
    }

    protected Cat(String name){
        super(name);
    }

    public void say(){
        System.out.println(name + " Cat says: Meow-meow");
    }

    public void jump(){
        System.out.println(name + " CAT jump very hight");
    }
}
