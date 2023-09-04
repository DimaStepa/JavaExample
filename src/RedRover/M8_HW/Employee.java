package RedRover.M8_HW;

public class Employee {

    String setName;
    int setBaseSalary;


    public String getName(){
        return setName;
    }
    public int getBaseSalary(){
        return setBaseSalary;
    }

    public int getSalary(){
        return setBaseSalary*8*21;
    }




}
