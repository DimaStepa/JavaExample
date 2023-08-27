package ItProger;

public class ZooMagazine {

    public int pet;
    public int age;
    public String color;
    public String character;

    public void setValuePet(int _pet, int _age, String _color, String _character ){
        pet = _pet;
        age = _age;
        color = _color;
        character = _character;
    }

    public String getValuePet(){
        String infoPert = "Age:" + age;

        return infoPert;
    }

}
