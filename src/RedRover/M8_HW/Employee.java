package RedRover.M8_HW;

public class Employee extends DataBase {

    String name;
    int setBaseSalary;

    int setNumberOfSubordinates;


//    public static void fuu() {
//    }


    public String getName(){

        return name;
    }

    public int getNumberOfSubordinates (){
        return setNumberOfSubordinates;

    }
    
//    public void setName(String name){
//        this.name = name;
//    }
    
    public int getBaseSalary(){
        return setBaseSalary;
    }

    public double getSalary(){
        return setBaseSalary*8*21.0;
    }




}
