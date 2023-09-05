package RedRover.M8_HW;

public class Manager extends DataBase{

    int setNumberOfSubordinates;
    public int getBaseSalary(){
        return setBaseSalary;
    }

    int setBaseSalary = 123;
    String name;



    public String getName(){
        return name;
    }

    public int getNumberOfSubordinates (){
        return setNumberOfSubordinates;

    }

    public double getSalary(){
        if (setNumberOfSubordinates > 0) {
            return setBaseSalary * (setNumberOfSubordinates * 3.0 / 100);
        }else {
            return setBaseSalary;
        }
    }

}
