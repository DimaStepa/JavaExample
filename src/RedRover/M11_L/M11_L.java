package RedRover.M11_L;

import RedRover.M11_L.animals.*;
import RedRover.M11_L.animals.cats.Cat;
import RedRover.M11_L.animals.cats.Manul;
import RedRover.M11_L.animals.dogs.Dog;
import RedRover.M11_L.animals.dogs.Husky;
import RedRover.M11_L.grade.Grades;

public class M11_L {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Giraffe giraffe = new Giraffe();
        Husky husky = new Husky();

        Animal[] animals = {cat, dog, husky, new Manul()};

        for (Animal animal : animals) {   //animal - это новая переменная, которой на каждом шаге присваивается элемент массива animals , т.е.: Animal animal = animals[i]
            animal.say();
            if (animal instanceof Cat){  // это приведение типа
                ((Cat) animal).jump();

            }
        }

        Dog[] dogs = {dog, husky};
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark();
        }
        new Manul().jump();


        Grades five = new Grades(5 );
        System.out.println(five.getValue());
        Grades ten = new Grades(10);
        System.out.println(ten.getValue());


        Animal[] animalsAll = {
                new Cat(),
                new Dog()
        };



        }

    }

