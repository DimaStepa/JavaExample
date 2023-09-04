package RedRover.M8_HW;

public class M8_HW {

    public static void main(String[] args) {

        Employee footballer = new Employee();
        footballer.setName = "John Don";
        footballer.setBaseSalary = 500;
        System.out.println("Employee: " + footballer.getName()+
                ".\nHis/Her get base salary for hour: " + footballer.getBaseSalary() +
                " Rub/hour. \nHis/her salary for month: " + footballer.getSalary() + " Rub.");

        System.out.println("------------------");

        Worker layer = new Worker();
        System.out.println("Base salary of worker is " + layer.getSalary() +
                " rub/hour.");

        System.out.println("------------------");

        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        manager1.Name = "Pirogi And Cotlety";
        manager2.Name = "Dochki Sinochki";
        manager1.setNumberOfSubordinates = 21;
        manager2.setNumberOfSubordinates = 0;
        System.out.println("Numbers of subordinates is " + manager1.Name +
                ": " + manager1.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + manager1.Name +
                ": " + manager1.getSalary());
        System.out.println("Numbers of subordinates is " + manager2.Name +
                ": " + manager2.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + manager2.Name +
                ": " + manager2.getSalary());

        System.out.println("------------------");

        Director director1 = new Director();
        Director director2 = new Director();
        director1.Name = "Pirogock";
        director2.Name = "Sinochkin";
        director1.setNumberOfSubordinates = 109;
        director2.setNumberOfSubordinates = 1;
        System.out.println("Numbers of subordinates is " + director1.Name +
                ": " + director1.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + director1.Name +
                ": " + director1.getSalary());
        System.out.println("Numbers of subordinates is " + director2.Name +
                ": " + director2.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + director2.Name +
                ": " + director2.getSalary());

        System.out.println("------------------");





    }
}
