package RedRover.M7;

public class Salary {


    static int getSum(Employee[] employeeArray){
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum = sum + employeeArray[i].salary;
        }
        return sum;
    }
}
