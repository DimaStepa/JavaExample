package RedRover.M11_L.animals.dogs;

import RedRover.M11_L.animals.dogs.Dog;

public class Husky extends Dog {

    public Husky(){
        super("Хаски");
    }

    @Override
    public void say(){
        System.out.println(name + " Husky says: AAAAAAAAA");
    }
}
