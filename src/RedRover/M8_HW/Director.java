package RedRover.M8_HW;

public class Director extends DataBase {

    int setNumberOfSubordinates;
    String name;

    public String getName(){

        return name;
    }

    public int getNumberOfSubordinates (){
        return setNumberOfSubordinates;

    }

    public double getSalary(){
        int setBaseSalary = 123;
        if (setNumberOfSubordinates > 0) {
            return setBaseSalary * (setNumberOfSubordinates * 9.0 / 100);
        }else {
            return setBaseSalary;
        }
    }

}
