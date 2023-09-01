package RedRover.M7;

public class Person {

    String name;

    int age;

    String gender;

    public String getName(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (gender.equals("male")) {
            return "Mr. " + name + "! Hello!";
        } else
            if (gender.equals("female")) {
            return "Mrs. " + name + "! Hello!";
        }
        else {
            return "You are not human";
        }
    }
}


