package RedRover.M8_HW;

public class Manager {

    int setNumberOfSubordinates;
    String Name;

    public int getNumberOfSubordinates (){
        return setNumberOfSubordinates;

    }

    public double getSalary(){
        int setBaseSalary = 123;
        if (setNumberOfSubordinates > 0) {
            return setBaseSalary * (setNumberOfSubordinates * 3.0 / 100);
        }else {
            return setBaseSalary;
        }
    }

}
