package RedRover.M9_HW;

import java.util.Arrays;

public class SearchUtils {

    public static Employee searchName (Employee[] employee, String name){
        for (int i = 0; i < employee.length; i++) {
            Employee human = employee[i];
            if (human.getName().equals(name)){
                System.out.println("Такое имя есть - " + human.getName());
                return human;
            }
        }
        return null;
    }


}
