package RedRover.M7;

import java.util.ArrayList;
import java.util.Arrays;

public class M7_HW {


    public static void main(String[] args) {

/*
Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом
“Mr. ” - если пол указан как мужской и префикс “Mrs. ” - если женский.
 */

        Person person = new Person();
        System.out.println(person.getName("alla", 35, "male"));
        System.out.println(person.age);


/*
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true,
если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
 */
        Employee employee1 = new Employee();
        employee1.name = "Albert";
        employee1.salary = 10;

        Employee employee2 = new Employee();
        employee2.name = "Albert";
        System.out.println(employee2.isSameName(employee1));
        employee2.salary = 30;


        /*
        Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
        метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
         */

        Employee[] employees = new Employee[] {employee1, employee2};
        System.out.println(Salary.getSum(employees));


    }

}
